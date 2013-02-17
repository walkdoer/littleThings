(function(window, document, undefined) {
    "use strict";

    var head = document.getElementsByTagName('head')[0];
    var modules = {};
    var injects = {};
    var callbacks = {};

    /*
     * 检查模块是否已经注册，没有注册就运行代码，将返回结果存入内存中
     * 对callback模块进行检查，
     *
     */
    var registerModule = function(id, callback, args) {
        var key, i, l, deps;
        if(!modules[id]) {
            //没有模块则运行代码后，将返回值存入内存中
            modules[id] = callback.apply(null, args);
            //删除该代码块，因为该模块的代码已经运行成功
            delete(callbacks[id]);
        }
        loop: for(key in callbacks) {
            deps = [];
            for(i = 2, l = callbacks[key].length; i < l; i++) {
                if(modules[callbacks[key][i]]) {
                    //如果依赖的模块已经加载，则放入依赖数组中，传递给callback
                    deps.push(modules[callbacks[key][i]]);
                } else {
                    //出现模块未加载，则回到loop，检查下一个模块
                    continue loop;
                }
            }
            if(callbacks[key][0]) {
                //如果模块是define的，那么会注册该模块
                registerModule(key, callbacks[key][1], deps);
            } else {
                //如果是require，那么将会直接执行函数
                callbacks[key][1].apply(null, deps);
                delete(callbacks[key]);
            }
        }
    };

    var injectModule = function(id) {
        var node;
        if(!injects[id]) {
            node = document.createElement('script');
            node.type = 'text/javascript';
            node.async = 'true';
            node.src = 'js/' + id.replace(':','.') + '.js';
            node.onload = function() {
                head.removeChild(node);
            };
            injects[id] = true;
            head.appendChild(node);
        }
    };

    var defineModule = function(id, dependencies, callback) {
        var i, l = dependencies.length;
        if(l === 0) {
            //如果没有依赖，就直接注册模块
            registerModule(id, callback, []);
        } else {
            callbacks[id] = [true, callback].concat(dependencies);//true表示define
            //注入模块
            for(i = 0; i < l; i++) {
                injectModule(dependencies[i]);
            }
        }
    };

    var requireModule = function(dependencies, callback) {
        var id, i, l = dependencies.length;
        if(l === 0) {
            //没有依赖，直接允许代码块
            callback();
        } else {
            id = 'require/' + setTimeout('1', 0);//setTimeout("数字",0) 生成一个递增的数字
            callbacks[id] = [false, callback].concat(dependencies);//fase表示require
            for(i = 0; i < l; i++) {
                injectModule(dependencies[i]);
            }
        }
    };

    var init = function() {
        //var config = document.createElement('script');
        window.define = defineModule;
        window.require = requireModule;
        /*
        config.type = 'text/javascript';
        config.async = 'true';
        config.src = document.getElementsByTagName('script')[0].getAttribute('data-main') + '.js';
        config.onload = function() {
            head.removeChild(config);
        };
        head.appendChild(config);*/
    };

    init();

})(window, document);
$(function () {
    'use strict';
    var $regexp = $('#regex'),
        $testBtn = $('#test'),
        $testAllBtn = $('#test-all'),
        $params = $('#params'),
        $source = $('#source'),
        $result = $('#result'),
        $template = $('#template'),
        $code = $('#code'),
        regexpConfig = {},
        regexp = 'regexp',
        template = 'template',
        source = 'source',
        params = 'params';
    //初始化数据
    $regexp.val(localStorage.getItem(regexp));
    $params.val(localStorage.getItem(params));
    $source.val(localStorage.getItem(source));
    $template.val(localStorage.getItem(template));
    $source.on('keyup', function () {
        localStorage.setItem(source, $source.val());
    });
    $template.on('keyup', function () {
        localStorage.setItem(template, $template.val());
    });
    $regexp.on('keyup', function () {
        localStorage.setItem(regexp, $regexp.val());
    });
    $params.on('keyup', function () {
        localStorage.setItem(params, $params.val());
    });
    $testBtn.click(function () {
        var source = $source.val(),
            match, lines, line, isFind = false,
            i, j, len, resultStr = '',
            params = $params.val(),
            reg = new RegExp($regexp.val(), params);

        lines = source.split('\n');
        $result.html('');
        for (j = 0, len = lines.length; j < len; j++) {
            line = lines[j];
            match = line.match(reg);
            if (match) {
                isFind = true;
                for (var i = 0; i < match.length; i++) {
                    resultStr += '\n-------match[' + i + ']----[' + RegExp.$4 + ']-\n';
                }
            }
        }
        if (isFind) {
            $result.html(resultStr);
        } else {
            $result.html('find nothing');
        }

    });

    $testAllBtn.click(function () {
        var source = $source.val(),
            match, resultStr = '', regexp,
            classObj = {},
            codeStr,
            className,
            propertys = [],
            i, len, params = $params.val(),
            regData = $regexp.val();
        initRegExp(regData, params);
        for (var key in regexpConfig) {
            if (regexpConfig.hasOwnProperty(key)) {
                regexp = regexpConfig[key];
                match = source.match(regexp);
                len = match.length;
                resultStr += '\n***[' + key + '共有' + len + '个]****\n';
                for (i = 0; i < len; i++) {
                    resultStr += match[i] + '\n';
                    if (key === 'various') {
                        propertys.push(getProperty(match[i], regexp));
                    } else if (key === 'class') {
                        className = getClassName(match[i], regexp);
                    }
                }

            }
        }
        $result.html(resultStr);
        classObj.className = className;
        classObj.propertys = propertys;
        codeStr = generateCode(classObj);
        $code.html(codeStr);
    });

    function getProperty(data, regex) {
        data.match(regex);
        return RegExp.$4;
    }

    function getClassName(data, regex) {
        data.match(regex);
        return RegExp.$2;
    }
    function initRegExp(data, params) {
        var i, len, lines, value, line, pos, key;
        lines = data.split('\n');
        for (i = 0, len = lines.length; i < len; i++) {
            line = lines[i];
            pos = line.indexOf('=');
            key = line.substr(0, pos).trim();
            value = line.substr(pos + 1).trim();
            regexpConfig[key] = new RegExp(value, params);
        }
    }

    function generateCode(classObj) {
        var propertys, property, codeStr, arrayStr = '',
            arrBlock = '[<%=array%>]',
            objblock = '{name:"<%=name%>"}';
        if (!classObj) {
            return;
        }
        codeStr = "case " + classObj.className + ':\nfield = <%=fieldArray%>';
        propertys = classObj.propertys;
        for (var i = 0; i < propertys.length; i++) {
            property = propertys[i];
            arrayStr += objblock.replace('<%=name%>', property) + ',\n';
        }
        arrBlock = arrBlock.replace('<%=array%>', arrayStr);
        codeStr = codeStr.replace('<%=fieldArray%>', arrBlock);
        return codeStr;
    }
});
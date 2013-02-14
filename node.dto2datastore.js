/**
 * DTO 转化为Ext Portal DataStore配置文件
 * @author andrew - zhangmhao@gmail.com
 * @create-time 2012-12-13 12:24:06
 */

'use strict';
var fs = require('fs'),
    sys = require("util"),
    path = require('path');
/**
 * 获取当前路径
 * @return String 当前路径
 */
function getCurrentPath() {
    var pwd = fs.realpathSync('.');
    return path.normalize(pwd.replace(/\\/g, '/'));
}

/**
 * 获取文件列表
 * @param  {String} root     根目录
 * @param  {String} fileType 文件类型
 * @return {Array}          文件列表
 */
function getFileList(root, fileType) {
    var list = [],
        files = fs.readdirSync(root);
    files.forEach(function (file) {
        var pathName = root + '/' + file,
            stat;
        //判断文件类型
        if (fileType && file.lastIndexOf(fileType) + fileType.length !== file.length) {
            return;
        }
        stat = fs.lstatSync(pathName);
        if (!stat.isDirectory()) {
            list.push(pathName.replace());
        } else {
            list = list.concat(getFileList(pathName, fileType));
        }
    });
    return list;
}
/////////////////////////////////////////////////
////main
var userPath = process.argv[2],
    defaultConfig = {
        writeFile: 'fileList.txt'
    },
    pwd,
    fileList,
    writePath;

pwd = getCurrentPath() + '/' + userPath;
writePath = pwd + '/' + defaultConfig.writeFile;
console.log('\n\n');
console.log('*******当前目录:' + pwd + '*******');
fileList = getFileList(pwd);

for (var i = 0; i < fileList.length; i++) {
    console.log('--' + fileList[i]);
    fs.watchFile(fileList[i], function (curr, prev) {
        /*
        {
            dev: 0,
            mode: 33206,
            nlink: 1,
            uid: 0,
            gid: 0,
            rdev: 0,
            ino: 0,
            size: 436,
            atime: Thu Dec 13 2012 16:31:02 GMT+0800 (中国标准时间),
            mtime: Thu Dec 13 2012 16:43:20 GMT+0800 (中国标准时间),
            ctime: Thu Dec 13 2012 16:31:02 GMT+0800 (中国标准时间)
        }
         */
        sys.puts("\tThe current mtime is: " + curr.mtime);
        sys.puts("\tThe previous mtime was: " + prev.mtime + "\n");
    });
}
//写入文件列表信息的内容
console.log(writePath);
var w_content = fileList.join('\n');
fs.readFile(writePath, function (err) {
    if (err && err.errno === 33) {
        fs.open(defaultConfig.writeFile, 'w', '0666', function (e, fd) {
            if (e) {
                throw e;
            }
            fs.write(fd, w_content, 0, 'utf8', function (e) {
                if (e) {
                    throw e;
                }
                fs.closeSync(fd);
            });
        });
    } else {
        fs.writeFile(writePath, w_content, 'utf8', function (e) {
            if (e) {
                throw e;
            }
        });
    }
});

function anlyseFile(content) {
    
}

function isProperty(line) {

}

function isMethod(line) {

}

function isClassName(line) {
    if (line.indexOf('pulbic class') {

    }
}






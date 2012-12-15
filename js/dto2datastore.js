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
            match, resultStr = '',
            i, len, params = $params.val(),
            regData = $regexp.val();
        initRegExp(regData, params);
        for (var key in regexpConfig) {
            if (regexpConfig.hasOwnProperty(key)) {
                match = source.match(regexpConfig[key]);
                len = match.length;
                resultStr += '\n***[' + key + '共有' + len + '个]****\n';
                for (i = 0; i < len; i++) {
                    resultStr += match[i] + '\n';
                }
            }
        }
        $result.html(resultStr);
    });

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
});
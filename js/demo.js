require(['demo:math', 'demo:string', 'demo:dom'], function (math, string, dom) {
	var node = dom.byId('node');
  dom.removeClass(node, 'big');
  dom.addClass(node, 'small');
  dom.addClass(node, 'red');
  node.innerHTML = string.concat(math.add(1, 2, 3, 4, 5), '--', math.multiply(4, 2, 5, 0.3));
});
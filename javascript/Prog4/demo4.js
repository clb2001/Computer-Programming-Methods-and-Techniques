// 计数器
var count = 0;
var counter = function () {
    ++count;
    return count;
}
console.log(counter());
console.log(counter());

var counter = new Object();
counter.count = 0;
counter.inc = function () {
    this.count++;
    return this.count;
}
console.log(counter.inc());
console.log(counter.inc());

var counter = function () {
    var count = 0;
    ++count;
    return count;
}
console.log(counter());
console.log(counter());

function counter() {
    var count = 0;
    var innerCounter = function () {
        ++count;
        return count;
    }
    return innerCounter();
}
console.log(counter());
console.log(counter());

// 闭包
function generateCounter() {
    var count = 0;
    var innerCounter = function () {
        ++count;
        return count;
    }
    return innerCounter;
}
var counter = generateCounter();
console.log(counter());
console.log(counter());
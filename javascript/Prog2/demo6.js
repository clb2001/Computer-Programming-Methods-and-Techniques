var a = 1;
function test() {
    var a = 2;
}
test();
console.log(a);

// // 感觉这是与C++不同的地方
// var a = 1;
// function test() {
//     a = 2;
// }
// test();
// console.log(a);

// // 只有把下面的代码注释掉才会输出1，否则都是2
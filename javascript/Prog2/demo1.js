// 五种数据类型
var a = 1;
var b = 'Hello World!';// 无双引号
var c = null;
var d = false;
var e; //undefined

// 尝试修改数据类型
var f = true;
var g = '1';
// 用Node.js单独运行js文件时，其中定义的alert不可用
// alert (e + f);
console.log(a + f);// 2
console.log(a + d);// 1
console.log(f + d);// 1
console.log(f + g);// true1
console.log(f + c);// 1

console.log(typeof(a + f));// num
console.log(typeof(a + d));// num
console.log(typeof(f + d));// num
console.log(typeof(f + g));// string
console.log(typeof(f + c));// num

// 复合数据类型：数组、对象
// === && !== 根据类型比较
// == && !=
// False: (0 == null) 
// True: (0 >= null), (0 <= null)
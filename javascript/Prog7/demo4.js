value = 0;
function func() {
    this.value = 1;
};
var obj = new func();
console.log(obj.value);// 构造函数调用
console.log(value);
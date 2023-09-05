value = 0;
function func() {
    this.value = 1;
};
var obj = new Object();
obj.value = 2;
obj.fn = func;
obj.fn();// 对象的方法调用
console.log(value);
console.log(obj.value);
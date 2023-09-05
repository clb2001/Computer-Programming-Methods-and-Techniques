// apply/call调用
value = 0;
function func() {
    this.value = 1;
};
var obj = new Object();
obj.value = 2;
func.apply(obj);// 将函数绑定在参数obj指定的上下文执行
console.log(obj.value);// 1
console.log(value);// 0
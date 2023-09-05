value = 0;
function func() {
    this.value = 1;// global
};
func();// 普通的函数调用
console.log(value);
value = 0;
function func() {
    this.value = 1;
};
new func();
console.log(value);

// 1 0
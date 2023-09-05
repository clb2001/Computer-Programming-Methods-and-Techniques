value = 0;
function func() {
    this.value = 1;
    function func2() {
        this.value = 3;
    }
    return func2;
};
var obj = new Object();
obj.value = 2;
obj.fn = func;
var func2 = obj.fn();
func2();
obj.fn2 = func2;
obj.fn2();
console.log(value);
console.log(obj.value);
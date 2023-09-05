var value = 'local';
var func = function () {
    var value = 'func_local';
    console.log(value);
}
func();
console.log(value);
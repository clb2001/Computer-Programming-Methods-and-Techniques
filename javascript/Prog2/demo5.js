var value = 'local';
var func = function () {
    if (false) {
        var value = 'func_local';
    }
    console.log(value);
}
func();
console.log(value);
// undefined
// local
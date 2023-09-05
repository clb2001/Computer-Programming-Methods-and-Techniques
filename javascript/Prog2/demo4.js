var value = 'global';
var func1 = function() {
    var value = 'local';
    var func2 = function () {
        console.log(value);
    }
    func2();
}
func1();
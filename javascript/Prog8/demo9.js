// 寄生组合继承
function derive(o) {
    function F() {
    }
    F.prototype = o;
    return new F();
}
function Animal(gender) {
    this.gender = gender;
}
Animal.prototype.getName = function () { return 'Animal'; };
function Dog(gender) {
    Animal.call(this, gender);
    // ...
}
var proto = derive(Animal.prototype);
proto.constructor = Dog;// constructor是一种用于创建和初始化class创建的对象的特殊方法. 类型判断也用constructor。
Dog.prototype = proto;
var pp = new Dog('male');
console.log(pp.gender);
console.log(pp.getName());
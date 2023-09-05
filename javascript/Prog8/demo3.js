function Animal() {
    this.gender = 'male';
}
function Dog() {
    this.talk = function () {
        console.log('I am a dog');
    };
}
Dog.prototype = new Animal();// 通过构造函数的prototype实现继承
var pp = new Dog();
// pp.gender = 'female';
// console.log(pp.talk());
console.log(pp.gender);
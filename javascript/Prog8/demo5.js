function Animal() {
    this.gender = 'male';
}
function Dog() {
    this.talk = function () {
        console.log('I am a dog');
    };
}
Dog.prototype = new Animal();
var pp1 = new Dog();
var pp2 = new Dog();
// pp1和pp2是否共享
// 同一个gender变量？
pp1.gender = "female";
console.log(pp2.gender)
function Animal() {
    this.gender = new Array();
}
function Dog() {
    this.talk = function () {
        console.log('I am a dog');
    };
}
Dog.prototype = new Animal();
var pp1 = new Dog();
var pp2 = new Dog();
pp1.gender.push('female');
pp2.gender.push('male');
// pp1和pp2是否共享同一个array？
console.log(pp1.gender);
console.log(pp2.gender);
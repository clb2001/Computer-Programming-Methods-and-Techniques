function Animal(gender) {
    this.gender = gender;
}
function Dog(gender) {
    Animal.call(this, gender);
    this.talk = function () {
        console.log('I am a dog');
    };
}
Dog.prototype = new Animal(null);
var pp1 = new Dog('male');
var pp2 = new Dog('female');
console.log(pp1.gender);

// 试比较：
// function Animal(gender) {
//     this.gender = gender;
// }
// function Dog() {
//     this.talk = function () {
//         console.log('I am a dog');
//     };
// }
// Dog.prototype = new Animal(null);
// var pp1 = new Dog('male');
// var pp2 = new Dog('female');
// // Dog.gender.apply(pp1, 'male');
// console.log(pp1.gender);
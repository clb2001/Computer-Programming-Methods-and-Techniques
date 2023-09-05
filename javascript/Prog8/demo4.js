function Animal() {
    this.gender = 'male';
}
function Dog() {
    this.talk = function () {
        console.log('I am a dog');
    };
}
function Cat() {
    this.talk = function () {
        console.log('I am a cat');
    };
}
Dog.prototype = new Animal();
var dog = new Dog();
Cat.prototype = new Animal();
var cat = new Cat();
dog.talk();
cat.talk();
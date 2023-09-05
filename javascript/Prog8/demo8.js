function Animal(gender) {
    this.gender = gender;
    this.getName = function () {
        console.log('Root');// 几份？
    }
}
function Dog(gender) {
    Animal.call(this, gender);
    this.talk = function () {
        console.log('I am a ' + this.gender + ' dog');
    };
}

Dog.prototype = new Animal(null);
var pp1 = new Dog('male');
var pp2 = new Dog('female');
pp1.talk();
pp2.talk();
pp1.getName();
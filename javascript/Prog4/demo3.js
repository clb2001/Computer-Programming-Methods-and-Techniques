function Lecturer() {
    this.getName = function () {
        return this.name;
    }
    this.setName = function (name) {
        this.name = name;
    }
}
var Y = new Lecturer();
Y.setName('Y');
console.log(Y.getName());
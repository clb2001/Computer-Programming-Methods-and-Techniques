function Lecturer(name) {
    this.name = name; //var name = name
    console.log(name + ' teaches nothing useful');
    this.getName = function () {
        return this.name;
    }
}
var Y = new Lecturer('Y');
console.log(Y.getName());
var Z = new Lecturer('Z');
console.log(Z.getName());
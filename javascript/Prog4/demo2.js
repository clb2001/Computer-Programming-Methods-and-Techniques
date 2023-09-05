function Lecturer(name) {
    console.log(name + ' teaches nothing meaningful');
}
var YZ = new Lecturer('YZ');
console.log(YZ.name);
YZ.name = 'YZ';
console.log(YZ.name);
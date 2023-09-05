var Student = function () {
    var name = 'default';
    return {
        getName: function () {
            return name;
        },
        setName: function (newName) {
            name = newName;
        }
    };
};
var student = Student();
console.log(student.getName());
// "Bill".constructor;                 // 返回 "function String()  { [native code] }"
// (3.14).constructor;                 // 返回 "function Number()  { [native code] }"
// false.constructor;                  // 返回 "function Boolean() { [native code] }"
// [1,2,3,4].constructor;              // 返回 "function Array()   { [native code] }"
// {name:'Bill', age: 62}.constructor;  // 返回" function Object()  { [native code] }"
// new Date().constructor;             // 返回 "function Date()    { [native code] }"
// function () {}.constructor;         // 返回 "function Function(){ [native code] }"

var lecturer = {
    name: 'YZ',// 属性
    teach: function () {
        console.log(this.name + ' teaches nothing useful');
    }// 方法
}
lecturer.teach();

var lecturer1 = {
    name: 'Y',
    teach: function () {
        console.log(this.name + ' teaches nothing useful');
    }
}

var lecturer2 = lecturer;
lecturer2.name = 'Z';
lecturer1.teach();


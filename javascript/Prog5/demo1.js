// 字符串被设置为对象属性名时会被尝试改造为常量化版本
function subject(){
    return 'key';
}
var c = subject();// c is not internalized
var obj = {}; obj[c] = 1; //obj多了个 key-value pair "key: 1"
// obj.key === 1 //true
// Object.keys(obj)[0] ==="key" //true
console.log(obj.key === 1);
console.log(Object.keys(obj)[0] ==="key");
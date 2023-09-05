var func = function () {
    try {
        var value;
        // console不会输出
        console.log(value);
        return 0;
    }
    catch (err) {
        var txt = "Error description: " + err.message;
        console.log(txt);
    }
    finally {
        console.log('OK');
        return 1;
    }
}
console.log(func());
try {
    var value;
    console.log(value1);
}
catch (err) {
    var txt = "Error description: " + err.message;
    console.log(txt);
}
finally {
    console.log('OK');
}
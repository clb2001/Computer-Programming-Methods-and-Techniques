try {
    console.log('Step 1');
    throw 'My Exception';
    console.log('Step 2');
}
catch (err) {
    console.log(err);
}  
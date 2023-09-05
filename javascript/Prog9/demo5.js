try {
    console.log('Step 1');
    throw new Error('My Exception');
    console.log('Step 2');
}
catch (err) {
    // console.log(err);
    console.log(err.getMessage); // undefined
}
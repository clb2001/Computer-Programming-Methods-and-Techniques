var lecturer = {
    name: 'YZ',
    teach: function () {
        console.log(this.name + ' teaches nothing meaningful');
    }
}
lecturer.teach();
lecturer.title = 'Dr. ';
lecturer.quit = function () {
    console.log(this.title + this.name + ' quits.');
}
lecturer.quit();
delete lecturer.quit;
lecturer.quit();
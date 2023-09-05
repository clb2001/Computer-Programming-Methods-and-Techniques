var lecturer = {
    name: 'YZ',
    teach: function () {
        console.log(this.name + ' teaches nothing useful');
    }
}
lecturer.teach();// 'YZ teaches nothing useful'
lecturer.title = 'Dr. ';
lecturer.quit = function () {
    console.log(this.title + this.name + ' quits.');// 'Dr. YZ quits.'
}
lecturer.quit();
delete lecturer.quit;
// lecturer.quit();// 不是undefined
package Prog7;

// 内部类
// 普通内部类
public class demo5 {
    private String fileName;

    // 内部类可使用外部类的变量和方法
    // 外部类可以创建内部类实例
    // 作用域关键字用法一样
    // 普通内部类不能定义静态变量
    // 在类加载的时候，static变量就会被初始化，那么我们FileLogger对象在没有demo5这个对象的时候便生成了.
    // 这样这个成员内部类就脱离了外部类的掌控，不需要外部类的对象就可以生成内部类的对象，这与成员内部类的定义就相驳了，
    // 因为我们知道成员内部类的对象必须是现有外部类的对象才能创建，并且是绑定在一起的，所以成员内部类不可以定义静态变量。

    public class FileLogger {
        String a = fileName;
        final static int i =0;
    }

    void WriteLog() {
        FileLogger fl = new FileLogger();
    }

    demo5 log = new demo5();
    demo5.FileLogger a = log.new FileLogger();
}
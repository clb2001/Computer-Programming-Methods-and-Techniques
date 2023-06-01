package Prog7;

public class demo7 {
    private String fileName;

    public void writeLog(String a) {
        final String b = a;
        // 局部内部类
        // 定义在程序块中，只在块内有效
        // 块外不能用到：创建，引用
        // 不加任何访问修饰符，不能加static
        // 但是可以用abstract和final修饰
        // 可访问外部类成员----->static函数中的呢？
        // 可访问块中的final局部变量
        class Test {
            public void show() {
                System.out.println(fileName);
                System.out.println(b);
            }
        }
        Test c = new Test();
        c.show();
    }
}

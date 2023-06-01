package Prog7;

public class demo8 {
    private String fileName;

    public void writeLog(String a) {
        final String b = a;

        class Test {
            public void show() {
                System.out.println("Hello");
            }
        }
        // new Test().show();

        // 匿名内部类，没有引用名的对象
        // 继承父类、实现接口
        new Test() {
            public void show() {
                // 覆盖了父类Test的show()方法
                super.show();
                System.out.println("Hello2");
            }
        }.show();
    }

}
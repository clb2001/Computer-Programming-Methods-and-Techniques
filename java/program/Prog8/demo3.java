package Prog8;

// 接口的静态方法
interface MyInterface {
    static void a() {
        System.out.println("Hello Again!");
    }
}

public class demo3 implements MyInterface{
    demo3 res = new demo3();
    public static void main(String args[]) {
        // 调用方法
        MyInterface.a();
    }
}

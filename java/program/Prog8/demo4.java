package Prog8;

// 接口的私有方法，方便接口内复用
interface MyInterface {
    private static void a() {
        // …
    }

    static void b() {
        a();
    }
}

interface MyOldInterface {
    // private default void a()会报错
    private void c() {
        // …
    }

    default void d() {
        c();
    }
}

public class demo4 {

}

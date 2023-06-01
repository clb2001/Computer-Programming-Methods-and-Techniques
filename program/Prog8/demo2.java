package Prog8;

interface OldInterface {
    void a();
    
    // 在接口添加默认方法不需要修改实现类，
    // 接口新增的默认方法在实现类中直接可用。
    default void b() {
        System.out.println("Hello!");
    }
}

interface NewInterface {
    
    void a();

    default void b() {
        System.out.println("Hello Again!");
    }
}

public class demo2 implements OldInterface, NewInterface{
    // 但是遇到多重继承时，类中要重写方法
    public void b(){
        // OldInterface.super.b();
        NewInterface.super.b();
    }

    public static void main(String args[]) {
        demo2 res = new demo2();
        // // 二义问题怎么解决?
        res.b();
    }

    public void a() {
        // ...
    }
}

// 懂了懂了，很有意思
package Prog11;

// 多线程编程方法1
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}

public class demo5 {
    public static void main(String[] args) {
        // Thread这个类是Java自带的
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

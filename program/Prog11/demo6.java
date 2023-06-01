package Prog11;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}

public class demo6 {
    public static void main(String[] args) {
        // Runnable也不需要单独创建
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
    }
}

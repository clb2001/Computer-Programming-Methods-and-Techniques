package Prog12;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}

public class demo2 {

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
    }
}

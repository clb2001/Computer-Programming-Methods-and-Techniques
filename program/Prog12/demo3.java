package Prog12;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World!");
        try {
            for (;;) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("I am Interrupted");
        }
    }
}

public class demo3 {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
    }
}

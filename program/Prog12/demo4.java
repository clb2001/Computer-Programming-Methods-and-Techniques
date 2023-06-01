package Prog12;

class MyRunnable implements Runnable {
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("thread ends");
            // setPriority(Thread.MAX_PRIORITY);
        } catch (InterruptedException e) {
        }
    }
}

public class demo4 {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
        }
        System.out.println("main ends");
    }
}

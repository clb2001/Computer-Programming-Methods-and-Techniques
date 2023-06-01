package Prog11;

public class demo12 {
    public volatile static int count = 0;

    public static void inc() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        for (int j = 0; j < 10; j++ ){
            count++;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                public synchronized void run() {
                    demo12.inc();
                }
            }).start();
        }
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
        }
        System.out.println("Counter.count = " + demo12.count);
    }
}

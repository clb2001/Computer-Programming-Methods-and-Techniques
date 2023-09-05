package Prog13;

public class demo1 {

    public static void main(String[] args) {
        Object object = new Object();
        // volatile boolean isDoneX = false;
        // volatile boolean isDoneY = false;
        Thread t1 = new Thread() {
            public void run() {
                synchronized (object) {
                    System.out.println("T1 start!");
                    if (true){
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    System.out.println("T1 end!");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (object) {
                    // isDoneY = true;
                    System.out.println("T2 start!");
                    object.notify();
                    System.out.println("T2 end!");
                }
            }
        };
        t1.start();
        // Thread.sleep(3000);
        t2.start();
    }
}

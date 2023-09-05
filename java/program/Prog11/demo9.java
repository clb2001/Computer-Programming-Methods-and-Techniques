package Prog11;

public class demo9 {
    private static volatile boolean bChanged;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            public void run() {
                for (int i = 0;; i++) {
                    if (bChanged == !bChanged) {
                        System.out.println("OK: i = " + i);
                        System.exit(0);
                    }
                }
            }
        }.start();
        Thread.sleep(1);
        new Thread() {
            public void run() {
                for (;;) {
                    bChanged = !bChanged;
                }
            }
        }.start();
    }
}

package Prog11;

// 一致性
public class demo8 {
    // volatile 写操作前插入 StoreStore 屏障，在写操作后插入 StoreLoad 屏障：
    // 前面要写的都写完，后面要读的还不能读
    public volatile static int count = 0;

    public static void inc() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        count++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    demo8.inc();
                }
            }).start();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        System.out.println("Counter.count = " + demo8.count);
    }
}

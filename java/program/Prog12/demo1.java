package Prog12;

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(this.name + "--->" + i);
        }
    }
}

public class demo1{
    public static void main(String[] args) {
        // Thread thread1 = new Thread(new MyRunnable("test1"));
        // Thread thread2 = new Thread(new MyRunnable("test2"));
        // Thread thread3 = new Thread(new MyRunnable("test3"));
        MyRunnable thread1 = new MyRunnable("test1");
        MyRunnable thread2 = new MyRunnable("test2");
        MyRunnable thread3 = new MyRunnable("test3");

        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread3).start();
    }
}

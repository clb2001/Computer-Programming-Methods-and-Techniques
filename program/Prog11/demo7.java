package Prog11;

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

public class demo7{
    public static void main(String[] args) {
        // 放在这个文件夹里运行会报错
        Thread thread1 = new Thread(new MyRunnable("test1"));
        Thread thread2 = new Thread(new MyRunnable("test1"));
        Thread thread3 = new Thread(new MyRunnable("test1"));

        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread3).start();
    }
}



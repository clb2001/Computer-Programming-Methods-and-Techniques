package Prog13;

//4、设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。考虑到线程的安全性写出程序。
//使线程同步
public class demo2 {// 一个主线程

    private int j;// 变量j

    public static void main(String[] args) {
        demo2 t = new demo2();
        Add add = t.new Add();// 内部类的实例
        Sub sub = t.new Sub();

        for (int i = 0; i < 2; i++) {// 循环两边创建四个线程，两加两减
            Thread t1 = new Thread(add);
            t1.start();
            Thread t2 = new Thread(sub);
            t2.start();
        }

    }

    // 考虑线程安全的问题，为方法加synchronized关键字，保证一时间只有一个线程操作该方法
    private synchronized void add() {
        j++;
        System.out.println(Thread.currentThread().getName() + ":" + j);
    }

    private synchronized void sub() {
        j--;
        System.out.println(Thread.currentThread().getName() + ":" + j);
    }

    class Add implements Runnable {// 线程，成员内部类无条件访问外部类的所有成员

        // 线程调用了j+的方法
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                add();
            }
        }
    }

    class Sub implements Runnable {// 线程，同上

        // 线程调用了j-的方法
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                sub();
            }
        }
    }
}

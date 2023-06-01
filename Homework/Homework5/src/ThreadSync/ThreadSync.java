package ThreadSync;

class ThreadA extends Thread {
    public static volatile int A = 0;

    public void incA() {
        A++;
        EmuExe.execute();
    }
}

class ThreadB extends Thread {
    public static volatile int B = 100;

    public void decB() {
        B--;
        EmuExe.execute();
    }
}

public class ThreadSync {
    public volatile static int count = 0;

    public static void main(String[] args) {
        Object object = new Object();
        ThreadA thread1 = new ThreadA() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        while (ThreadB.B + ThreadA.A == 101) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                if (ThreadA.A + ThreadB.B != 100) {
                                    System.out.println("Error!");
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        incA();
                        System.out.println("the value of A is: " + A);
                        object.notify();
                        System.out.println("waiting A");
                    }
                }
            }
        };
        ThreadB thread2 = new ThreadB() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        while (ThreadB.B + ThreadA.A == 99) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                if (ThreadA.A + ThreadB.B != 100) {
                                    System.out.println("Error!");
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        decB();
                        System.out.println("the value of B is: " + B);
                        object.notify();
                        System.out.println("waiting B");
                    }
                }
            }
        };
        System.out.println("the value of A is: " + ThreadA.A);
        System.out.println("the value of B is: " + ThreadB.B);
        thread1.start();
        thread2.start();
    }
}


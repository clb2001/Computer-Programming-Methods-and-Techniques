package ThreadSyncPlus;

import java.util.Collections;
import java.util.Arrays;

class ThreadA extends Thread {
    public static volatile int A = 0;

    public void incA() {
        A++;
        EmuExe.execute();
    }
}

class ThreadB extends Thread {
    public static volatile int B = 0;

    public void incB() {
        B++;
        EmuExe.execute();
    }
}

class ThreadC extends Thread {
    public static volatile int C = 0;

    public void incC() {
        C++;
        EmuExe.execute();
    }
}

class ThreadD extends Thread {
    public static volatile int D = 0;

    public void incD() {
        D++;
        EmuExe.execute();
    }
}

class ThreadE extends Thread {
    public static volatile int E = 0;

    public void incE() {
        E++;
        EmuExe.execute();
    }
}

class ThreadF extends Thread {
    public static volatile int F = 100;

    public void decF() {
        F--;
        EmuExe.execute();
    }
}

class ThreadG extends Thread {
    public static volatile int G = 100;

    public void decG() {
        G--;
        EmuExe.execute();
    }
}

class ThreadH extends Thread {
    public static volatile int H = 100;

    public void decH() {
        H--;
        EmuExe.execute();
    }
}

class ThreadI extends Thread {
    public static volatile int I = 100;

    public void decI() {
        I--;
        EmuExe.execute();
    }
}

class ThreadJ extends Thread {
    public static volatile int J = 100;

    public void decJ() {
        J--;
        EmuExe.execute();
    }
}

public class ThreadSyncPlus {
    public volatile static int count = 0;

    static boolean compare1(int A, int B, int C, int D, int E, int F, int G, int H, int I, int J, int num) {
        Integer arr_1[] = { A, B, C, D, E };
        int min_1 = (int) Collections.min(Arrays.asList(arr_1));
        int max_1 = (int) Collections.max(Arrays.asList(arr_1));
        Integer arr_2[] = { F, G, H, I, J };
        int min_2 = (int) Collections.min(Arrays.asList(arr_2));
        int max_2 = (int) Collections.max(Arrays.asList(arr_2));
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.print("\n");

        if (num <= 99 - min_2 && min_1 + 2 > max_1 && min_2 + 2 > max_2) {
            return false;
        } 
        else if ( (A == B && B == C && C == D && D == E) && (F == G && G == H && H == I && I == J)
        &&(A + B + C + D + E + F + G + H + I + J == 500))
        // else if ((((A == B && B == C && C == D && D == E) && (F == G && G == H && H == I && I == J)) && max_1 + min_2 == 99)
        // || (max_1 + min_2 == 100))
        {
            return false;
        }
        else {
            return true;
        }
    }

    static boolean compare2(int A, int B, int C, int D, int E, int F, int G, int H, int I, int J, int num) {
        Integer arr_1[] = { A, B, C, D, E };
        int min_1 = (int) Collections.min(Arrays.asList(arr_1));
        int max_1 = (int) Collections.max(Arrays.asList(arr_1));
        Integer arr_2[] = { F, G, H, I, J };
        int min_2 = (int) Collections.min(Arrays.asList(arr_2));
        int max_2 = (int) Collections.max(Arrays.asList(arr_2));
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.print("\n");

        if (num >= 101 - max_1 && min_1 + 2 > max_1 && min_2 + 2 > max_2) {
            return false;
        } 
        else if ( (A == B && B == C && C == D && D == E) && (F == G && G == H && H == I && I == J)
        &&(A + B + C + D + E + F + G + H + I + J == 500))
        // else if ((((A == B && B == C && C == D && D == E) && (F == G && G == H && H == I && I == J)) && max_1 + min_2 == 99)
        // || (max_1 + min_2 == 100))
        {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        Object object = new Object();
        ThreadA thread1 = new ThreadA() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        // System.out.println("A");
                        while ((compare1(ThreadA.A, ThreadB.B, ThreadC.C, ThreadD.D, ThreadE.E, 
                        ThreadF.F, ThreadG.G, ThreadH.H, ThreadI.I, ThreadJ.J, ThreadA.A))) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                // if (ThreadA.A + ThreadB.B + ThreadC.C + ThreadD.D + ThreadE.E + ThreadF.F +
                                //         ThreadG.G + ThreadH.H + ThreadI.I + ThreadJ.J != 500) {
                                //     System.out.println("Error!");
                                // }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        incA();
                        System.out.println("the value of A is: " + A);
                        // object.notifyAll();
                        
                        System.out.println("waiting A");
                        // ThreadA.yield();
                    }
                }
            }
        };
        ThreadB thread2 = new ThreadB() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        // System.out.println("B");
                        while ((compare1(ThreadA.A, ThreadB.B, ThreadC.C, ThreadD.D, ThreadE.E, 
                        ThreadF.F, ThreadG.G, ThreadH.H, ThreadI.I, ThreadJ.J, ThreadB.B))) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                // if (ThreadA.A + ThreadB.B + ThreadC.C + ThreadD.D + ThreadE.E + ThreadF.F +
                                //         ThreadG.G + ThreadH.H + ThreadI.I + ThreadJ.J != 500) {
                                //     System.out.println("Error!");
                                // }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        incB();
                        System.out.println("the value of B is: " + B);
                        object.notifyAll();
                        System.out.println("waiting B");
                        // ThreadB.yield();
                    }
                }
            }
        };
        ThreadC thread3 = new ThreadC() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        // System.out.println("C");
                        while ((compare1(ThreadA.A, ThreadB.B, ThreadC.C, ThreadD.D, ThreadE.E, 
                        ThreadF.F, ThreadG.G, ThreadH.H, ThreadI.I, ThreadJ.J, ThreadC.C))) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                // if (ThreadA.A + ThreadB.B + ThreadC.C + ThreadD.D + ThreadE.E + ThreadF.F +
                                //         ThreadG.G + ThreadH.H + ThreadI.I + ThreadJ.J != 500) {
                                //     System.out.println("Error!");
                                // }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        incC();
                        System.out.println("the value of C is: " + C);
                        object.notifyAll();
                        System.out.println("waiting C");
                    }
                }
            }
        };
        ThreadD thread4 = new ThreadD() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        // System.out.println("D");
                        while ((compare1(ThreadA.A, ThreadB.B, ThreadC.C, ThreadD.D, ThreadE.E, 
                        ThreadF.F, ThreadG.G, ThreadH.H, ThreadI.I, ThreadJ.J, ThreadD.D))) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                // if (ThreadA.A + ThreadB.B + ThreadC.C + ThreadD.D + ThreadE.E + ThreadF.F +
                                //         ThreadG.G + ThreadH.H + ThreadI.I + ThreadJ.J != 500) {
                                //     System.out.println("Error!");
                                // }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        incD();
                        System.out.println("the value of D is: " + D);
                        object.notifyAll();
                        System.out.println("waiting D");
                    }
                }
            }
        };
        ThreadE thread5 = new ThreadE() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        // System.out.println("E");
                        while ((compare1(ThreadA.A, ThreadB.B, ThreadC.C, ThreadD.D, ThreadE.E, 
                        ThreadF.F, ThreadG.G, ThreadH.H, ThreadI.I, ThreadJ.J, ThreadE.E))) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                // if (ThreadA.A + ThreadB.B + ThreadC.C + ThreadD.D + ThreadE.E + ThreadF.F +
                                //         ThreadG.G + ThreadH.H + ThreadI.I + ThreadJ.J != 500) {
                                //     System.out.println("Error!");
                                // }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        incE();
                        System.out.println("the value of E is: " + E);
                        object.notifyAll();
                        System.out.println("waiting E");
                    }
                }
            }
        };
        ThreadF thread6 = new ThreadF() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        // System.out.println("F");
                        while ((compare2(ThreadA.A, ThreadB.B, ThreadC.C, ThreadD.D, ThreadE.E,
                            ThreadF.F, ThreadG.G, ThreadH.H, ThreadI.I, ThreadJ.J, ThreadF.F))) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                // if (ThreadA.A + ThreadB.B + ThreadC.C + ThreadD.D + ThreadE.E + ThreadF.F +
                                //         ThreadG.G + ThreadH.H + ThreadI.I + ThreadJ.J != 500) {
                                //     System.out.println("Error!");
                                // }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        decF();
                        System.out.println("the value of F is: " + F);
                        object.notifyAll();
                        System.out.println("waiting F");
                    }
                }
            }
        };
        ThreadG thread7 = new ThreadG() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        // System.out.println("G");
                        while ((compare2(ThreadA.A, ThreadB.B, ThreadC.C, ThreadD.D, ThreadE.E,
                            ThreadF.F, ThreadG.G, ThreadH.H, ThreadI.I, ThreadJ.J, ThreadG.G))) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                // if (ThreadA.A + ThreadB.B + ThreadC.C + ThreadD.D + ThreadE.E + ThreadF.F +
                                //         ThreadG.G + ThreadH.H + ThreadI.I + ThreadJ.J != 500) {
                                //     System.out.println("Error!");
                                // }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        decG();
                        System.out.println("the value of G is: " + G);
                        object.notifyAll();
                        System.out.println("waiting G");
                    }
                }
            }
        };
        ThreadH thread8 = new ThreadH() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        // System.out.println("H");
                        while ((compare2(ThreadA.A, ThreadB.B, ThreadC.C, ThreadD.D, ThreadE.E,
                            ThreadF.F, ThreadG.G, ThreadH.H, ThreadI.I, ThreadJ.J, ThreadH.H))) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                // if (ThreadA.A + ThreadB.B + ThreadC.C + ThreadD.D + ThreadE.E + ThreadF.F +
                                //         ThreadG.G + ThreadH.H + ThreadI.I + ThreadJ.J != 500) {
                                //     System.out.println("Error!");
                                // }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        decH();
                        System.out.println("the value of H is: " + H);
                        object.notifyAll();
                        System.out.println("waiting H");
                    }
                }
            }
        };
        ThreadI thread9 = new ThreadI() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        // System.out.println("I");
                        while ((compare2(ThreadA.A, ThreadB.B, ThreadC.C, ThreadD.D, ThreadE.E,
                            ThreadF.F, ThreadG.G, ThreadH.H, ThreadI.I, ThreadJ.J, ThreadI.I))) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                // if (ThreadA.A + ThreadB.B + ThreadC.C + ThreadD.D + ThreadE.E + ThreadF.F +
                                //         ThreadG.G + ThreadH.H + ThreadI.I + ThreadJ.J != 500) {
                                //     System.out.println("Error!");
                                // }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        decI();
                        System.out.println("the value of I is: " + I);
                        object.notifyAll();
                        System.out.println("waiting I");
                    }
                }
            }
        };
        ThreadJ thread10 = new ThreadJ() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (object) {
                        // System.out.println("J");
                        while ((compare2(ThreadA.A, ThreadB.B, ThreadC.C, ThreadD.D, ThreadE.E,
                            ThreadF.F, ThreadG.G, ThreadH.H, ThreadI.I, ThreadJ.J, ThreadJ.J))) {
                            try {
                                object.wait();// 交出object的锁，等待被notify
                                // if (ThreadA.A + ThreadB.B + ThreadC.C + ThreadD.D + ThreadE.E + ThreadF.F +
                                //         ThreadG.G + ThreadH.H + ThreadI.I + ThreadJ.J != 500) {
                                //     System.out.println("Error!");
                                // }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        decJ();
                        System.out.println("the value of J is: " + J);
                        object.notifyAll();
                        System.out.println("waiting J");
                    }
                }
            }
        };
        System.out.println("the value of A is: " + ThreadA.A);
        System.out.println("the value of B is: " + ThreadB.B);
        System.out.println("the value of C is: " + ThreadC.C);
        System.out.println("the value of D is: " + ThreadD.D);
        System.out.println("the value of E is: " + ThreadE.E);
        System.out.println("the value of F is: " + ThreadF.F);
        System.out.println("the value of G is: " + ThreadG.G);
        System.out.println("the value of H is: " + ThreadH.H);
        System.out.println("the value of I is: " + ThreadI.I);
        System.out.println("the value of J is: " + ThreadJ.J);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}

package Prog11;

import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {
    public void run() {
        System.out.println("timer timeout: start run().");
    }
}

public class demo4 {
    public static void main(String argv[]) {
        Timer timer = new Timer();
        // 匿名内部类
        // timer.schedule(new TimerTask() {
        //     public void run() {
        //         System.out.println("timer timeout: start run().");// 10s后程序开始运行
        //     }
        // }, 10000);
        MyTask task = new MyTask();
        timer.schedule(task, 10000, 5000);
        timer.cancel();
    }
}

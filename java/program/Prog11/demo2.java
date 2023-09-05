package Prog11;

import java.util.Calendar;

public class demo2 {
    public static void main(String argv[]){
        Calendar c = Calendar.getInstance();
        // 没有下面这段初始化代码，输出的结果就是现在的时间
        c.set(Calendar.YEAR, 2022);
        c.set(Calendar.MONTH, 2);
        c.set(Calendar.DATE, 14);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.println(year);
        System.out.println(month);// month是从0开始算的
        System.out.println(date);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
    }
}

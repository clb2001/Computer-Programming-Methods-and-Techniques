package Prog11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {
    public static void main(String argv[]) {
        Date date = new Date();
        long time = date.getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sysTime = df.format(date);
        System.out.println(sysTime);
        System.out.println(time);
    }
}

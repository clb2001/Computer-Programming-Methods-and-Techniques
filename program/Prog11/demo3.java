package Prog11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo3 {
    public static void main(String argv[]) throws ParseException{
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        c.setTime(time);
        String str = "2022-04-26";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        System.out.println(date);// Tue Apr 26 00:00:00 CST 2022
    }
}

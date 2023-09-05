package Prog10;

public class demo1 {
    public static void main(String args[]) {
        demo1 r1 = new demo1();
        demo1 r2 = new demo1();
        demo1 r4 = new demo1();
        Class clazz1 = r1.getClass();
        Class clazz2 = r2.getClass();
        Class clazz3 = demo1.class; 
        Class<? extends demo1> clazz4 = r4.getClass();
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
        System.out.println(clazz1 == clazz4);
        } 
}

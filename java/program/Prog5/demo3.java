package Prog5;

public class demo3 {
    public static void main(String[] argv) {
        String a = "abcd";
        String b = new String("abcd");
        String c = (new String("abcd")).intern();
        System.out.println(a == b);// false
        System.out.println(a == c);// true
        System.out.println(c == b);// false

        // 试比较：
        String s1 = new String("1") + new String("1");
        System.out.println(s1.intern() == s1);
        String s2 = "11";
        System.out.println(s2 == s1);

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        // 这里s3.intern()返回的是s4的引用
        System.out.println(s3.intern() == s4);
        System.out.println(s4 == s3);        
    }
}

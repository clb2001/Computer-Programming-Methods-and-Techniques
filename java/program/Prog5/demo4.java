package Prog5;

public class demo4 {
    public static void main(String[] argv) {
        String s1 = "AB";
        String s2 = new String("AB");
        String s3 = "A";
        String s4 = "B";
        String s5 = "A" + "B";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s1 == s2.intern());

        String b = new String("ab" + "cd");
        String c = b.intern();
        System.out.println(c == b);

        String d = "";
        String a = "a" + d + "b";
        System.out.println(a == a.intern());

        String e = "";
        String t = new String("ab" + "cd");
        String f = new String("ab" + e + "cd");
        String g = f.intern();
        System.out.println(g == f);

        String h = "";
        String i = new String("ab" + h + "cd");
        String j = "a" + h + "b";
        System.out.println(j == j.intern());
    }
}

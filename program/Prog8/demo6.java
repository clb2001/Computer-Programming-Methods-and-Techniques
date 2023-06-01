package Prog8;

// 但是父类也可以实现一样的效果
class Print {
    public void print(Object[] a) {
        for (Object i : a) {
            System.out.print(i + "");
        }
        System.out.println();
    }
}

public class demo6 {
    public static void main(String args[]) {
        Character[] ca = { '1', '2' };
        new Print().print(ca);
        Integer[] ca2 = { 34, 56 };
        new Print().print(ca2);
    }
}

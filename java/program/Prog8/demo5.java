package Prog8;

class Print<T> {
    public void print(T[] a) {
        for (T i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class demo5<T> {
    public static void main(String args[]) {
        Character[] ca = { '1', '2' };
        Print<Character> printer = new Print<Character>();
        printer.print(ca);
        Integer[] ca2 = { 34, 56 };
        Print<Integer> printer2 = new Print<Integer>();
        printer2.print(ca2);
    }
}

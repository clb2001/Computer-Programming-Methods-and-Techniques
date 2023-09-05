package Prog7;

class A {
    void print() {
        System.out.println("A");
    }
}

class B extends A {
    void print() {
        System.out.println("B");
    }
}

class C extends A {
    void print() {
        System.out.println("C");
    }
}

public class demo2 {
    public static void main(String[] args) {
        A b = new B();
        // class Prog7.B cannot be cast to class Prog7.C
        // ((C) b).print(); // ((A)b).print();
        b.print();
    }
}

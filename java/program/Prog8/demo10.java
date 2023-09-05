package Prog8;

// 泛型接口
interface DatumInterface<S> {
    public S getVar();

    public void setVar(S var);
}

class Datum<T> implements DatumInterface<T> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var2) {
        var = var2;
    }
}

// public interface Comparable<T> {
// public int compareTo(T o);
// }

public class demo10 {
    public <T> void print(T a) {
        System.out.println(a);
    }

    // 静态方法不允许用类的泛型
    // 但是静态方法可以实现为泛型方法
    // 成员方法需要通过new对象来调用
    // public static void printa(T a)编译不通过
    public static <T> void printa(T a) {
        System.out.println(a);
    }
    public static void main(String args[]) {
        demo10 test = new demo10();
        test.print("Hello");
        test.printa(12);
    }
}

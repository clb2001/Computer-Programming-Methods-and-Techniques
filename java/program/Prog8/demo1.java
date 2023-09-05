package Prog8;

// 把需实现的方法和共有常量定义在接口里
// 接口的变量默认为public final static
// 常量接口的方法默认为public abstract
public class demo1 {
    interface Printable {
        // 接口的具体实现
        default void b() {
            System.out.println("Hello!");
        }
        void print();
    }

    interface Printable2 {
        void print2();
    }

    // 接口的组合
    interface Comparable extends Printable {
        boolean compare(Comparable a);
    }

    // 实现多接口
    class Data implements Comparable, Printable2{
        public int b;

        public void print() {
        }

        public boolean compare(Comparable a){
            return (b > 1);
        }

        public void print2() {
        }
    }
}

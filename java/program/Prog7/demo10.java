package Prog7;

public class demo10 {
    ClassA objectA = new ClassA();

    class ClassA {
        public ClassA() {
            // 调用另一个构造方法
            this(1);
        }

        public ClassA(int i) {

        }
    }
}

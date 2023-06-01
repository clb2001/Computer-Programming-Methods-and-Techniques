package Prog7;

// 内部类访问外部类的引用
public class demo11 {
    ClassA objectA = new ClassA();
    // ClassA.method();

    class ClassA {
        public void method() {
            ClassB objectB = new ClassB();
        }

        class ClassB { 
            // 内部类访问外部类的引用
            ClassA objectA = ClassA.this;
        }
    }
}

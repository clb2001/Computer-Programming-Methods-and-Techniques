package Prog7;

public class demo9 {
    ClassA objectA = new ClassA();
    // method方法应该怎么调用？
    // objectA.method();

    class ClassA {
        public void method() {
            // 当前对象的引用-->ClassA objectA = new ClassA()
            ClassB objectB = new ClassB(this);
        }
    }

    class ClassB {
        ClassA objectA;

        ClassB(ClassA objectA) {
            // 默认作用域：本block内要访问本类的同名成员对象，用this.XXX
            // 有点像python
            this.objectA = objectA;
        }
    }
}

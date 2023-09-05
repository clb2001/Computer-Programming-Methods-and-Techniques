package Prog7;

// 运行时灵活绑定子类，执行相应的子类方法
// 里氏替换法则:派生类（子类）对象能够替换其基类（父类）对象被使用
class Animal {
    String talk() {
        return "Error: I am undefined. I don’t know how to talk";
    }
};

class Cat extends Animal {
    String talk() {
        return "Meow!";
    }
};

class Dog extends Animal {
    String talk() {
        return "Woof!";
    }
};

public class demo3 {
    void letsHear(Animal a) {
        System.out.println(a.talk());
    }

    public static void main(String[] args) {
        demo3 poly = new demo3();
        poly.letsHear(new Cat());
        poly.letsHear(new Dog());
        poly.letsHear(new Animal());
    }
}

package Prog10;

interface TestInterface {
    void printInfo(String info);
}

class TestClass implements TestInterface {
    public void printInfo(String info) {
        System.out.println(info);
    }
}

public class demo2 {
    public static void main(String argc[]) {
        Class<?> clazz = TestClass.class;
        try {
            TestInterface test = (TestInterface) clazz.newInstance();
            test.printInfo("Hello");
        } catch (IllegalAccessException | InstantiationException e) {
            System.out.println(e);
        }
    }
}

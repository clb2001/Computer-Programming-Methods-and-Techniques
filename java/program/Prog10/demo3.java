package Prog10;
// Class.forName(xxx.xx.xx)返回的是一个类

import java.lang.reflect.Method;

interface TestInterface {
    void printInfo(String info);
}

class TestClass implements TestInterface {
    public void printInfo(String info) {
        System.out.println(info);
    }
}

public class demo3 {
    public static void main(String argc[]) {
        try {
            Class<?> clazz = Class.forName("TestClass");
            TestInterface test = (TestInterface) clazz.newInstance();
            // Parameter list
            Class<?> parameterTypes[] = new Class[] { String.class };
            // getMethod 公有，包括继承来的
            // getDeclaredMethod 所有，不包括继承来的
            Method m = clazz.getMethod("printInfo", parameterTypes);
            m.invoke(test, "Hello");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

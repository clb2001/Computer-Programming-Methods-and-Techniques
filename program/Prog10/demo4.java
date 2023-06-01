package Prog10;

import java.lang.reflect.Method;

public class demo4 {
    public static void main(String argc[]) {
        try {
            Class<?> clazz = Class.forName("TestClass");
            TestInterface test = (TestInterface) clazz.newInstance();
            // Parameter list
            Class<?> parameterTypes[] = new Class[] { int.class, String.class };
            Method m = clazz.getMethod("printInfo", parameterTypes);
            m.invoke(test, new Object[] { 1, "Hello" });
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

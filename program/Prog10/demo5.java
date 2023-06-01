package Prog10;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class demo5 {
    public static void main(String argv[]) {
        try {
            URL[] urls = new URL[] { new URL("file:test.jar") };
            URLClassLoader loader = new URLClassLoader(urls);
            Class<?> clazz = loader.loadClass("TestClass");
            TestInterface test = (TestInterface) clazz.newInstance();
            // Parameter list
            Class<?> parameterTypes[] = new Class[] { String.class };
            Method m = clazz.getMethod("printInfo", parameterTypes);
            m.invoke(test, "Hello");
            loader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

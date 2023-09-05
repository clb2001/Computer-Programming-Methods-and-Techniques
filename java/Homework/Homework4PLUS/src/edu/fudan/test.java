package Homework4.src.edu.fudan;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class test{
    public static void main(String argv[]) throws IllegalArgumentException, NoSuchMethodException, SecurityException {
        Properties props = new Properties();
        FileReader fr;
        String sClassname;

        // 读取文件
        try {
            String fileName = "Homework4/sort.conf";
            fr = new FileReader(fileName);
            props.load(fr);

        } catch (IOException e) {
            System.out.println("IOException!");
            e.printStackTrace();
        }

        // 获得类名
        sClassname = props.getProperty("classname");
        Class newClass = null;
        try {
            newClass = Class.forName(sClassname);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            System.exit(0);
        }
        if (newClass == null) {
            System.out.println("point is NULL");
            System.exit(0);
        }

        // 根据方法名获取method
        String sMethod = props.getProperty("method");
        Method method = null;
        try {
            method = newClass.getMethod(sMethod, int[].class);
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException");
            System.exit(0);
        }

        // 获得数据
        String[] sArgs = props.getProperty("args").split(",");
        // 将字符串列表转换为Class列表
        int[] oArgs = new int[sArgs.length];
        for (int i = 0; i < sArgs.length; i++) {
            oArgs[i] = Integer.valueOf(sArgs[i]);
        }

        // 实例化这个对象并调用
        Object p = null;
        if (method != null) {
            try {
                p = newClass.getDeclaredConstructor().newInstance();
                int[] res = (int [])method.invoke(p, oArgs);
                for (int i = 0; i < res.length; i++){
                    System.out.println(res[i]);
                }
            } catch (IllegalAccessException | InstantiationException e) {
                System.out.println("IllegalAccessException | InstantiationException");
                System.exit(0);
            } catch (InvocationTargetException e) {
                System.out.println("InvocationTargetException");
                System.exit(0);
            }
            catch (NoSuchMethodException | SecurityException e) {
                System.out.println("NoSuchMethodException | SecurityException");
                System.exit(0);
            }
            catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException");
                System.exit(0);
            }
            if (p != null) {
                System.out.println(p.toString());
            }
        }
    }
}
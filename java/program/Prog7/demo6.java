package Prog7;

// 静态内部类
public class demo6 {
    private String fileName;

    public class FileLogger {
        String a = fileName;
        final static int i =0;
    }

    void WriteLog() {
        FileLogger fl = new FileLogger();
    }

    // 可用static修饰内部类->静态内部类

    // 只能访问外部类的static变量和方法
    // 静态内部类不能直接访问外部类的非static变量和方法
    // 静态变量和方法随着类的加载而加载，而非静态成员是随着对象的生成而生成。
    // 所以静态成员或方法的加载时机要早于非静态成员方法或变量的生成，先出现的怎么能访问后出现的呢？
    
    // 可直接创建，不需要外部类引用 
    // 写测试代码
    public static class Test1 {
        public static void main(String args[]) {
            demo6 testLog = new demo6();
            testLog.WriteLog();// 开始测试
        }
    }

    public static class Test2 {
        public static void main(String args[]) {

        }
    }

}
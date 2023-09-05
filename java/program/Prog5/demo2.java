package Prog5;

public class demo2 {
    public static void main(String[] args) {
        // 定义的是一个常量，其内存操作是在常量池中开辟了一块空间，并在其中放入了字符串abc，并通过atr对象指向这个常量对象
        String a = "a";
        String b = "b";
        String c = "a";
        String ab1 = a + b;
        String ab2 = "ab";
        String ab3 = a.concat(b);
        String ab4 = a + b;
        String ab5 = "a" + "b";
        final String ab = "a";
        String ab6 = ab + "b";

        // 定义的a，c是两个常量，它们都是存放在常量池中的，JVM会对常量池进行优化，
        // a，c由于值一样，所以他们是存放在一个空间中的，也就是说a，c这两个引用指的是同一块内存
        System.out.println(a == c);    // true

        // JVM对于字符串引用，由于在字符串的"+"连接中，有字符串引用存在，而引用的值在程序编译期是无法确定的，
        // 即a + b无法被编译器优化，只有在程序运行期来动态分配并将连接后的新地址赋给ab1。
        System.out.println(ab1 == ab2);// false

        // +运算符在java内部的处理是, 新建一个StringBuilder对象, 
        // 用StringBuilder对象的append()方法一个一个字符拼接的.之后再调用toString()方法转换成String类型.
        // concat()利用char数组进行拼接, 将两个字符串中的字符都取出来, 放到一个数组中
        // 然后, 用该数组new一个字符串对象作为返回值.
        System.out.println(ab1 == ab3);// false

        // ???
        System.out.println(ab1 == ab4);// false
        
        System.out.println(ab1 == ab5);// false

        System.out.println(ab2 == ab3);// false

        System.out.println(ab2 == ab4);// false

        // ???
        System.out.println(ab2 == ab5);// true

        System.out.println(ab3 == ab4);// false

        System.out.println(ab3 == ab5);// false

        System.out.println(ab4 == ab5);// false

        // 对于final修饰的变量，它在编译时被解析为常量值的一个本地拷贝存储到自己的常量池中或嵌入到它的字节码流中
        System.out.println(ab2 == ab6);// true
    }
}

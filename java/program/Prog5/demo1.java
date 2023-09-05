package Prog5;

public class demo1 {
    // 方法中声明的基本数据类型对象的引用一般存在栈中
    // 生命周期短, 作用域外就释放, 访问速度快
    // 类的成员变量的基本数据类型对象的引用一般存在堆中
    // 生命周期：new开始分配，不用了垃圾收集机制(GC)负责清理

    // 有些变量是本类所有对象共用的, 希望在对象中共享一个公共变量-----static
    // 有些数据不希望在对象创建后被修改-----final, 变量须在分配内存空间时赋值
    // final static 用于修饰常量
    // 因为是static的，会在对象创建前分配空间
    // 因为是final的，必须在分配空间的时候赋值

    // 结合前面的例子,对这种构造方法应该有更深的理解了
    byte [] ascii={97,98,99,100,101};
    char [] chars = {'a', 'b', 'c', 'd', 'e'};
    String g = "abcde";
    String a = new String(String b); //拷贝字串b
    String h = new String(ascii); //ascii码数组
    String c = new String(ascii, 1, 2);
    //从ascii索引为1的元素开始，长度为2
    String d = new String(chars); //字符数组
    String e = new String(chars, 1, 3);
    //从chars索引为1的元素开始，长度为3

    // StringBuffer();
    // Stringbuilder();
}


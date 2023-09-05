package Prog6;
// 不同的构造方法，类里方法的重载
public class demo1 {
    byte[] ascii = { 97, 98, 99, 100, 101 };
    char[] chars = { 'a', 'b', 'c', 'd', 'e' };
    String b = "abc";
    String a = new String(b); // 拷贝字串b
    String a0 = new String(ascii); // ascii码数组
    String a1 = new String(ascii, 1, 2);
    // 从ascii索引为1的元素开始，长度为2
    String a2 = new String(chars); // 字符数组
    String a3 = new String(chars, 1, 3);
    // 从chars索引为1的元素开始，长度为3
}
// 同一个类里方法的重载
// 代码放置于不同的内存区域
// 把方法名转换成和参数有关的名字
// 编译时完成
// 运行时便可找到实际对应的方法地址

// Java中一个类的函数重载可以在本类中的函数和来自父类中的函数之间进行，
// 而C++类中的函数重载只能是本类中的（即不包括来自父类的函数），这是他们一个非常重要的区别。
// 在其他方面的要求都是一致的，即要求函数名称一致，参数不同。只有返回值类型不同的函数，不能构成重载（会有编译错误，提示函数定义重复）。
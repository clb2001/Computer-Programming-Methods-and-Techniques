package Prog8;

import java.util.ArrayList;
import java.util.LinkedList;

public class demo12 {
    public static void main(String argv[]) {
        // Integer是int的包装类；int是基本数据类型；
        // Integer变量必须实例化后才能使用；int变量不需要；
        // Integer实际是对象的引用，指向此new的Integer对象；int是直接存储数据值 ；
        // Integer的默认值是null；int的默认值是0。
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList <Integer> temp = new LinkedList<Integer>();
        int i = 0;
        for (i = 0; i < 10; i++) {
            // 给数组增加10个Int元素
            list.add(i);
        }
        list.remove(5);// 将第6个元素移除
        for (i = 0; i < 3; i++) {
            // 再增加3个元素
            list.add(i + 20);
        }
        i = list.get(3);// 得到第4个元素
        Integer t[] = new Integer[list.size()];// list.size()得到当前大小
        list.toArray(t); // 转成数组
    }
}

// C++使用的是“代码生成”的方式，而Java使用的是“类型擦除”的方式。
// “代码生成”：编译器在编译期间识别实际传入的参数类型，生成用于该类型的代码。
// “类型擦除”：编译器在编译期间将实际类型擦除，将每个类型都视为Object类型。
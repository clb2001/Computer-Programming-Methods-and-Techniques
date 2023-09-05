package Prog8;

//注意泛型用在类上和用在方法上的区别
public class demo11 {
    static <T extends Comparable<T>> int compare(T a, T b) {
        if (a.compareTo(b) > 0) {
            return 1;
        } else if (a.compareTo(b) < 0) {
            return -1;
        }
        return 0;
    }

    public static void main(String args[]) {
        // 实现类不明确泛型接口的类型参数变量，这时实现类也必须定义类型参数变量
        // 如果希望只取出，不插入，就使用? extends Hero
        // 如果希望只插入，不取出，就使用? super Hero
        // 如果希望，又能插入，又能取出，就不要用通配符？ 
        // demo11<String> stringShow = new demo11<>();
        // Comparable<Integer> i1 = new Comparable<>();
        // 如何解决？？？
        System.out.println("ret = " + compare(12, 13));
        System.out.println("ret = " + compare("ABC", "abc"));
    }
}

// 指定T必须实现Comparable泛型接口,也就是T要有compareTo方法
// 见Comparable.java这个文件

// Datum <Object>是Datum <String>的父类吗？

// Datum <Object> hs = new Datum();
// Datum <String> adhs = new Datum();
// 引用hs指向了Object泛型的容器
// 作为Object泛型的引用hs, 看上去是可以往里面加一个String的。
// 但是hs这个引用，实际上是指向的一个Object泛型的容器
// 如果能加进去，就变成了String泛型的容器里放进了Object，这就矛盾了
// 所以子类泛型不可以转换为父类泛型
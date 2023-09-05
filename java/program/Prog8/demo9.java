package Prog8;

class Element {
}

class ElementNew extends Element {
}

class OtherElement {
}

class Data<T extends Element> {
    private T var1;

}

public class demo9 {
    // 可限定类型必须是某个指定类型或其子类，或是实现了某个接口, 都用extends
    Data<Element> ele1 = new Data<Element>();
    Data<ElementNew> ele2 = new Data<ElementNew>();
    // Data<OtherElement>ele3=new Data<OtherElement>();
    // 静态方法不允许用类的泛型
    // 在java中泛型只是一个占位符，必须在传递类型后才能使用
    // 就泛型而言，类实例化时才能正真的的传递类型参数，
    // 由于静态方法的加载先于类的实例化，也就是说类中的泛型还没有传递真正的类型参数静态的方法就已经加载完成了
}

package Prog7;

// 不能具体化的抽象类
abstract class Animal {
    private double weight;

    public double getWeight(){
        return weight;
    };

    public String talk() {
        return "Error: I am undefined. I don't know how to talk";
    }
};

public class demo4 {

}

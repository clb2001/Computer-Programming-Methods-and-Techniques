package oop;

public class Animal {
    private int age;
    private String name;

    public void setAge(int age)
    {
        if (age < 0)
        {
            throw new IllegalArgumentException();
        }
        this.age = age;
        this.name = "233";
    }

    public static <T> T add(T x, T y){
        return x;
    }
}

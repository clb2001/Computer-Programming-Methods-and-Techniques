package Prog10;

class Animal{

}

class Dog extends Animal{

}

public class demo6 {
    public static void main(String argv[]){
        Animal animal = new Animal();
        Dog dog = new Dog();
        System.out.println(animal instanceof Dog);
        // System.out.println(animal instanceof Animal);
        System.out.println(dog instanceof Animal);
    }
}

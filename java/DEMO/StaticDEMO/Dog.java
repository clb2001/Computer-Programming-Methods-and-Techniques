package StaticDEMO;

public class Dog extends Animal
{
    static {
        System.out.println("This is Dog Static area Code...");
    }
    {
        System.out.println("This is Dog General area Code...");
    }
    public Dog(){
        System.out.println("This is Dog Construct Method...");
    }
}


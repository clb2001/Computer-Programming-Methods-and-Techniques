package StaticDEMO;

public class Animal
{
    static
    {
        System.out.println("This is Animal Static area Code... ");
    }

    {
        System.out.println("This is Animal General area Code...");
    }
    //static String constant;

    public Animal()
    {
        System.out.println("This is Animal Construct Method...");
    }

    public void running()
    {
        System.out.println("I'm  Running");
    }

}

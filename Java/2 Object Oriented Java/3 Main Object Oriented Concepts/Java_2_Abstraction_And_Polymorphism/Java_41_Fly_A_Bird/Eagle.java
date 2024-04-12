package Java_2_Abstraction_And_Polymorphism.Java_41_Fly_A_Bird;

public class Eagle extends Bird
{
    public Eagle()
    {
        super("Eagle");
    }

    @Override
    public void fly()
    {
        System.out.println("Eagle is flying.....");
    }
}

package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_1_Abstraction;

public class Car extends Vehicle
{
    private int noOfDoors;
    public Car()
    {
        super(4);
    }

    @Override
    public void makeStartSound()
    {
        System.out.println("Bru..........");
    }
}

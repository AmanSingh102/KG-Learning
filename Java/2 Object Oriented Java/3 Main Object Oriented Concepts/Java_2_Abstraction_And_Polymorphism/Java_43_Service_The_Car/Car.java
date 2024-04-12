package Java_2_Abstraction_And_Polymorphism.Java_43_Service_The_Car;

public class Car extends Vehicle
{
    @Override
    public void service()
    {
        super.service();
        System.out.println("Car is getting serviced.....");
    }
}

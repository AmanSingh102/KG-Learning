package Java_2_Abstraction_And_Polymorphism.Java_43_Service_The_Car;

public class Test
{
    public static void main(String[] args)
    {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();

        vehicle.service();
        car.service();

    }
}

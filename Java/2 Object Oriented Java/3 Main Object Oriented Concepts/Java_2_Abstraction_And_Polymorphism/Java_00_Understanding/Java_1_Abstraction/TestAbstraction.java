package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_1_Abstraction;

public class TestAbstraction
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Abstraction Understanding ----\n");
        //Vehicle v = new Vehicle(5);  // WE CAN'T MAKE OBJECT OF THIS CLASS BECAUSE IT IS AN ABSTRACT CLASS

        Car car = new Car();
        car.commute();
        car.makeStartSound();

        System.out.println("\n-----------------------------------\n");
    }
}

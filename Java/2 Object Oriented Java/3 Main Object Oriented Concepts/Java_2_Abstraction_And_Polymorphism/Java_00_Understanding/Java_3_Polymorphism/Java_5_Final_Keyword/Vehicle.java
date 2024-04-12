package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_3_Polymorphism.Java_5_Final_Keyword;

abstract class Vehicle
{
    public final String name = "Vehicle";
    public void start()
    {
        System.out.println("Vehicle is starting........");
    }

    public final void reStart()                     // This method can't be override
    {
        System.out.println("Restart the Vehicle");
    }
}

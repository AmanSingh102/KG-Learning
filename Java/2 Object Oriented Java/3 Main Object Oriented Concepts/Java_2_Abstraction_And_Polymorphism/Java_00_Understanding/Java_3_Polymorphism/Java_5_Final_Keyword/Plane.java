package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_3_Polymorphism.Java_5_Final_Keyword;

class Plane extends Vehicle
{
    @Override
    public void start()
    {
        super.start();    // Calling parent behaviour
        System.out.println("Plane is taking of........");
    }
}

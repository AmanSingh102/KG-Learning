package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_3_Polymorphism.Java_3_Super_Keyword;

class Car extends Vehicle
{
    Car()
    {
        super();
    }

    Car( int noOfTires )
    {
        super(noOfTires);       // super() for calling the super/parent class constructor
    }
    @Override
    public void start()
    {
        System.out.println("Number of tires : " + super.getNoOfTires());        // super. for calling the super/parent class methods
        System.out.println("Car is starting");

    }
}

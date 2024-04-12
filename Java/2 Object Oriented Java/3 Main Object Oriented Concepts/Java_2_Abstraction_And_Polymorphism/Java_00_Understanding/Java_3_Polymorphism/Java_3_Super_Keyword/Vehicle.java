package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_3_Polymorphism.Java_3_Super_Keyword;

public abstract class Vehicle
{
    private int noOfTires;
    Vehicle()
    {
        this.noOfTires = 0;
    }

    Vehicle( int noOfTires )
    {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires()
    {
        return this.noOfTires;
    }
    public abstract void start();
}

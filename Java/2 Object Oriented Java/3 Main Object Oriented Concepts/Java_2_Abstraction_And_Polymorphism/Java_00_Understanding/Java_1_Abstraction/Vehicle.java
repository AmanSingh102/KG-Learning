package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_1_Abstraction;

public abstract class Vehicle
{
    private int noOfTires;

    public abstract void makeStartSound();

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute()
    {
        System.out.println("Going................");
    }
}

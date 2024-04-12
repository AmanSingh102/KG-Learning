package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_2_Interface;

public abstract class Vehicle implements Transport
{
    private int noOfTires;

    public abstract void makeStartSound();

    @Override
    public void getSetGo()
    {
        System.out.println("Going to anywhere.........");
    }

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

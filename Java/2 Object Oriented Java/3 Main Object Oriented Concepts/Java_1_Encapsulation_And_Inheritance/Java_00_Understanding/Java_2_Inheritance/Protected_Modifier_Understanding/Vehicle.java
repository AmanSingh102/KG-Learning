package Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_2_Inheritance.Protected_Modifier_Understanding;

public class Vehicle
{
    protected int noOfTires;
    private  int noOfBrakes;
    public void commute()
    {
        System.out.printf("I am going from place A to B using %d\n",noOfTires);
        System.out.printf("I have %d Brakes\n",noOfBrakes);
    }

    public void setNoOfBrakes( int noOfBrakes )
    {
        this.noOfBrakes = noOfBrakes;
    }

    @Override
    public String toString()
    {
        return  "Vehicle :-" +
                "\nNumber of tires : " + noOfTires;
    }
}

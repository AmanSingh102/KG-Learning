package Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_2_Inheritance;

public class Motor_Cycle extends Two_Wheeler
{
    private double petrolCapacity;

    public void setPetrolCapacity(double petrolCapacity)
    {
        this.petrolCapacity = petrolCapacity;
    }
    public void start()
    {
        System.out.println("Starting......");
    }
}

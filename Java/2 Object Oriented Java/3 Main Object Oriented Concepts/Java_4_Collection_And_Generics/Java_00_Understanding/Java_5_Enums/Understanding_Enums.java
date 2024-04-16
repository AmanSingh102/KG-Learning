package Java_4_Collection_And_Generics.Java_00_Understanding.Java_5_Enums;

public class Understanding_Enums
{
    public static void main(String[] args)
    {
        Traffic_Light color = Traffic_Light.RED;
        color = Traffic_Light.GREEN;
        color = Traffic_Light.YELLOW;

        Grade grade = Grade.A;

        Grade grade1 = Grade.valueOf("D");
        for (Grade value : Grade.values())
        {
            System.out.println("Grade is " + value);
        }
    }
}

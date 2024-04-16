package Java_4_Collection_And_Generics.Java_54_WeekDay_And_Weekend;

public class Week_Test
{
    public static void main(String[] args)
    {
        System.out.println("Printing all the days of the week");

        for ( Day day : Day.values() )
        {
            System.out.printf("%s : %S\n",day,day.getType());
        }
    }
}

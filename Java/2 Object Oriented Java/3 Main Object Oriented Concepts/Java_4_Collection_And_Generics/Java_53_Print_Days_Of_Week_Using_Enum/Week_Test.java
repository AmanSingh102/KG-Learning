package Java_4_Collection_And_Generics.Java_53_Print_Days_Of_Week_Using_Enum;

public class Week_Test
{
    public static void main(String[] args)
    {
        System.out.println("Printing all the days of the week");
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDUESDAY);
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);


        System.out.println("\nUsing Loop ------>");
        for (Day day : Day.values())
        {
            System.out.println(day);
        }
    }
}

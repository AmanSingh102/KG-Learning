import java.util.Scanner;

public class Java_14_Leap_Year 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        if( year % 400 == 0 )
        System.out.println("this is a leap year");
        else if( year % 100 == 0 )
        System.out.println("this is not a leap year");
        else if( year % 4 == 0 )
        System.out.println("this is a leap year");
        else
        System.out.println("this is not a leap year");

        System.out.println("\n---- Another Way ----");
        if( year % 400 == 0 )
        System.out.println("this is a leap year");
        else if( year % 4 == 0 && year % 100 != 0  )
        System.out.println("this is a leap year");
        else
        System.out.println("this is not a leap year");

        System.out.println("\n---- Another Way ----");
        if( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) )
        System.out.println("this is a leap year");
        else
        System.out.println("this is not a leap year");

        sc.close();
    }
}

import java.util.Scanner;

public class Java_33_Check_Armstrong_Number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in)   ;

            System.out.println("\n---- Check Armstrong Number Program ----\n");

            System.out.print("Enter the Number : ");
            int num = sc.nextInt();

            boolean armstrong = isArmstrong(num);
            
            if( armstrong ) { System.out.println("Your number is Arstrong Number"); }
            else            { System.out.println("Your number is not Arstrong Number"); }

            System.out.println("\n----------------------------------------------\n");

        sc.close();
    }

    public static boolean isArmstrong( int num )
    {
        int numCopy = num;
        int noOfdigits = numberOfDigits(num);
        int finalNumber = 0;

        while( num > 0 )
        {
            int lastDigit = num % 10;
            num = num / 10; 
            finalNumber = finalNumber + power(lastDigit, noOfdigits);
        }

        return finalNumber == numCopy;
    }

    public static int power( int num1, int num2 )
    {
        int result = 1;
        
        int i = 0;
        while( i < num2 )
        {
            result = result * num1;
            i++;
        }

        return result;
    }

    public static int numberOfDigits( int num )
    {
        int digits = 0;

        while( num > 0 )
        {
            digits++;
            num = num / 10;
        }
        return digits;
    }
}
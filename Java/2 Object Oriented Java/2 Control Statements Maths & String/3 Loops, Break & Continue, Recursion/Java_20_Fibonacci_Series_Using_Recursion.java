import java.util.Scanner;

public class Java_20_Fibonacci_Series_Using_Recursion 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Fibonacci Series Using Recursion upto a certain digit ----\n");   
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of elements to be printed : ");
            int count = sc.nextInt();

            System.out.print("Fibonacci Series : ");
            for( int i = 1; i < count; i++ )
            {
                System.out.print( fiibonacci(i) + " " );
            }

        sc.close();
        System.out.println("\n\n---------------------------------------------------------------\n");
    }

    public static int fiibonacci( int position )
    {
        //System.out.print(".");     // dekhne ke liye ki ye function kitni bar call huwa

        if( position == 1 ) 
        { 
            return 0; 
        }
        if( position == 2 )
        {
            return 1;
        }

        return fiibonacci( position - 1 ) + fiibonacci( position - 2 );
    }
}

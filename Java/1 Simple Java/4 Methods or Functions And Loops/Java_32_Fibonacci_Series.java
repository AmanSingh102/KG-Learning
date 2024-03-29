import java.util.Scanner;

public class Java_32_Fibonacci_Series 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("\n---- Fibonacci Series Program ----\n");

            System.out.print("Enter an Integer : ");
            int num = sc.nextInt();

            System.out.print("Fibonacci Series : ");
            printFibonacci(num);

            System.out.println("\n\n----------------------------------\n");

        sc.close();    
    }

    public static void printFibonacci( int num )
    {
        if( num < 0 ) return;
        System.out.print("0 ");
        if( num == 0 ) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while( first + second <= num )
        {
            int thrid = first + second;
            System.out.print(thrid + " ");

            first = second;
            second = thrid;
        }
    }
}

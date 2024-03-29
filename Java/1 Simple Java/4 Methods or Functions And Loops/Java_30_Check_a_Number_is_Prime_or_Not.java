import java.util.Scanner;

public class Java_30_Check_a_Number_is_Prime_or_Not 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n---- Check a number is Prime or not Program ----\n");

            System.out.print("Enter the Number : ");
            int num = sc.nextInt();

            boolean isPrime = isPrime(num);

            if( isPrime ) { System.out.println("Your number is Prime number"); }
            else          { System.out.println("Your number is not Prime number"); }

            System.out.println("\n------------------------------------------------\n");
         
        sc.close();      
    }

    public static boolean isPrime( int num )
    {
        int i = 2;
        while( i < num )
        {
            if( num % i == 0 ) { return false; }
            i++;
        }
        
        return true;
    }
}

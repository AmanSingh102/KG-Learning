import java.util.Scanner;

public class Java_14_Prime_Or_Not_For_Loop 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Checker Prime Number Program ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Please, Enter the number : ");
            int num = sc.nextInt();

            boolean isPrime = isPrime(num);

            System.out.println("Your number is " + ( isPrime ? "Prime" : "Not Prime"));
            
        sc.close();

        System.out.println("\n--------------------------------------\n");
    }
    
    public static boolean isPrime( int num )
    {
        for( int i = 2; i < num; i++ )
        {
            if( num % i == 0 )
            {
                return false;
            }
        }

        return true;
    }
}

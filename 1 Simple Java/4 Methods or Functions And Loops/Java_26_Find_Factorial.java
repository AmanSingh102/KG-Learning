import java.util.Scanner;

public class Java_26_Find_Factorial 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Factorial Program ----\n");   
        factorialMethod();
    }

    public static void factorialMethod()
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter an Integer : ");
            long num = sc.nextLong();

            if( num < 2 ) 
            { 
                System.out.printf("Factorial of %d is %d",num,1); 
                System.out.println("\n\n----------------------------\n");
            }
            else
            {
                long fact = 1;
                for( int i = 2; i <= num; i++ )
                {
                    fact = fact * i;
                }
        
                System.out.printf("Factorial of %d is %d",num,fact);
                System.out.println("\n\n----------------------------\n");
            }

        sc.close();
    }
}

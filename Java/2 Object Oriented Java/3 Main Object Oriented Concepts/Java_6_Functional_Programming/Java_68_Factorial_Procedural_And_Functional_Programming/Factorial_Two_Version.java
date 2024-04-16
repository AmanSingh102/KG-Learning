package Java_6_Functional_Programming.Java_68_Factorial_Procedural_And_Functional_Programming;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial_Two_Version
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Factorial Using Two Ways ----\n");
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number : ");
            int num = sc.nextInt();
        sc.close();

        System.out.println("\n-- Normal Way Factorial --");
        System.out.printf("Factorial of %d = %d",num,factorial(num));

        System.out.println("\n\n-- Functional Way Factorial --");
        System.out.printf("Factorial of %d = ",num);
        IntStream.rangeClosed(2,num)
                        .reduce(( a,b ) -> a * b )
                        .ifPresent(System.out :: print);

        System.out.println("\n\n----------------------------------\n");
    }

    public static long factorial( int num )
    {
        if( num == 0 || num == 1 )  { return 1; }

        long fact = 1;
        for ( int i = 2; i <= num; i++ )
        {
            fact *= i;
        }

        return fact;
    }
}

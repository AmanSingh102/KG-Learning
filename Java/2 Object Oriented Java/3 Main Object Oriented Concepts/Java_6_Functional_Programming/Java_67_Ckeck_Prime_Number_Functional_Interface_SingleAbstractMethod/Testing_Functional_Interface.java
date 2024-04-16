package Java_6_Functional_Programming.Java_67_Ckeck_Prime_Number_Functional_Interface_SingleAbstractMethod;

import java.util.Scanner;

public class Testing_Functional_Interface
{
    public static void main(String[] args)
    {
        Candidate candidate = num ->
        {
            for ( int i = 2; i < num; i++ )
            {
                if( num % i == 0 )
                {
                    return false;
                }
            }
            return true;
        };

        System.out.println("\n---- Prime Number Checker ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter an Integer : ");
            int integer = sc.nextInt();
            System.out.printf("%d is Prime Number : %s",integer,candidate.isCandidate(integer));

        sc.close();
        System.out.println("\n------------------------------\n");
    }
}

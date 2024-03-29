import java.util.Scanner;

public class Java_29_Find_GCD_Of_Two_Numbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n---- Find GCD of Two Numbers Program ----\n");

            System.out.print("Enter 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();

            int GCD = findGCD(num1,num2);
            System.out.printf("GCD of %d and %d : %d",num1,num2,GCD);

            System.out.println("\n\n-----------------------------------------\n");
         
        sc.close();    

    }
    
    public static int findGCD( int first, int second )
    {
        int gcd = 1;
        
        int i = 2;
        int least = findLeastNumber(first, second);

        while( i <= least ) 
        {
            if( first % i == 0 && second % i == 0 )
            {
                gcd = i;
            }
            i++;
        }

        return gcd;
    }

    public static int findLeastNumber( int first, int second )
    {
        if( first > second ) { return first; }
        else { return second; }
    }
}

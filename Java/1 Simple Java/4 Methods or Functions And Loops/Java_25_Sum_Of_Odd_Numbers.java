import java.util.Scanner;

public class Java_25_Sum_Of_Odd_Numbers 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Sum Of Odd Numbers Program ----\n");
        sumOfOddNumbersMethod();        
    }

    public static void sumOfOddNumbersMethod()
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter an Integer = ");
            int integer = sc.nextInt();

            int sum = 0;
            
            for( int i = 1; i <= integer ; i += 2 )
            {
                sum = sum + i;
            }

            System.out.println("The Sum of Odd Numbers are " + sum);
            System.out.println("\n-------------------------------------\n");

        sc.close();
    }
}

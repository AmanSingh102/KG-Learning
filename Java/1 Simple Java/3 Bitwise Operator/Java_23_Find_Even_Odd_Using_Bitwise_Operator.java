import java.util.Scanner;

public class Java_23_Find_Even_Odd_Using_Bitwise_Operator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n---- Check Even/Odd using Bitwise Operator ----");
            System.out.print("Enter an Integer : ");
            int integer = sc.nextInt();

            if( ( integer & 1 ) == 1 )
            System.out.printf("%d is Odd Number",integer);
            else
            System.out.printf("%d is Even Number",integer);

            System.out.println("\n-----------------------------------------------\n");
            
        sc.close();
    }
}

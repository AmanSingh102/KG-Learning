import java.util.Scanner;

public class Java_31_Reverse_the_Digit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n---- Reverse the Digit Program ----\n");

            System.out.print("Enter the Number : ");
            int num = sc.nextInt();

            int reversenum = reverseNumber(num);
            System.out.println("Reverse Number : " + reversenum);

            System.out.println("\n-----------------------------------\n");

        sc.close();
    }

    public static int reverseNumber( int num )
    {
        int newNum = 0;
        while( num > 0 )
        {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        
        return newNum;
    }
}

import java.util.Scanner;

public class Java_34_Check_Palindrome_Number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("\n---- Check Palindrome Number ----\n");

            System.out.print("Enter the Number : ");
            int num = sc.nextInt();

            boolean isPalindrome = isPalindrome(num);

            if( isPalindrome ) { System.out.println("Your number is a Palindrome Number"); }
            else               { System.out.println("Your number is not a Palindrome Number"); }
        
            System.out.println("\n---------------------------------\n");

        sc.close();
    }  
    
    public static boolean isPalindrome( int num )
    {
        return num == reverseNumber(num);
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

import java.util.Scanner;

public class Java_21_Palindrome_String_Using_Recursion 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Palindrome String Checker ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the string to be checked : ");
            String string = sc.next();

            System.out.println("Your String is " + ( isPlaindrome(string) ? "Palindrome" : "Not Palindrome") );

        sc.close();
        System.out.println("\n-----------------------------------\n");
    }

    public static boolean isPlaindrome( String string )
    {
        if( string.length() <= 1 )
        {
            return true;
        }

        int lastPosition = string.length() - 1;
        if( string.charAt(0) != string.charAt(lastPosition) )
        {
            return false;
        }

        String newString = string.substring(1, lastPosition);
        return isPlaindrome(newString);
    }
}

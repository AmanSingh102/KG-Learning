public class Java_45_Check_Array_Is_Palindrome_Or_Not 
{
    public static void main(String[] args) 
    {
        System.out.println("\n--------- Array Palindrome Checker Program ---------\n");

        int[] numArray = Java_39_Array_Utilitiy.inputArray();

        boolean isPalindrome = isPalindrome(numArray);

        if( isPalindrome )  System.out.println("\nYour array is Palindrome Array !!!!");
        else                System.out.println("\nYour array is NOT Palindrome Array !!!!");

        System.out.println("\n-----------------------------------------------------\n");
    }

    public static boolean isPalindrome( int[] numArray ) 
    {
        for( int i = 0; i < numArray.length / 2; i++ )
        {
            if( numArray[i] != numArray[ numArray.length - 1 - i ] )
            {
                return false;
            }
        }

        return true;   
    }
}

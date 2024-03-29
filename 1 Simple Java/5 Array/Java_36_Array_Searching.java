import java.util.Scanner;

public class Java_36_Array_Searching 
{
    public static void main(String[] args) 
    {
        System.out.println("\n-------- Array Seaching Program --------\n");
        
        Scanner sc = new Scanner(System.in);

            int[] arr = { 1,2,5,7,99,6,54,34,22 };
            System.out.print("Enter the number you want to Search : ");
            int num = sc.nextInt();

            boolean isFound = isFound(arr, num);

            if( isFound )   { System.out.println("Your number is found in an array"); }
            else            { System.out.println("Your number is not found in an array"); }

            System.out.println("\n---------------------------------------------\n");

        sc.close();
    }

    public static boolean isFound( int[] arr, int num ) 
    {
        for( int index = 0; index < arr.length; index++ )
        {
            if( arr[index] == num )
            {
                return true;
            }
        }
        return false;   
    }
}
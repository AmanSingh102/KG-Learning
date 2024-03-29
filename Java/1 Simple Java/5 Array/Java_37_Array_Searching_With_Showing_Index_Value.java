import java.util.Scanner;

public class Java_37_Array_Searching_With_Showing_Index_Value 
{
    public static void main(String[] args) 
    {
        System.out.println("\n-------- Array Seaching Program With Show Index Value --------\n");
        
        Scanner sc = new Scanner(System.in);

            int[] arr = { 1,2,5,7,99,6,54,34,22,55,44 };
            System.out.print("Enter the number you want to Search : ");
            int num = sc.nextInt();

            boolean isFound = isFound(arr, num);

            if( isFound == false )  { System.out.println("Your number is NOT found in an array"); }

            System.out.println("\n--------------------------------------------------------------\n");

        sc.close();
    }

    public static boolean isFound( int[] arr, int num ) 
    {
        for( int index = 0; index < arr.length; index++ )
        {
            if( arr[index] == num )
            {
                System.out.printf("Your number is found in an array\nIndex Value : %d\n",index);
                return true;
            }
        }
        return false;   
    }   
}

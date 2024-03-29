import java.util.Scanner;

public class Java_41_Max_Min_Of_Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            
            System.out.println("\n---- Maximum and Minimum of an Array Program ----\n");
            int[] numArray = Java_39_Array_Utilitiy.inputArray();

            int max = max(numArray);
            int min = min(numArray);

            System.out.println("\nMax of the Array is : " + max);
            System.out.println("Min of the Array is : " + min);

            System.out.println("\n--------------------------------------------------\n");

        sc.close();
    }

    public static int max( int[] numArray )
    {
        if( numArray.length == 0)   { return Integer.MIN_VALUE; }

        int max = numArray[0];
        for( int i = 1; i < numArray.length; i++ )
        {
            if( max < numArray[i])
            {
                max = numArray[i];
            }
        }

        return max;
    }

    public static int min( int[] numArray )
    {
        int min = Integer.MAX_VALUE;

        for( int i = 0; i < numArray.length; i++ )
        {
            if( min > numArray[i] )
            {
                min =  numArray[i];
            }
        }

        return min;
    }
}

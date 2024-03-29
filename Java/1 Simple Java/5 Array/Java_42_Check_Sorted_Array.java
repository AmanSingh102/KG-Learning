public class Java_42_Check_Sorted_Array 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Sorted Array Checker Program ----\n");
        int[] numArray = Java_39_Array_Utilitiy.inputArray();

        boolean isDec = isDecreasing(numArray);
        boolean isInc = isIncreasing(numArray);

        if( isInc || isDec )
        {
            System.out.println("\nYour Arrsy is Sorted");
        }
        else
        {
            System.out.println("\nYour Arrsy NOT is Sorted");
        }

        System.out.println("\n---------------------------------------\n");

    }
    
    public static boolean isIncreasing( int[] numArray )
    {
        for( int i = 1; i < numArray.length; i++ )
        {
            if( numArray[i] > numArray[ i - 1] )
            {
                return false;
            }
        }

        return true;
    }

    public static boolean isDecreasing( int[] numArray )
    {
        for( int i = 1; i < numArray.length; i++ )
        {
            if( numArray[i] < numArray[ i - 1] )
            {
                return false;
            }
        }

        return true;
    }
}

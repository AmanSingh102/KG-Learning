public class Java_44_Array_Reverse_Program 
{
    public static void main(String[] args) 
    {
        System.out.println("\n-------- Array Reverse Program --------\n");
        
        int[] numArray = Java_39_Array_Utilitiy.inputArray();
        reverseArray(numArray);

        System.out.println("\nHere, Your reverse array is ------>");
        Java_39_Array_Utilitiy.displayArray(numArray);
        
        System.out.println("\n---------------------------------------\n");
    }

    public static void reverseArray( int[] array )
    {
        for( int i = 0; i < array.length / 2; i++ )
        {
            int swap = array[i];
            array[i] = array[ ( array.length - 1 ) - i ];
            array[ ( array.length - 1 ) - i ] = swap;
        }
    }
}

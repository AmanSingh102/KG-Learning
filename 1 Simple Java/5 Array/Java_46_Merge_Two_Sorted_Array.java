public class Java_46_Merge_Two_Sorted_Array 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Merge Two Sorted Array ----\n");

        int[] numArray1 = Java_39_Array_Utilitiy.inputArray();
        System.out.println("\nAnother Array --------->\n");
        int[] numArray2 = Java_39_Array_Utilitiy.inputArray();       

        int[] mergeArray = mergeArray(numArray1, numArray2);

        System.out.println("\nYour merged sorted array is ------>");
        Java_39_Array_Utilitiy.displayArray(mergeArray);

        System.out.println("\n-------------------------------\n");
    }   

    public static int[] mergeArray( int[] numArray1, int[] numArray2 )
    {
        int newSize = numArray1.length + numArray2.length;
        int[] newArray = new int[newSize];

        int i = 0, j = 0, k = 0;
        while( i < numArray1.length || j < numArray2.length )
        {
            if( j == numArray2.length || ( i < numArray1.length && numArray1[i] < numArray2[j] ) )
            {
                newArray[k] = numArray1[i];
                i++;
                k++;
            }
            else
            {
                newArray[k] = numArray2[j];
                k++;
                j++;
            }
        }

        // USING FOR LOOP
        // for( int i = 0, j = 0, k = 0; i < numArray1.length || j < numArray2.length; )
        // {
        //     if( j == numArray2.length || ( i < numArray1.length && numArray1[i] < numArray2[j] ) )
        //     {
        //         newArray[k] = numArray1[i];
        //         i++;
        //         k++;
        //     }
        //     else
        //     {
        //         newArray[k] = numArray2[j];
        //         k++;
        //         j++;
        //     }
        // }

        return newArray;
    }
}
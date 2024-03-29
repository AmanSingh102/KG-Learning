import java.util.Scanner;

public class Java_43_Create_A_New_Array_Delete_Specific_Array 
{
    public static void main(String[] args) 
    {   

        Scanner sc = new Scanner(System.in);
       
            System.out.println("\n------------ Array Deletion Program ------------\n");
                
            int[] numArray = Java_39_Array_Utilitiy.inputArray();

            System.out.print("\nNow, enter the number you want to delete : ");
            int numToDelete = sc.nextInt(); 

            int[] newArray = deleteNumber(numArray, numToDelete);

            System.out.println("\nHere is your new Array --------->");  
            Java_39_Array_Utilitiy.displayArray(newArray);

            System.out.println("\n-------------------------------------------------\n");      

        sc.close();
    }

    
    public static int[] deleteNumber( int[] numArray, int numToDelete ) 
    {
        int occurrence = Java_40_Find_Number_Of_Occurrence.noOfOccurrence( numArray, numToDelete );

        if( occurrence == 0 )   { return numArray; }

        int newSize = numArray.length - occurrence;
        int[] newArray = new int[newSize];

        int i = 0, j = 0;
        while ( i < numArray.length ) 
        {
            if( numArray[i] != numToDelete )
            {
                newArray[j] = numArray[i];
                j++;
            }

            i++;
        }

        // AMOTHER WAY 
        // for( int i = 0, j = 0; i < numArray.length; i++, j++)
        // {
        //     if( numArray[i] != numToDelete )
        //     {
        //         newArray[j] = numArray[i];
        //     }
        // }

        return newArray;
    }
}

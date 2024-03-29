import java.util.Scanner;

public class Java_40_Find_Number_Of_Occurrence 
{
    public static void main(String[] args) 
    {
        System.out.println("\n------------ Array Occurrence Program ------------\n");

        Scanner sc = new Scanner(System.in);

            int[] numArray = Java_39_Array_Utilitiy.inputArray();

            System.out.print("\nEnter the Number you want to find : ");
            int number = sc.nextInt();

            int occurrence = noOfOccurrence( numArray, number);
            System.out.println("Your element is found " + occurrence + " times in the array");

            System.out.println("\n--------------------------------------------------\n");
        
        sc.close(); 
    }

    public static int noOfOccurrence( int[] numArray, int num )
    {
        int occurrence = 0;

        for( int i = 0; i < numArray.length; i++ )
        {

            if( numArray[i] == num )
            {
                occurrence++;
            }
        }

        return occurrence;
    }
}

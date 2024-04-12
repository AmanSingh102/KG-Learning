import java.util.Scanner;

public class Java_16_Occurrence_Of_Specific_Element_Array_For_Each_Loop  
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Occurrence of Specific Element Program ----\n");  
        Scanner sc = new Scanner(System.in);

            int[] numArray = Array_Utilitiy.inputArray();

            System.out.print("\nNow, enter the number you want to search : ");
            int element = sc.nextInt();

            int occ = countOccurrence(numArray, element);

            System.out.println("Your element was found " + occ + " times.");

        sc.close();  
        System.out.println("\n------------------------------------------------\n"); 
    }

    public static int countOccurrence( int[] numArray, int element )
    {
       int occ = 0;
       for( int num : numArray )
       {
            if( num == element )
            {
                occ ++;
            }
       } 

        return occ;
    }
}

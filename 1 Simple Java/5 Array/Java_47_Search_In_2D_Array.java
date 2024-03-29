import java.util.Scanner;

public class Java_47_Search_In_2D_Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n-------- Search 2d Array Program --------\n");    

            int[][] numArray = Java_39_Array_Utilitiy.input2DArray();

            System.out.print("\nNow, enter the number you want to search : ");
            int number = sc.nextInt();

            boolean isFound = searchArray(numArray, number);

            if( isFound )   System.out.println("Your number was found !!!");
            else            System.out.println("Your number was NOT found !!!");

            System.out.println("\n-----------------------------------------\n");    

        sc.close();
    }

    public static boolean searchArray( int[][] numArray, int num )
    {
        for( int i = 0; i < numArray.length; i++ )
        {
            for( int j = 0; j < numArray[i].length; j++ )
            {
                if( numArray[i][j] == num )
                {
                    return true;
                }
            }
        }

        return false;
    }    
}

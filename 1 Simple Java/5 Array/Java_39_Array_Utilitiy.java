import java.util.Scanner;

public class Java_39_Array_Utilitiy
{
    public static int[] inputArray()
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Please the Number of an Element : ");
            int size = sc.nextInt();

            int[] number = new int[size];

            for( int i = 0; i < size; i++ )
            {
                System.out.printf("Enter Element No.%d  : ",i+1);
                number[i] = sc.nextInt();
            }
        
        return number;
    }

    public static int[][] input2DArray()
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Please the Number of an Rows : ");
            int rows = sc.nextInt();
            System.out.print("Please the Number of an Columns : ");
            int columns = sc.nextInt();

            System.out.println("\n------------------>");

            int[][] numArray = new int[rows][columns];

            for( int i = 0; i < rows ; i++ )
            {
                for( int j = 0; j < columns; j++ )
                {
                    System.out.printf("Enter Element No.%d%d  : ",i+1,j+1);
                    numArray[i][j] = sc.nextInt();
                }   
            }

            System.out.println("------------------>");
        
        return numArray;
    }

    public static void displayArray( int[] numArray ) 
    {
        for( int i = 0; i < numArray.length; i++ )
        {
            System.out.print( numArray[i] + " " );
        }
        System.out.println();
    }
}

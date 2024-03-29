public class Java_48_Sum_Average_Of_Element_In_2D_Array 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Sum And Average of 2d Array ----\n");   
        int[][] numArray = Java_39_Array_Utilitiy.input2DArray();

        long sum = sum(numArray);
        double average = average(numArray);

        System.out.println("\nYour sum of an array is " + sum);
        System.out.println("Your average of an array is " + average);

        System.out.println("\n--------------------------------------\n");   
    }

    public static long sum( int[][] numArray )
    {
        long sum = 0;
        for( int i = 0; i < numArray.length; i++ )
        {
            for( int j = 0; j < numArray[i].length; j++ )
            {
                sum = sum + numArray[i][j];
            }
        }

        return sum;
    }

    public static double average( int[][] numArray ) 
    {
        if( numArray.length == 0 )  { return 0; }

        int rows = numArray.length;
        int columns = numArray[0].length;

        double size = rows * columns;

        return sum(numArray) / size ;
    }
}
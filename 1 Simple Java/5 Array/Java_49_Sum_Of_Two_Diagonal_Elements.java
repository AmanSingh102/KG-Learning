public class Java_49_Sum_Of_Two_Diagonal_Elements 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Sum of Digonals of 2D Array ----\n");

        int[][] numArray = Java_39_Array_Utilitiy.input2DArray();

        long sumOfDiagonals = sumOfDiagonals(numArray);
        System.out.println("\nSum of Diagonal is : " + sumOfDiagonals);

        System.out.println("\n-------------------------------------\n");
    }

    public static long sumOfDiagonals( int[][] numArray )
    {
        long leftSum = sumOfLeftDiagonals(numArray);
        long rightSum = sumOfRightDiagonals(numArray);
        long sum = leftSum + rightSum;

        if( numArray.length % 2 != 0)   
        {
            int index = numArray.length / 2;
            sum = sum - numArray[index][index];
        }

        return sum;
    }

    public static long sumOfLeftDiagonals( int[][] numArray )
    {
        long sum = 0;
        for( int i = 0; i < numArray.length; i++ )
        {
            sum = sum + numArray[i][i];
        }

        return sum;
    }

    public static long sumOfRightDiagonals( int[][] numArray )
    {
        long sum = 0;
        for( int i = 0; i < numArray.length; i++ )
        {
            int columns = numArray.length - 1 - i;
            sum = sum + numArray[i][columns]; 
        }

        return sum;
    }
}

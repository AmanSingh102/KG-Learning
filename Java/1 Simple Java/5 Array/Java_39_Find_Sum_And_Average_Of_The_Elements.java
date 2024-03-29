public class Java_39_Find_Sum_And_Average_Of_The_Elements 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Find Sum and Average of the Elements Program ----\n");  

        int[] numArray = Java_39_Array_Utilitiy.inputArray();

        long sum = sum(numArray);
        double average =average(numArray);

        System.out.println("\nSum of the number is " + sum);
        System.out.println("Average of the number is " + average);

        System.out.println("\n------------------------------------------------------\n");
    }

    public static long sum( int[] numArray )
    {
        long sum = 0;
        for( int i = 0; i < numArray.length; i++ )
        {
            sum = sum + numArray[i];
        }

        return sum;
    }

    public static double average( int[] numArray )
    {
        double sum = sum(numArray);
        return ( sum / numArray.length );
    }
}

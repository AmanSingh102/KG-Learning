public class Java_18_Sum_Of_Positive_No_Ignore_Negative_No_Using_Continue 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Sum Of Positive Number And Ignore Negative Number Program ----\n");
        int[] numArray = Array_Utilitiy.inputArray();

        int sum = 0;
        for( int num : numArray )
        {
            if( num < 0 )
            {
                continue;
            }

            sum = sum + num;
        }

        System.out.println("------------------------------");
        System.out.println("Sum of positive number is " + sum);
        System.out.println("\n-------------------------------------------------------------------\n");
    }
}

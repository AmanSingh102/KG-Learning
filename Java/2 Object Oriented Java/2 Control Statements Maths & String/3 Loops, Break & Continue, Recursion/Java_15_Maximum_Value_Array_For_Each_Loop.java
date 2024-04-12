public class Java_15_Maximum_Value_Array_For_Each_Loop 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Maximum Array ----\n");    
        int[] numArray = Array_Utilitiy.inputArray();

        int max = Integer.MIN_VALUE;
        for( int number : numArray )
        {
            if( max < number )
            {
                max = number;
            }
        }

        System.out.println("\nMaximum Number is " + max);
        System.out.println("\n-----------------------\n");    
    }
}

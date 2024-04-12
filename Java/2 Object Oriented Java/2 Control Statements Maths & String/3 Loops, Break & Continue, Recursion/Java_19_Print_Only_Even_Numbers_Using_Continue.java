public class Java_19_Print_Only_Even_Numbers_Using_Continue 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Even Numbers Program ----\n"); 

        for( int i = 1; i < 100; i++ )
        {
            if( i % 2 == 1)
            {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n\n------------------------------\n");
    }
}

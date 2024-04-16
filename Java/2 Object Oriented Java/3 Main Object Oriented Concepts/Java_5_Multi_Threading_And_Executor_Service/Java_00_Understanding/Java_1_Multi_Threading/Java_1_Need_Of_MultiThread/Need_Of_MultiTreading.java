package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_1_Need_Of_MultiThread;

public class Need_Of_MultiTreading
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();



        // First Task
        for (int i = 1; i <= 1000; i++)
        {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n * task is complete");

        // Second Task
        for (int i = 1; i <= 1000; i++)
        {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n $ task is complete");

        // Third Task
        for (int i = 1; i <= 1000; i++)
        {
            System.out.printf("%d# ",i);
        }
        System.out.println("\n # task is complete");



        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken : %d", ( endTime - startTime ) );
    }
}

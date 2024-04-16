package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_2_Create_MultiThread.Java_1_By_Extending_Thread_Class;

public class Extending_Thread_Class
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();

            First_Task t1 = new First_Task();
            Second_Task t2 = new Second_Task();
            Third_Task t3 = new Third_Task();

            System.out.println("\nStarting First Thread");
            t1.start();
            System.out.println("\nStarting Second Thread");
            t2.start();
            System.out.println("\nStarting Third Thread");
            t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken : %d", Thread.currentThread().getName(),
                ( endTime - startTime ) );
    }
}

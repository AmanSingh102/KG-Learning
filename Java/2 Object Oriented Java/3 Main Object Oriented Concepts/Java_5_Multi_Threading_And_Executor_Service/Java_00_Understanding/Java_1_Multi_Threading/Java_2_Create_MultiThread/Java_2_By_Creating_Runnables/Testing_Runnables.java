package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_2_Create_MultiThread.Java_2_By_Creating_Runnables;

public class Testing_Runnables
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();

            PrintTask p1  =new PrintTask('*');
            PrintTask p2  =new PrintTask('$');
            PrintTask p3  =new PrintTask('#');

            Thread t1 = new Thread(p1);
            t1.start();
            Thread t2 = new Thread(p2);
            t2.start();
            new Thread((p3)).start();           // Another way to implement

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken : %d", Thread.currentThread().getName(),
                ( endTime - startTime ) );
    }
}

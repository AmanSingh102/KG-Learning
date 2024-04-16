package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_3_Join_Method;

import Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_2_Create_MultiThread.Java_2_By_Creating_Runnables.PrintTask;

public class Testing_Runnables
{
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

            PrintTask p1  =new PrintTask('*');
            PrintTask p2  =new PrintTask('$');
            PrintTask p3  =new PrintTask('#');

            Thread t1 = new Thread(p1);
            t1.start();
            System.out.println("\nThread 1 started");

            Thread t2 = new Thread(p2);
            t2.start();
            System.out.println("\nThread 2 started");
            t1.join();                                       // t1 apna kam khatam karega tab main thread start karega matlab t3, t1 ke khatam hone ke chalega

            Thread t3 = new Thread(p2);
            t3.start();
            System.out.println("\nThread 3 started");

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken : %d", Thread.currentThread().getName(),
                ( endTime - startTime ) );
    }
}

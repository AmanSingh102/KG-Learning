package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_2_Executor_Service.Java_2_Multiple_Thread_Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Testing_Multiple_Thread_Executor
{
    public static void main(String[] args) throws InterruptedException
    {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++)
        {
            PrintTask task10 = new PrintTask((char) i);
            service.submit(task10);
        }

        service.shutdown();
        System.out.println("\n************************************1");

        if( ! service.awaitTermination(10, TimeUnit.SECONDS) )
        {
            System.out.println("\n************************************2");
            service.shutdownNow();
        }

    }
}

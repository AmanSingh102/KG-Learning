package Java_5_Multi_Threading_And_Executor_Service.Java_61_Fixed_Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThread_Executor_Service
{
    public static void main(String[] args)
    {
        try (ExecutorService service = Executors.newFixedThreadPool(5))
        {
            for (int i = 0; i < 10; i++)
            {
                Sleep_Task task = new Sleep_Task();
                service.submit(task);
            }

            service.shutdown();

            if( !service.awaitTermination(10, TimeUnit.SECONDS ))
            {
                System.out.println("EMERGENCY SHUTDOWN");
                service.shutdownNow();
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

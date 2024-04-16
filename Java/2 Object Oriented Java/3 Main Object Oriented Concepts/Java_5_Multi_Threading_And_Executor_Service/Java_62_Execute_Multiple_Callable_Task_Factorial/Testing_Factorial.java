package Java_5_Multi_Threading_And_Executor_Service.Java_62_Execute_Multiple_Callable_Task_Factorial;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Testing_Factorial
{
    public static void main(String[] args)
    {
        try (ExecutorService service = Executors.newFixedThreadPool(3))
        {
            List<Future<Integer>> list = new ArrayList<>();

            for (int i = 0; i < 10; i++)
            {
                Factorial_Calculator task = new Factorial_Calculator(i);
                list.add(service.submit(task));
            }

            for (Future<Integer> integerFuture : list)
            {
                System.out.printf("\nResult : %s",integerFuture.get());
            }

            service.shutdown();

            if(service.awaitTermination(10, TimeUnit.SECONDS))
            {
                System.out.println("\nBahut huwa bass rehnedo.........");
                service.shutdown();
            }

        }
        catch ( InterruptedException | ExecutionException e)
        {
            throw new RuntimeException(e);
        }
    }
}

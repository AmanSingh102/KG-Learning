package Java_5_Multi_Threading_And_Executor_Service.Java_60_Print_1To10_Using_Single_Thread_Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Single_Thread_Executor_Service
{
    public static void main(String[] args)
    {
        try (ExecutorService service = Executors.newSingleThreadExecutor())
        {
            Print_Numbers task = new Print_Numbers();
            service.submit(task);
        }
    }
}

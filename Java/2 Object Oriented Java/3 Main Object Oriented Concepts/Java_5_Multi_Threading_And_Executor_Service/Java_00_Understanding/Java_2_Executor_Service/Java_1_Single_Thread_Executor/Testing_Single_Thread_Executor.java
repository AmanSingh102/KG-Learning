package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_2_Executor_Service.Java_1_Single_Thread_Executor;

import Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_2_Create_MultiThread.Java_2_By_Creating_Runnables.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Testing_Single_Thread_Executor
{
    public static void main(String[] args)
    {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintTask task1 = new PrintTask('*');
        PrintTask task2 = new PrintTask('&');
        PrintTask task3 = new PrintTask('#');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();
    }
}

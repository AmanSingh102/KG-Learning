package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_2_Executor_Service.Java_3_Returning_Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Testing_Returning_Futures
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Fetch_Name task1 = new Fetch_Name("Aman");
        Fetch_Name task2 = new Fetch_Name("Suhani");
        Fetch_Name task3 = new Fetch_Name("Arab");
        Fetch_Name task4 = new Fetch_Name("Hasina");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("\nFull Name : %s",name1.get());
        System.out.printf("\nFull Name : %s",name2.get());
        System.out.printf("\nFull Name : %s",name3.get());
        System.out.printf("\nFull Name : %s",name4.get());

        service.shutdown();
    }
}

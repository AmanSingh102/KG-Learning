package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_2_Executor_Service.Java_3_Returning_Futures;

import java.util.concurrent.Callable;
public class Fetch_Name implements Callable<String>
{
    private final String name;

    public Fetch_Name(String name)
    {
        this.name = name;
    }

    @Override
    public String call() throws Exception
    {
        System.out.printf("\nGetting full name of %s from server",name);
        Thread.sleep(4000);
        return name + " Bhartiya";
    }
}

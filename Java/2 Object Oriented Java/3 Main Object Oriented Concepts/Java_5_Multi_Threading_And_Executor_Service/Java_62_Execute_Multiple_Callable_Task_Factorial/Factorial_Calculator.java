package Java_5_Multi_Threading_And_Executor_Service.Java_62_Execute_Multiple_Callable_Task_Factorial;

import java.util.concurrent.Callable;

public class Factorial_Calculator implements Callable< Integer >
{
    private final int number;

    public Factorial_Calculator(int number)
    {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception
    {
        Thread.sleep(2000);
        if( number <= 1 )
        {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= number; i++)
        {
            result = result * i;
        }

        return result;
    }
}

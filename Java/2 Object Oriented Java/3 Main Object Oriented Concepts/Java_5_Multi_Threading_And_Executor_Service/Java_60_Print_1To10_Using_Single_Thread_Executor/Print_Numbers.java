package Java_5_Multi_Threading_And_Executor_Service.Java_60_Print_1To10_Using_Single_Thread_Executor;

public class Print_Numbers implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("Number : %d\n",i+1);
        }
    }
}

package Java_5_Multi_Threading_And_Executor_Service.Java_57_Print_Steps_Of_Each_Significant_Event;

public class Thread_State extends Thread
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(4000);
            System.out.printf("\nFrom inside run : %s", getState());
        }
        catch ( InterruptedException e )
        {
            throw new RuntimeException(e);
        }
    }
}

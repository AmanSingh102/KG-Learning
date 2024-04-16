package Java_5_Multi_Threading_And_Executor_Service.Java_61_Fixed_Thread_Pool;

public class Sleep_Task implements Runnable
{
    @Override
    public void run()
    {
        Thread current = Thread.currentThread();
        System.out.printf("Started with Thread : %s\n", current.getName());

        try
        {
            Thread.sleep(getRandomNumber() * 1000 );
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        System.out.printf("Ended with Thread : %s\n", current.getName());
    }

    private int getRandomNumber()
    {
        double random = Math.random() * 5 +1;
        return (int) random;
    }
}

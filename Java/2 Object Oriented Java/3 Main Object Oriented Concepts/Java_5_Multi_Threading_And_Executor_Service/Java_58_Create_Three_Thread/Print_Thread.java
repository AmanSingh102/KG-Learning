package Java_5_Multi_Threading_And_Executor_Service.Java_58_Create_Three_Thread;

public class Print_Thread extends Thread
{
    private final int threadNumber;

    public Print_Thread(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run ()
    {

        System.out.printf("%s Thread Starting - %d\n", Thread.currentThread().getName(), threadNumber);

        try
        {
            Thread.sleep(5000);
        } catch ( InterruptedException e )
        {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ended - %d\n", Thread.currentThread().getName(), threadNumber);

    }
}

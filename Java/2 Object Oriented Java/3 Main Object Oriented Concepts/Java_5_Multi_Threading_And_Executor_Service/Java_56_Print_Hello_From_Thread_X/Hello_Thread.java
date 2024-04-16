package Java_5_Multi_Threading_And_Executor_Service.Java_56_Print_Hello_From_Thread_X;

public class Hello_Thread extends Thread
{
    private final int threadNumber;

    public Hello_Thread(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run () {
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("( %d ) %s Hello from Thread - %d\n",i + 1,
                    Thread.currentThread().getName(), threadNumber);
        }
    }
}

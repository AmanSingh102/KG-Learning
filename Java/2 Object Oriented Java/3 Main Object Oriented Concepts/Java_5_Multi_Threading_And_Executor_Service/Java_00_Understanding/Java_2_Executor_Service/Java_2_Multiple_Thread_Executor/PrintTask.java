package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_2_Executor_Service.Java_2_Multiple_Thread_Executor;

public class PrintTask implements Runnable
{
    @Override
    public void run()
    {
        // Print Task
        for (int i = 1; i <= 100; i++)
        {
            try {
                Thread.sleep(30);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.printf("\n%s %c task is complete",
                Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;

    public PrintTask(char targetChar)
    {
        this.targetChar = targetChar;
    }
}

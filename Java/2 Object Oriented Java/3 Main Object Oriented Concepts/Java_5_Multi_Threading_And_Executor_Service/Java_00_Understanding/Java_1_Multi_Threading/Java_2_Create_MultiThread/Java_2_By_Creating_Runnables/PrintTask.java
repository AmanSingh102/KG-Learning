package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_2_Create_MultiThread.Java_2_By_Creating_Runnables;

public class PrintTask implements Runnable
{
    @Override
    public void run()
    {
        // Print Task
        for (int i = 1; i <= 1000; i++)
        {
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

package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_4_Synchronize_Keyword;

public class Updater_Thread extends Thread
{
    private final Counter counter;

    public Updater_Thread(Counter counter)
    {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++)
        {
            counter.increment();
        }
    }
}

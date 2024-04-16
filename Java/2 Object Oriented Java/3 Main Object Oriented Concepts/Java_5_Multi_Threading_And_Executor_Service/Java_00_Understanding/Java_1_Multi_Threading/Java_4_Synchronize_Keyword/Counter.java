package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_4_Synchronize_Keyword;

public class Counter
{
    private int count = 0;
    public synchronized void increment()
    {
        count++;
    }
    public int getCount()
    {
        return count;
    }
}

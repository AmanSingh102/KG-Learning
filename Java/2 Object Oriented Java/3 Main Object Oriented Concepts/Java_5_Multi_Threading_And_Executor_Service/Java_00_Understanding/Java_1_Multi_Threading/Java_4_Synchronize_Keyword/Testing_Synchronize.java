package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_4_Synchronize_Keyword;

public class Testing_Synchronize
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();

        Updater_Thread t1 = new Updater_Thread(counter);
        Updater_Thread t2 = new Updater_Thread(counter);



        try
        {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        }
        catch( InterruptedException e )
        {
            System.out.println("Thread interrupted : " +  e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("Final counter value : %d\nTime taken : %d",counter.getCount(), ( endTime - startTime ));
    }
}

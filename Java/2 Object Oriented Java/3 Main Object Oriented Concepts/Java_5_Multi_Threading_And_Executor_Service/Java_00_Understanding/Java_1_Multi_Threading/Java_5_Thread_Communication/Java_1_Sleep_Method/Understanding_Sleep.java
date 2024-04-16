package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_5_Thread_Communication.Java_1_Sleep_Method;

public class Understanding_Sleep
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Before Sleeping, 1 - 5 count karo");
        Thread.sleep(5000);
        System.out.println("Woke up");
    }
}

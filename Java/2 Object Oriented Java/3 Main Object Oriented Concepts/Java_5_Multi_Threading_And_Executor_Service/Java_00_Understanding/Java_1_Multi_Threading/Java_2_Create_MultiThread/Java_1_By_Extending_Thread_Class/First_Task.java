package Java_5_Multi_Threading_And_Executor_Service.Java_00_Understanding.Java_1_Multi_Threading.Java_2_Create_MultiThread.Java_1_By_Extending_Thread_Class;

public class First_Task extends Thread
{
    @Override
    public void run()
    {
        // First Task
        for (int i = 1; i <= 1000; i++)
        {
            System.out.printf("%d* ",i);
        }
        System.out.printf("\n%s * task is complete",Thread.currentThread().getName());
    }
}

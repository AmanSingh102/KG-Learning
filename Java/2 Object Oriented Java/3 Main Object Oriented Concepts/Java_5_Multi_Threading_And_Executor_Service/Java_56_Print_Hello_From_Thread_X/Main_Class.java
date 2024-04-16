package Java_5_Multi_Threading_And_Executor_Service.Java_56_Print_Hello_From_Thread_X;

public class Main_Class
{
    public static void main(String[] args)
    {
        Hello_Thread t1 = new Hello_Thread(1);
        Hello_Thread t2 = new Hello_Thread(2);

        t1.start();
        t2.start();
    }
}

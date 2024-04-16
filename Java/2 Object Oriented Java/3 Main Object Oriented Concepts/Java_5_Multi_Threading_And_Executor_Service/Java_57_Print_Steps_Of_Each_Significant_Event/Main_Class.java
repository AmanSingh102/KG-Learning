package Java_5_Multi_Threading_And_Executor_Service.Java_57_Print_Steps_Of_Each_Significant_Event;

public class Main_Class
{
    public static void main(String[] args) throws InterruptedException {
        Thread_State t1 = new Thread_State();
        System.out.printf("\nCreate the thread : %s", t1.getState());

        t1.start();
        t1.join();

        System.out.printf("\nThread finished : %s", t1.getState());
    }
}

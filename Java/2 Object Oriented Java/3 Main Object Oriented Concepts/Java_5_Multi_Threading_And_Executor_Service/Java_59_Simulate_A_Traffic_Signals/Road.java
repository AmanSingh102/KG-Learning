package Java_5_Multi_Threading_And_Executor_Service.Java_59_Simulate_A_Traffic_Signals;

public class Road
{
    public static void main(String[] args) throws InterruptedException {
        Traffic_Light_Thread red = new Traffic_Light_Thread(Traffic_Colour.RED);
        Traffic_Light_Thread yellow = new Traffic_Light_Thread(Traffic_Colour.YELLOW);
        Traffic_Light_Thread green = new Traffic_Light_Thread(Traffic_Colour.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
    }
}

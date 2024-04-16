package Java_5_Multi_Threading_And_Executor_Service.Java_59_Simulate_A_Traffic_Signals;

public class Traffic_Light_Thread extends Thread
{
    private final Traffic_Colour colour;

    public Traffic_Light_Thread(Traffic_Colour colour)
    {
        this.colour = colour;
    }

    @Override
    public void run() {
        System.out.printf("%s : Active\n", colour);

        try {
            Thread.sleep(colour.getOnTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s : Inactive\n",colour);
    }
}

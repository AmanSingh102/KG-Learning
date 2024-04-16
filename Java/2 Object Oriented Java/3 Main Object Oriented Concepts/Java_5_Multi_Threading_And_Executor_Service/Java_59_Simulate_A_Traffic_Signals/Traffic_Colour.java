package Java_5_Multi_Threading_And_Executor_Service.Java_59_Simulate_A_Traffic_Signals;

public enum Traffic_Colour
{
    RED(9000),
    YELLOW(1000),
    GREEN(3000);
    private final int onTimeInMills;

    public int getOnTimeInMills()
    {
        return onTimeInMills;
    }

    Traffic_Colour(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }
}

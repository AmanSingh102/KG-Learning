package Java_4_Collection_And_Generics.Java_00_Understanding.Java_5_Enums;

public enum Traffic_Light
{
    RED("Stop"), GREEN("Go"), YELLOW("Caution");

    private final String action;

    Traffic_Light(String action)
    {
        this.action = action;
    }
}

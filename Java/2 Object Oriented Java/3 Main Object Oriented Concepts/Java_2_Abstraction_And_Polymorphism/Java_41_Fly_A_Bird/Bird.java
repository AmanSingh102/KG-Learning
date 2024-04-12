package Java_2_Abstraction_And_Polymorphism.Java_41_Fly_A_Bird;

public abstract class Bird implements Flyable
{
    private final String bread;

    public Bird(String bread)
    {
        this.bread = bread;
    }

    public String getBread() {
        return bread;
    }
}

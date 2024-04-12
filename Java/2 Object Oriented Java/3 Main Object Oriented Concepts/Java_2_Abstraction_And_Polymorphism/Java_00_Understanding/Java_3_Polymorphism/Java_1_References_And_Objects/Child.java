package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_3_Polymorphism.Java_1_References_And_Objects;

public class Child implements Parent {
    public int ageOfChild()
    {
        return 13;
    }

    @Override
    public void say()
    {
        System.out.println("Child speaking..........");
    }
}

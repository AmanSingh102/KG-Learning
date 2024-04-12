package Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_4_Nested_And_Inner_Class;

public class Car
{
    private int numberOfDoors;
    public void repair()
    {
        Tyre t = new Tyre();
        Tyre2 t2 = new Tyre2();
    }

    protected static class Tyre
    {
        private double width;
        private double pressure;
        private String material;

        public void inflate()
        {
            //numberOfDoors = 4;    Can be initialised due to static
        }
    }

    protected class Tyre2
    {
        private double width;
        private double pressure;
        private String material;

        public void inflate()
        {
            numberOfDoors = 4;
        }
    }
}

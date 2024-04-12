package Java_2_Abstraction_And_Polymorphism.Java_40_Area_Cicle_And_Square;

public class TestCalculate
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Calculate Area of Circle and Square ----\n");

        Circle circle = new Circle(5);
        System.out.printf("Area of Circle = %5.2f\n",circle.calculateArea());

        Square square = new Square(2);
        System.out.printf("Area of Square = %5.2f",square.calculateArea());

        System.out.println("\n\n---------------------------------------------\n");
    }
}

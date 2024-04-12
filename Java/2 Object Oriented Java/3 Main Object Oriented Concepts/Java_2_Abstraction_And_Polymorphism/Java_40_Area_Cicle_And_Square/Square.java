package Java_2_Abstraction_And_Polymorphism.Java_40_Area_Cicle_And_Square;

public class Square extends Shape
{
    private final double sideInCms;

    public Square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    public double getSideInCms() {
        return sideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow( sideInCms, 2 );
    }
}

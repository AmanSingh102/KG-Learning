import java.util.Scanner;

public class Java_28_Find_Area_And_Circumference_Of_The_Circle 
{
    double radiusInMM;
    
    Java_28_Find_Area_And_Circumference_Of_The_Circle( double radius ) 
    {
        this.radiusInMM = radius;
    }

    double getArea()
    {
        return Math.PI * Math.pow(radiusInMM, 2);
    }

    double getCircumference()
    {
        return 2 * Math.PI * radiusInMM;
    }

    @Override
    public String toString() 
    {
        return  "\nCircle Operations :-" +
                "\nRadius in mm : " + radiusInMM +
                "\nCircumference in mm : " + getCircumference()  +
                "\nArea in mm2 : " + getArea();
    }

    public static void main(String[] args) 
    {
        System.out.println("\n---- Find Circumference & Area of the Circle ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the radius of the circle : ");
            int radius = sc.nextInt();
            
            Java_28_Find_Area_And_Circumference_Of_The_Circle circle = new Java_28_Find_Area_And_Circumference_Of_The_Circle(radius);
            System.out.println(circle);

        sc.close();    
        System.out.println("\n-------------------------------------------------\n");
    }
}

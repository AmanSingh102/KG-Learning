package Java_1_Encapsulation_And_Inheritance.Java_34_Area_Of_Rectangle_Circle.utils;

import Java_1_Encapsulation_And_Inheritance.Java_34_Area_Of_Rectangle_Circle.geometry.Rectangle;
import Java_1_Encapsulation_And_Inheritance.Java_34_Area_Of_Rectangle_Circle.geometry.Circle;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Find Area of Circle and Rectangle Using Packages ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the radius of the Circle : ");
            double radius = sc.nextDouble();

            Circle circle = new Circle(radius);
            double circleArea = Math.PI  * Math.pow(circle.radius, 2);

            System.out.printf( "Area of the Circle : %f\n\n",circleArea );



            System.out.print("Enter the length of the Rectangle : ");
            int length = sc.nextInt();
            System.out.print("Enter the breadth of the Rectangle : ");
            int breath = sc.nextInt();

            Rectangle rectangle = new Rectangle(length,breath);
            double rectangleArea = rectangle.length * rectangle.breadth;

            System.out.printf( "Area of the Rectangle : %f\n",rectangleArea );

        sc.close();
        System.out.println("\n----------------------------------------------------------\n");
    }
}

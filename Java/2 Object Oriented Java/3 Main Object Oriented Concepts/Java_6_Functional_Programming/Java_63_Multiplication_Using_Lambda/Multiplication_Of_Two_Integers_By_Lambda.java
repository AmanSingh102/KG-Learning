package Java_6_Functional_Programming.Java_63_Multiplication_Using_Lambda;

import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Multiplication_Of_Two_Integers_By_Lambda
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Multiplication of two numbers using Lambda Expression ----\n");
            Scanner sc = new Scanner(System.in);

                System.out.print("Enter 1st Number : ");
                int num1 = sc.nextInt();
                System.out.print("Enter 2nd Number : ");
                int num2 = sc.nextInt();

                BinaryOperator< Integer > multiplication = ( a,b ) -> a * b;
                int result = multiplication.apply(num1,num2);
                System.out.printf("Multiplication of %d and %d is %d",num1,num2,result);

            sc.close();
        System.out.println("\n\n----------------------------------------------------\n");
    }
}

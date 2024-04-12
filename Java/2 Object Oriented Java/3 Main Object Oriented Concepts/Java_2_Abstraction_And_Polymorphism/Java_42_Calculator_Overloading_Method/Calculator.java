package Java_2_Abstraction_And_Polymorphism.Java_42_Calculator_Overloading_Method;

public class Calculator
{
    public int add( int num1, int num2 )
    {
        return num1 + num2;
    }

    public int add( int num1, int num2, int num3 )
    {
        return num1 + num2 + num3;
    }

    public double add( double num1, double num2 )
    {
        return num1 + num2;
    }

    public static void main(String[] args)
    {
        Calculator calculate = new Calculator();

        System.out.printf("Sum of two number is %d\n",calculate.add(1,2));
        System.out.printf("Sum of three number is %d\n",calculate.add(1,2,3));
        System.out.printf("Sum of three number is %f\n",calculate.add(1.2,2.2));
    }
}

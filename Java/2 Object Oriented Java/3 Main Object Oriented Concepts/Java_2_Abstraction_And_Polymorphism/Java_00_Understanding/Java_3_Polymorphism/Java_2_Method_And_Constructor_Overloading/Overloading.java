package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_3_Polymorphism.Java_2_Method_And_Constructor_Overloading;

public class Overloading
{

    Overloading()
    {
        System.out.println("Default Constructor");
    }

    Overloading( String something )
    {
        System.out.println( "\nYour write this \n---> " + something );
    }

    public int add(int num1, int num2 )
    {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3, int num4 )
    {
        return num1 + num2;
    }

    public String add(String a,String b)
    {
        return a + " " + b;
    }

    public static void main(String[] args)
    {
        Overloading mehtodOverloading = new Overloading();

        System.out.println(mehtodOverloading.add("Aman","Singh"));
        System.out.println("Sum of Two Numbers is " + mehtodOverloading.add(1,3));
        System.out.println("Sum of Four Numbers is " + mehtodOverloading.add(1,2,3,4));

        Overloading constructorOverloading = new Overloading("You and Me");
    }
}

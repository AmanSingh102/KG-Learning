package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_4_Pass_By_Value_And_Pass_By_Reference;

class Test_Pass_By_Value
{
    public static void main(String[] args)
    {
        int x = 2, y = 3;
        int sum = add(x,y);
        System.out.printf("Sum of %d and %d is %d",x,y,sum);
    }

    private static int add( int a, int b )
    {
        a = a + b;
        return a;
    }
}

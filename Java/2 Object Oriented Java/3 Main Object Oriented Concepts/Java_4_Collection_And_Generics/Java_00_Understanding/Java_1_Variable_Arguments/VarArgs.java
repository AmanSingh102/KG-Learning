package Java_4_Collection_And_Generics.Java_00_Understanding.Java_1_Variable_Arguments;

public class VarArgs
{
    public static void main(String... args)
    {
        System.out.println("\n---- Understanding Variable Arguments ----\n");

        System.out.printf("Sum = %d\n",add(2,3));
        System.out.printf("Sum through array = %d\n",add( new int[] {1,1,1,1,1}));

        // new way for taking multiple values
        System.out.printf("Sum using varargs = %d\n",sum(1,1,1,1,1));
        System.out.printf("Sum without any argument = %d\n",sum());
        System.out.printf("Sum with must give two number = %d\n",sumMustGiveTwoArgument(1,1,1,1,1));

        System.out.println("\n\n------------------------------------------\n");
    }

    public static int add( int a, int b )
    {
        return a + b;
    }

    public static int add( int[] array )
    {
        int sum = 0;
        for (int i : array)
        {
            sum = sum + i;
        }

        return sum;
    }

    public static int sum( int... value )   //ellipsis --> (...)
    {
        // treated as an array
        int sum = 0;
        for (int i : value)
        {
            sum = sum + i;
        }

        return sum;
    }

    public static int sumMustGiveTwoArgument( int first, int second, int... value )
    {
        int sum = first + second;
        for (int i : value)
        {
            sum = sum + i;
        }

        return sum;
    }
}

package Java_6_Functional_Programming.Java_00_Understanding.Java_1_Lambda_Expression;

public class Understanding_Lambda
{
    public static void main(String[] args)
    {
        Understanding_Lambda test = new Understanding_Lambda();
        test.PrintString("Hello, Everyone");
        System.out.printf("Result = %d",test.sum(2,3));

        // By Using Lambda
        // toPrint -> System.out.println(toPrint);
        // ( a,b ) -> a + b;
        // ( a,b ) -> { int sum = a + b; System.out.println(sum); }
    }

    public void PrintString( String toPrint )
    {
        System.out.println(toPrint);
    }
    public int sum( int a, int b )
    {
        return a + b;
    }
}

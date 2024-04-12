package Java_3_Exception_And_File_Handling.Java_00_Understanding.Java_2_Throws_And_Throw_Understanding;

import java.util.Scanner;

public class Finally_Keyword
{
    public static void main(String[] args)
    {
        a();
    }

    private static void a()
    {
        b();
    }

    private static void b()
    {
        c();
    }

    private static void c()
    {
        d();
    }

    private static void d()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();

        try
        {
            int[] array = new int[5];
            System.out.printf("Result is %d",array[6]);
            array[6] = num1 / num2;
            System.out.printf("Result is %d",array[6]);
        }
        catch( ArithmeticException exception )
        {
            System.out.printf("%s, enter valid value",exception.getMessage());
        }
        catch( Throwable throwable )
        {
            System.out.println("General Exception");
            throw throwable;
        }
        finally
        {
            System.out.printf("\nFinally always execute !!!\n");
        }
        sc.close();
    }
}

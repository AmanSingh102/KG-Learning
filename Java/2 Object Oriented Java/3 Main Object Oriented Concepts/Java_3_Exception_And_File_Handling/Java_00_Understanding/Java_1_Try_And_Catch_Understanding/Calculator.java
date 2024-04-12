package Java_3_Exception_And_File_Handling.Java_00_Understanding.Java_1_Try_And_Catch_Understanding;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Try - Catch Understanding ----\n");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();

            try
            {
                int[] array = new int[5];
               // System.out.printf("Result is %d",array[6]);
                array[6] = num1 / num2;
                System.out.printf("Result is %d",array[6]);
            }
            catch( ArithmeticException exception )
            {
                System.out.printf("%s, enter valid value",exception.getMessage());
            }
            catch( ArrayIndexOutOfBoundsException exception )
            {
                System.out.printf("%s",exception.getMessage());
            }
            catch( Throwable throwable )
            {
                System.out.println("General Exception");
            }
            sc.close();

        System.out.println("\n\n-----------------------------------\n");
    }
}

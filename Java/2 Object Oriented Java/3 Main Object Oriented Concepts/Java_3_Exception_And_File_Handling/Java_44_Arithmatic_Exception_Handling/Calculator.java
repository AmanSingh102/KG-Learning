package Java_3_Exception_And_File_Handling.Java_44_Arithmatic_Exception_Handling;

import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();

            try
            {
                int result = num1 / num2;
                System.out.printf("Division of %d and %d is %d\n",num1,num2,result);
            }
            catch( ArithmeticException exception )
            {
                if( exception.getMessage().equals("/ by zero"))
                {
                    System.out.println("Divide by zero occurred");
                }
                else
                {
                    throw exception;
                }
            }

        sc.close();
    }
}

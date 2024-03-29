import java.util.Scanner;

public class Java_4_All_Operators 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();

            System.out.printf("\nSum of %d and %d is %d\n",num1,num2,num1+num2);
            System.out.printf("Subtract of %d and %d is %d\n",num1,num2,num1-num2);
            System.out.printf("Multiplication of %d and %d is %d\n",num1,num2,num1*num2);
            System.out.printf("Division of %d and %d is %d\n",num1,num2,num1/num2);
            System.out.printf("Modula of %d and %d is %d\n\n",num1,num2,num1%num2);

        sc.close();
    }
}

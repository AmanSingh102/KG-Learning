import java.util.Scanner;

public class Java_2_Sum_Two_Numbers
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n_______ Sum Program _______\n");

            System.out.print("Enter 1st Number : ");
            int num1 = sc.nextInt();

            System.out.print("Enter 2nd Number : ");
            int num2 = sc.nextInt();

            System.out.printf("Sum of %d and %d is %d\n",num1,num2,num1+num2);     
            System.out.println("_____________________________\n");

        sc.close();
        
    }
    
}

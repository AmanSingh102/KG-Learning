import java.util.Scanner;

public class Java_18_Bitwise_OR_Of_Two_Numbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Showing Bitwise OR Operator ----");
        
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();   

        int result = num1 | num2;
        System.out.printf("%d is the result",result);
        sc.close();
    }
}

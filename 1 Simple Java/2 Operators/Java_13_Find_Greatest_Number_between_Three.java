import java.util.Scanner;

public class Java_13_Find_Greatest_Number_between_Three 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int num3 = sc.nextInt();

        if( num1 >= num2 && num1 >= num3)
        System.out.printf("%d is the Greatest Number",num1);
        else if( num2 >= num1 && num2 >= num3 )
        System.out.printf("%d is the Greatest Number",num2);
        else if( num3 >= num1 && num3 >= num2 )
        System.out.printf("%d is the Greatest Number",num3);
        else
        System.out.println("All Numbers are Equal !!!");

        sc.close();
    }    
}

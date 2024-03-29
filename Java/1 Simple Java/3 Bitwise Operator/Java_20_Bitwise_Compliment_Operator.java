import java.util.Scanner;

public class Java_20_Bitwise_Compliment_Operator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Showing Bitwise Compliment Operator ----");
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int result = ~ num;
        System.out.printf("%d is the result",result);
        sc.close();   
    }
}

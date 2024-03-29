import java.util.Scanner;

public class Java_22_Right_Shift_Operator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Showing Right Shift Operator ----");
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("How much you want to Right Shift : ");
        int shift = sc.nextInt();

        int result = num >> shift;  // 1 shift me 2 sse Divide hoga
        System.out.printf("%d is the result",result);
        sc.close();
    }
}

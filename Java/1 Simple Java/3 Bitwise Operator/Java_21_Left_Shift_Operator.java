import java.util.Scanner;

public class Java_21_Left_Shift_Operator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Showing Left Shift Operator ----");
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("How much you want to Left Shift : ");
        int shift = sc.nextInt();

        int result = num << shift;    // 1 shift me 2 sse multiply hoga
        System.out.printf("%d is the result",result);
        sc.close();
    }
}

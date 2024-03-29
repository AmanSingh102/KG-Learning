import java.util.Scanner;

public class Java_8_Calculate_Simple_Interest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter Principle : ");
            int principle = sc.nextInt();
            System.out.print("Enter Time : ");
            float time = sc.nextFloat();
            System.out.print("Enter Rate : ");
            float rate = sc.nextFloat();

            System.out.println("\nSimple Interest = " + (principle*time*rate)/100);

        sc.close();
        
    }
    
}

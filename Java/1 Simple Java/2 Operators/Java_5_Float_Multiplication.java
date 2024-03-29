import java.util.Scanner;

public class Java_5_Float_Multiplication 
{
    public static void main(String[] args) 
    {
     
        Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter 1st number : ");
            float num1 = sc.nextFloat();
            System.out.print("Enter 2nd number : ");
            float num2 = sc.nextFloat();

            System.out.printf("Multiplication of %f and %f is %f",num1,num2,num1*num2);

        sc.close();    
        
    }
}

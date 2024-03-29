import java.util.Scanner;

public class Java_16_Categories_Persion_Based_On_Age 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter Your Age : ");
            int age = sc.nextInt();

            if( age <= 13 ) System.out.println("Your are a Child");
            else if( age <= 20 ) System.out.println("You are a Teenager");
            else if( age <= 60 ) System.out.println("You are an Adult");
            else System.out.println("You are Senior");

        sc.close();
    }
}

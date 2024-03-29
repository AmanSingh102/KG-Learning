import java.util.Scanner;

public class Java_27_Sum_Of_Digits_Of_An_Integer
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Sum of Digits of an Integer Program ----\n"); 
        sumOfDigitsMethod();  
    }

    public static void sumOfDigitsMethod()
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter an Integer : ");
            int integer = sc.nextInt();

            int sum = 0;
            for(  ; integer > 0; integer = integer / 10 )
            {
                sum = sum + ( integer % 10 );
            }

            System.out.printf("Sum of Digits : %d",sum);
            System.out.println("\n\n---------------------------------------------\n");
            
        }
    }
}

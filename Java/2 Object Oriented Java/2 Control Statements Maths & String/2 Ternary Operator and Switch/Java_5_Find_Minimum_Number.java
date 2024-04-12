import java.util.Scanner;

public class Java_5_Find_Minimum_Number 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Minimum Number Program ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();

            int minNumber = num1 < num2 ? num1 : num2 ;
            System.out.println("Minimum Number : "+ minNumber);

        sc.close();
        System.out.println("\n-------------------------------\n");
    }
}

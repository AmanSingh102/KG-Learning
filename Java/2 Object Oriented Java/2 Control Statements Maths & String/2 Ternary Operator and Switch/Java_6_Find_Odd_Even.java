import java.util.Scanner;

public class Java_6_Find_Odd_Even 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Minimum Number Program ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter an Integer : ");
            int num = sc.nextInt();

            String check = num % 2 == 0 ? "Even" : "Odd" ;
            System.out.println(num + " is " + check + " number");

        sc.close();
        System.out.println("\n-------------------------------\n");
    }
}

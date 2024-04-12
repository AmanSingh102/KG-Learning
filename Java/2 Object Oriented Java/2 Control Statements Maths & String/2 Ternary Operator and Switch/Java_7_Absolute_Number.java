import java.util.Scanner;

public class Java_7_Absolute_Number 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Absolute Number Program ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter an Integer : ");
            int integer = sc.nextInt();

            int absolute = integer >= 0 ? integer : -integer;
            System.out.println("Absolute value : " + absolute);

        sc.close();
        System.out.println("\n-------------------------------\n");   
    }
}
    
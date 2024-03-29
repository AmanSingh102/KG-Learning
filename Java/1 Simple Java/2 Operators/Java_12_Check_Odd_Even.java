import java.util.Scanner;

public class Java_12_Check_Odd_Even 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int integer = sc.nextInt();

        if( integer % 2 == 0 ) System.out.printf("%d is an Even number",integer);
        else System.out.printf("%d is an Odd number",integer);

        sc.close();
    }
}

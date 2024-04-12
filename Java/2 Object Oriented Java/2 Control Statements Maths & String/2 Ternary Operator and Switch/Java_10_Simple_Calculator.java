import java.util.Scanner;

public class Java_10_Simple_Calculator 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Simple Calculator ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter your 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter your 2nd number : ");
            int num2 = sc.nextInt();
            System.out.print("Now, enter operator : ");
            String operator = sc.next();

            int result = calculate(num1, num2, operator);
            System.out.println("Your result : " + result);

        sc.close();
        System.out.println("\n---------------------------\n");
    }
    
    public static int calculate( int num1, int num2, String operator )
    {
        int result = switch( operator )
        {
            case "+" -> num1 + num2; 
            case "-" -> num1 - num2; 
            case "*" -> num1 * num2; 
            case "/" -> num1 / num2; 
            default  -> -1;
        };

        return result;
    }
}

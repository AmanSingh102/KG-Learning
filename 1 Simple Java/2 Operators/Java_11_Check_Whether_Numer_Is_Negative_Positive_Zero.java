import java.util.Scanner;

public class Java_11_Check_Whether_Numer_Is_Negative_Positive_Zero 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int integer = sc.nextInt();

        if( integer > 0 ) System.out.printf("%d is a Positive Number",integer);
        else if( integer < 0 ) System.out.printf("%d is a Negative Number",integer);
        else System.out.printf("%d is a Zero Number",integer);

        sc.close();        
    }
}

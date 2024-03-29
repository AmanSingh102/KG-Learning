import java.util.Scanner;

public class Java_10_Convert_Fahrenheit_To_Celsius 
{
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter Fahrenheit : ");
            float fahrenheit = sc.nextFloat();

            System.out.println("\nCelsius = " + ((fahrenheit - 32) * 5/9));

        sc.close();
    }

    
}
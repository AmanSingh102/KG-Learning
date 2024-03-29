import java.util.Scanner;

public class Java_7_Area_Of_Triangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter the Base of the Triangle : ");
            double base = sc.nextInt();
            System.out.print("Enter the Height of the Triangle : ");
            double  height = sc.nextInt();

            System.out.println("\nArea of the Triangle = " + ((base*height)/2));

        sc.close();
    }
    
}

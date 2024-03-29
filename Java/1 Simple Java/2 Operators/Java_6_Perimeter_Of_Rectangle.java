import java.util.Scanner;

public class Java_6_Perimeter_Of_Rectangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter 1st Side of Rectangle : ");
            int side1 = sc.nextInt();
            System.out.print("Enter 2nd Side of Rectangle : ");
            int side2 = sc.nextInt();
            System.out.print("Enter 3rd Side of Rectangle : ");
            int side3 = sc.nextInt();
            System.out.print("Enter 4th Side of Rectangle : ");
            int side4 = sc.nextInt();

            System.out.println("\nPerimeter of the Rectangle is " + (double)(side1+side2+side3+side4));

        sc.close();
    }
    
}

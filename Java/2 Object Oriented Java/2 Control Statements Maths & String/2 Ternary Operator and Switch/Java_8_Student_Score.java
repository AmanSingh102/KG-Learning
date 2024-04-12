import java.util.Scanner;

public class Java_8_Student_Score 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Student Score Program ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Please, Enter your marks : ");
            int marks = sc.nextInt();

            String category = marks > 80 ? "High" : ( marks > 50 ? "Moderate" : "Low" );
            System.out.println("Your category is " + category);

        sc.close();
        System.out.println("\n-------------------------------\n");   
    }
}

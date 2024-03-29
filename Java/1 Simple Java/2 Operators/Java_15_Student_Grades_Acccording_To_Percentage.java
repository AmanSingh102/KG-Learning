import java.util.Scanner;

public class Java_15_Student_Grades_Acccording_To_Percentage 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter your Percentage : ");
            float percentage = sc.nextFloat();

            if( percentage >= 90 )
            System.out.println("Great, You have Got A");
            else if( percentage >= 75 )
            System.out.println("Good, You have Got B");
            else if( percentage >= 60 )
            System.out.println("You have Got C, Work harder next time");
            else if( percentage >= 30 )
            System.out.println("You have Got D, You seriously need to work harder");
            else
            System.out.println("Sorry, You have failed need to work harder");

        sc.close();    
    }  
}

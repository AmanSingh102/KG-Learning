import java.util.Scanner;

public class Java_12_Number_Guessing_Game_Do_While_Loop 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Number Guessing Game ----\n");
        Scanner sc = new Scanner(System.in);

            byte guessedNumber = 5;
            byte userNumber;
            do
            {
                System.out.print("Please guess the number between 0 and 10 : ");
                userNumber = sc.nextByte();

            }while( userNumber != guessedNumber );

            System.out.println("\n--> You have successfully guessed the number !!!");

        sc.close();
        System.out.println("\n------------------------------\n");
    }
}

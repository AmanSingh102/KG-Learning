import java.util.Scanner;

public class Java_30_Number_Guessing_Game 
{
    int randomNumber;

    Java_30_Number_Guessing_Game()
    {
        randomNumber = (int) Math.ceil(Math.random() * 100);
    }

    /**
     * @param guessNumber the number that player guess
     * @return
     * - Negative if the guessed is smaller
     * - 0 if the guessed number is correct
     * - Positive if the guessed number is higher
     */

    int guess( int guessNumber )
    {
        return guessNumber - randomNumber;
    }

    public static void main(String[] args) 
    {
        System.out.println("\n----------- Guessed Number Game -----------\n");
        Scanner sc = new Scanner(System.in);

        Java_30_Number_Guessing_Game game = new Java_30_Number_Guessing_Game();

        int guessNum;
        int result;
        do
        {
            System.out.print("Guess the number between 1 to 100 :  ");
            guessNum = sc.nextInt();
            result = game.guess(guessNum);

            if( result == 0 )
            {
                System.out.println("Congrats, your guess is correct !!!\n");
            }
            else if( result < 0 )
            {
                System.out.println("Please, guess higher number !!!\n");
            }
            else
            {
                System.out.println("Please, guess lower number !!!\n");
            }

        }while( result != 0 );

        System.out.println("Computer Guessed Number : " + game.randomNumber);
        System.out.println("Your Guessed Number : " + guessNum) ;

        sc.close();
        System.out.println("\n-------------------------------------------\n");
    }   
}

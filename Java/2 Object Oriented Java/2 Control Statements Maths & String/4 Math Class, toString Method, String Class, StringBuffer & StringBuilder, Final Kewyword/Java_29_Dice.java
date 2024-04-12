import java.util.Scanner;

public class Java_29_Dice 
{
    int roll()
    {
        double randomNumber = Math.random() * 6;
        return (int) Math.ceil(randomNumber);
    }
    public static void main(String[] args) 
    {
        System.out.println("\n-------- Roll the Dice Program --------\n");
        Scanner sc = new Scanner(System.in);

            Java_29_Dice dice = new Java_29_Dice();
            
            System.out.print("How many time want to roll the dice : ");
            int roll = sc.nextInt();

            System.out.println();
            for (int i = 0; i < roll; i++) 
            {
                System.out.println("Dice Number : " + dice.roll());    
            }

        sc.close();
        System.out.println("\n---------------------------------------\n");
    }
}

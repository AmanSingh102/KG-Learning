import java.util.Scanner;

public class Java_17_Exit_On_Exit 
{
  public static void main(String[] args) 
  {
    System.out.println("\n---- Exit On Exit Program ----\n");
    Scanner sc = new Scanner(System.in);

        while( true )
        {
            System.out.print("Enter your command : ");
            String command = sc.next();

            if( command.equalsIgnoreCase("exit"))
            {
                break;
            }
        }

        System.out.println("------------------------");
        System.out.println("You hava successfully exit !!!");

    sc.close();
    System.out.println("\n------------------------------\n");
  }   
}

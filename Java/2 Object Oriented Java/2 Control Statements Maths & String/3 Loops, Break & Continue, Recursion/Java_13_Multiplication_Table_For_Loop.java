import java.util.Scanner;

public class Java_13_Multiplication_Table_For_Loop 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Multiplication Table ----\n");  
        Scanner sc = new Scanner(System.in);

            System.out.print("Please, Enter the number : ");
            byte num = sc.nextByte();

            for( byte i = 1; i <= 10; i++ )
            {
                System.out.printf("%d X %d = %d\n",num,i,num*i);
            }

        sc.close(); 
        System.out.println("\n------------------------------\n");
    }
}

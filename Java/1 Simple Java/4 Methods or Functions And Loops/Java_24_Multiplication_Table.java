import java.util.Scanner;

public class Java_24_Multiplication_Table 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Multiplication Program ----");
        multiplicationTableMethod();
    }

    public static void multiplicationTableMethod()
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter an Integer : ");
            int num = sc.nextInt();

            System.out.printf("\n---- Multiplication Table of %d ----\n\n",num);

            for( int range = 1; range <= 10; range++ )
            {
                System.out.printf("%d X %d = %d\n",num,range,num*range);
            }

            System.out.println("\n------------------------------------\n");

        sc.close();
    }
}

import java.util.Scanner;

public class Java_28_Find_LCM_Of_Two_Numbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n---- Find LCM of Two Numbers Program ----\n");

            System.out.print("Enter 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();

            int LCM = findLCM(num1,num2);
            System.out.printf("LCM of %d and %d : %d",num1,num2,LCM);
            
            System.out.println("\n\n-----------------------------------------\n");

        sc.close();
    }

    public static int findLCM( int first, int second)
    {
        int i = 1;
        while(true) 
        {
            int factor = first * i;
            if( factor % second == 0 )
            {
                return factor;
            }

            i++;
        }
    }
}

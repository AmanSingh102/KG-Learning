import java.util.Scanner;

public class Java_35_Print_Triangle_Pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("\n---- Different Triangle Pattern ----\n");

            System.out.print("Enter the Number : ");
            int num = sc.nextInt();

            printUpwardRightTriangle(num);
            printDownwardRightTriangle(num);
            printLeftSideRightTriangle(num);
            printFullTriangle(num);

            System.out.println("\n-------------------------------------\n");

        sc.close();    
    }

    public static void printUpwardRightTriangle( int num )
    {
        System.out.println("\n---- Up Right Triangle ----\n");

        for( int i = 1; i <= num; i++ )
        {
            for( int j = 1; j <= i; j++ )   // Another way --> for( int j = 0; j <= num - i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------\n");
    }

    public static void printDownwardRightTriangle( int num )
    {
        System.out.println("\n---- Downward Right Triangle ----\n");

        for( int i = num; i >= 1; i-- )
        {
            for( int j = i; j >= 1; j-- )
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------\n");
    }

    public static void printFullTriangle( int num )
    {
        System.out.println("\n---- Full Triangle ----\n");

        for( int i = num; i >= 1; i-- )
        {
            for( int k = 0; k < i; k++)
            {
                System.out.print(" ");
            }

            for( int j = 0; j <= num - i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------\n");
    }

    public static void printLeftSideRightTriangle( int num )
    {
        System.out.println("\n---- Left Side Right Triangle ----\n");

        for( int i = num; i >= 1; i-- )
        {
            for( int k = 0; k < i-1; k++)
            {
                System.out.print("  ");
            }

            for( int j = 0; j <= num - i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------\n");
    }
}


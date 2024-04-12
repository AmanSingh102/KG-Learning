import java.util.Scanner;

public class Java_22_Understanding_4_Section_Math_Class 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            introduction();

            String Menu = "1. Absolute Value [ Math.abs() ]\n" +
                          "2. Round up [ Math.ceil() ]\n" +
                          "3. Round down [ Math.floor() ]\n" +
                          "4. Round to nearest Integer [ Math.round() ]\n" + 
                          "5. Power [ Math.pow() ]\n" + 
                          "6. Square Root [ Math.sqrt() ]\n" + 
                          "7. Random Number Generation [ Math.random() ]\n" +
                          "8. Value Of PI [ Math.PI ]";

            while(true) 
            {
                System.out.println("\n\n-------------- MENU ---------------");
                System.out.println(Menu);  
                System.out.println("\n-------------------------------------------");
                System.out.print("Enter your option and For EXIT Enter 0 : ");
                int option = sc.nextInt();
                System.out.println();

                if( option == 0)    { break; }

                switch( option ) 
                {
                    case 1:
                    absoluteValue();
                    break;

                    case 2:
                    roundUp();
                    break;
            
                    case 3:
                    roundDown();
                    break;

                    case 4:
                    RoundToNearestInteger();
                    break;

                    case 5:
                    powerTo();
                    break;

                    case 6:
                    squareRoot();
                    break;

                    case 7:
                    randomNumberGeneration();
                    break;

                    case 8:
                    valueofPI();
                    break;

                    default :
                    System.out.println("Invalid Input !!!!");
                }
            }  

        sc.close();
    }

    public static void introduction()
    {
        System.out.print("\n---> Understanding Math Class and Different Math Functions.");
    }

    public static void absoluteValue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer [ Negative ] : ");
        int integer = sc.nextInt();

        System.out.print("Absolute value = " + Math.abs(integer));
    }

    public static void roundUp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        float integer = sc.nextFloat();

        System.out.print("Round up value = " + Math.ceil(integer));
    }

    public static void roundDown()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        float integer = sc.nextFloat();

        System.out.print("Round down value = " + Math.floor(integer));
    }

    public static void RoundToNearestInteger()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        float integer = sc.nextFloat();

        System.out.print("Round to nearest value = " + Math.round(integer));
    }

    public static void powerTo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int integer = sc.nextInt();
        System.out.print("Enter power : ");
        int power = sc.nextInt();

        System.out.print("Result = " + Math.pow(integer,power));
    }

    public static void squareRoot()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int integer = sc.nextInt();

        System.out.print("Result = " + Math.sqrt(integer));
    }

    public static void randomNumberGeneration()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much you want to generate random number : ");
        int randomNumber = sc.nextInt();

        System.out.println("\n---> Simple");
        for( int i = 1; i <= randomNumber; i++ ) 
        {
            double random = Math.random();
            System.out.println("Result = " + random ); 
        }

        System.out.println("\n---> Simple x 100");
        for( int i = 1; i <= randomNumber; i++ ) 
        {
            double random = Math.random() * 100;
            System.out.println("Result = " + random ); 
        }

        System.out.println("\n---> Round with explicit Integer Value x 100");
        for( int i = 1; i <= randomNumber; i++ ) 
        {
            int random = (int) Math.round(Math.random() * 100);
            System.out.println("Result = " + random ); 
        }
    }

    public static void valueofPI()
    {
        System.out.print("Value of PI = " + Math.PI);
    }
}

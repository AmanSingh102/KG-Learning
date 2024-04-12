import java.util.Scanner;

/* Yellow line function me scanner close na karne ke karna 
aa raha hai ok lekin function ka scanner close mat 
karna phir code kam nhi karega */

public class Java_4_Understanding_2_And_3_Section 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            String Menu = "1. Greater Number Checker\n" +
                          "2. Week Detctor\n" +
                          "3. Week Detctor Using New Switch\n" +
                          "4. While Loop\n" + 
                          "5. Do While Loop\n" + 
                          "6. For Loop\n" + 
                          "7. For Each Loop\n" +
                          "8. Break Keyword\n" + 
                          "9. Continue Keyword\n" + 
                          "10. Finding Factorial using Recursion Process";

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
                    ternaryOperator();    
                    break;

                    case 2:
                    OldSwitchStatement();
                    break;

                    case 3:
                    NewSwitchStatement();
                    break;

                    case 4:
                    whileLoopUnderstanding();
                    break;

                    case 5:
                    doWhileLoopUnderstanding();
                    break;

                    case 6:
                    forLoopUnderstanding();
                    break;

                    case 7:
                    forEachLoopUnderstanding();
                    break;

                    case 8:
                    breakKeywordUnderstanding();
                    break;

                    case 9:
                    continueKeywordUnderstanding();
                    break;

                    case 10:
                    factorialRecursionUnderstanding();
                    break;

                    default :
                    System.out.println("Invalid Input !!!!");
                }
            }  

        sc.close();
    }   
   

    public static void ternaryOperator()
    {
        System.out.println("\n---- Greater Number Checker ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();

            int num3 = num1 > num2 ? num1 : num2;
            System.out.println("Greatest number is " + num3);
          
            
        System.out.println("\n--------------------------------\n");
    }

    public static void OldSwitchStatement()
    {
        System.out.println("\n-------- Week Detector --------\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your day in number : ");
         int day = sc.nextInt();

        switch( day )
        {
             case 1 : 
                System.out.println("Week : Monday");
                break;
            case 2 : 
                System.out.println("Week : Tuesday");
                break;
            case 3 : 
                System.out.println("Week : Weduesday");
                break;
            case 4 : 
                System.out.println("Week : Thuresday");
                break;
            case 5 : 
                System.out.println("Week : Friday");
                break;
            case 6 : 
                System.out.println("Week : Saturaday");
                break;
            case 7 : 
                System.out.println("Week : Sunday");
                break;
            default : 
                System.out.println("Invalid Input !!!");
        }

        System.out.println("\n--------------------------------\n");
    }

    public static void NewSwitchStatement()
    {
        System.out.println("\n-------- Week Detector --------\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your day in number : ");
        int day = sc.nextInt();

        // Another Way
        String output = switch( day )
        {
            case 1      -> "Monday";
            case 2      -> "Tuesday";
            case 3      -> "Weduesday";
            case 4      -> "Thursday";
            case 5      -> "Friday";
            case 6 ,7   -> "Holiday";
            default     -> "Invalid Input"; 
        }; 

        System.out.println("Week : " + output);
        System.out.println("\n--------------------------------\n");
    }

    public static void whileLoopUnderstanding()
    {
        System.out.println("\n---- While Loop Understanding ----\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter your age : ");
        int age = sc.nextInt();

        while( age < 0 || age > 100 )
        {
            System.out.print("Please, enter your age : ");
            age = sc.nextInt();
        }

        System.out.println("Your age is " + age);
        System.out.println("\n-----------------------------------\n");
    }

    public static void doWhileLoopUnderstanding()
    {
        System.out.println("\n---- Do While Loop Understanding ----\n");
        Scanner sc = new Scanner(System.in);
    
        int age;
        do
        {
            System.out.print("Please, enter your age : ");
            age = sc.nextInt();

        }while( age < 0 || age > 100 );

        System.out.println("Your age is " + age);
        System.out.println("\n-------------------------------------\n");
    }

    public static void forLoopUnderstanding()
    {
        System.out.println("\n---- For Loop Understanding ----\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter the range : ");
        int range = sc.nextInt();
        
        System.out.print("Numbers : ");
        for( int i = 0; i <= range; i++ )
        {
            System.out.print(i + " ");
        }
        System.out.println("\n\n--------------------------------\n");
    }

    public static void forEachLoopUnderstanding()
    {
        System.out.println("\n---- For Each Loop Understanding ----\n");
        String[] array = new String[]
        {
            "Ram","Shayam","Aman","Suhani","Priti"
        };

        printAboveArraySimple(array);
        System.out.print("   <----- Using Simple For Loop");
        System.out.println();
        printAboveArrayByForEach(array);
        System.out.print("   <----- Using For Each Loop");

        System.out.println("\n\n------------------------------------\n");
    }

    public static void printAboveArraySimple( String[] array )
    {
        System.out.print("Name : ");
        for( int i = 0; i < array.length; i++ )
        {
            System.out.print(array[i] + ", ");
        }
    }

    public static void printAboveArrayByForEach( String[] array )
    {
        System.out.print("Name : ");
        for( String name : array )
        {
            System.out.print(name + ", ");
        }
    }

    public static void breakKeywordUnderstanding()
    {
        System.out.println("\n---- Break Keyword Understanding ----\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Where you want to break [ under 1000 ] : ");
        int broke = sc.nextInt();

        System.out.print("Numbers : ");
        for( int i = 1; i <= 1000; i++ )
        {
            if( i == broke ) { break; }
            System.out.print(i + " ");
        }

        System.out.println("\n\n-------------------------------------\n");
    }

    public static void continueKeywordUnderstanding()
    {
        System.out.println("\n---- Continue Keyword Understanding ----\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Where number are you want to skip [ under 10 ] : ");
        int skip = sc.nextInt();

        System.out.print("Numbers : ");
        for( int i = 1; i <= 10; i++ )
        {
            if( i == skip ) { continue; }
            System.out.print(i + " ");
        }

        System.out.println("\n\n-------------------------------------\n");
    }

    public static void factorialRecursionUnderstanding()
    {
        System.out.println("\n---- Factorial Using Recursion ----\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, Enter your number : ");
        int num = sc.nextInt();

        long fact = factorialIterative(num);
        System.out.printf("Factorial %d is %d",num,fact);
        System.out.println("   <----- Using Iteration Process");

        long factRecursion = factorialRecursion(num);
        System.out.printf("Factorial %d is %d",num,factRecursion);
        System.out.print("   <----- Using Recursion Process");

        System.out.println("\n\n---------------------------------\n");
    }

    public static long factorialIterative( int num )
    {
        long fact = 1;
        for( int i = 1; i <= num; i++ )
        {
            fact = fact * i;
        }

        return fact;
    }
    
    public static long factorialRecursion( int num )
    {
        //System.out.println("Function called for : " + num);   // Samajhne ke liye
        
        if( num == 1 )  { return 1; }

        return num * factorialRecursion( num - 1 );
    }
}

package Java_6_Functional_Programming.Java_00_Understanding.Java_3_Method_References;

import java.util.List;
import java.util.function.BinaryOperator;

public class Understanding_Method_Interface
{
    public static void main(String[] args)
    {
        List< Integer > numbers = List.of(1,2,3,4,5,6);

        System.out.println("\n---- PRINTING ODD NUMBERS USING lambda EXPRESSION ----");
        System.out.println("Odd Numbers : ");
        numbers.stream()
                .filter( number -> number % 2 == 1 )
                .forEach( number -> System.out.println(number));


        System.out.println("\n---- PRINTING ODD NUMBERS USING method REFERENCE ( :: ) ----");
        System.out.println("Odd Numbers : ");
        numbers.stream()
                .filter( number -> number % 2 == 1 )
                .forEach( System.out :: println );


        System.out.println("\n---- PRINTING SUM OF NUMBERS USING lambda EXPRESSION ----");
        int newSum2 = numbers.stream()
                .reduce(0, ( a,b ) -> a + b );

        System.out.println("Sum of Numbers using method REFERENCE ( :: ) ( reduce ) : " + newSum2);


        System.out.println("\n---- PRINTING SUM OF NUMBERS USING method REFERENCE ( :: ) ----");
        int newSum3 = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of Numbers using method REFERENCE ( :: ) ( reduce ) : " + newSum3);

    }
}

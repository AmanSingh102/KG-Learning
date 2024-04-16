package Java_6_Functional_Programming.Java_00_Understanding.Java_4_Optional_Class;

import java.util.List;
import java.util.Optional;

public class Understanding_Optional
{
    public static void main(String[] args)
    {
        List< Integer > numbers = List.of(1,2,3,4,5,6);

        System.out.println("\n---- PRINTING SUM OF NUMBERS USING lambda EXPRESSION ----");
        Optional< Integer > newSum2 = numbers.stream()
                .reduce(( a,b ) -> a + b );

        if( newSum2.isPresent() )
        {
            System.out.println("Sum of Numbers using method REFERENCE ( :: ) ( reduce ) : " + newSum2.get());
        }
        else
        {
            System.out.println("List is Empty");
        }


    }
}

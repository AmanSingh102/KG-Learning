package Java_6_Functional_Programming.Java_72_List_String_Representing_Numbers_Do_Sum;

import java.util.List;

public class Final_Test
{
    public static void main(String[] args)
    {
        List< String > numbers = List.of("1","2","3","4","5");

        numbers.stream()
                .map( Integer :: parseInt )
                .map(( number -> Math.pow(number,2)))
                .reduce(( a,b ) -> a + b )
                .ifPresent(System.out::println);
    }
}

package Java_6_Functional_Programming.Java_66_Filter_Odd_Numbers;

import java.util.List;

public class Filter_Odd_Numbers
{
    public static void main(String[] args)
    {
        List< Integer > numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.print("Odd Numbers : ");
        numbers.stream()
                .filter( number -> number % 2 == 1 )
                .forEach( number -> System.out.print(number + " "));
    }
}

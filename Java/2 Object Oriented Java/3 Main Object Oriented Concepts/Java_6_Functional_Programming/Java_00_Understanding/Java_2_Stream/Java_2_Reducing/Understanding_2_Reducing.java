package Java_6_Functional_Programming.Java_00_Understanding.Java_2_Stream.Java_2_Reducing;

import java.util.List;
import java.util.function.BinaryOperator;

public class Understanding_2_Reducing
{
    public static void main(String[] args)
    {
        List< Integer > numbers = List.of(1,2,3,4,5,6);

        System.out.println("\n---- SIMPLE ADDITION OF NUMBERS ----");
        int sum = 0;
        for (Integer number : numbers)
        {
            sum = sum + number;
        }
        System.out.println("Sum of Numbers : " + sum);


        System.out.println("\n---- PRINTING SUM OF NUMBERS USING STREAM AND USING/DOING REDUCE ----");
        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>()
                {
                    @Override
                    public Integer apply(Integer integer, Integer integer2)
                    {
                        return integer + integer2;
                    }
                });

        System.out.println("Sum of Numbers using reduce : " + newSum);


        System.out.println("\n---- PRINTING SUM OF NUMBERS USING lambda EXPRESSION ----");
        int newSum2 = numbers.stream()
                .reduce(0, ( a,b ) -> a + b );

        System.out.println("Sum of Numbers using lambda expression ( reduce ) : " + newSum2);


        System.out.println("\n---- PRINTING SUM OF NUMBERS USING lambda EXPRESSION UNIFIED ----");
        int newSum3 = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of Numbers using lambda expression unified ( reduce ) : " + newSum3);


        System.out.println("\n---- PRINTING MAX NUMBER USING lambda EXPRESSION ----");
        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, ( a,b ) -> a > b ? a : b );

        System.out.println("Maximum Number ( reduce ) : " + max);
    }
}

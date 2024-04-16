package Java_6_Functional_Programming.Java_00_Understanding.Java_5_Operations.Java_1_Max_Min_CollectToList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Understanding_Max_Min_CollectToList
{
    public static void main(String[] args)
    {
        List< Integer > numbers = List.of(1,2,3,4,5,6);
        Optional< Integer > maxNumber = numbers.stream().max( Integer :: compareTo );
        System.out.print("Max Number : ");
        maxNumber.ifPresent(System.out::println);

        Optional< Integer > minNumber = numbers.stream().min( Integer :: compareTo );
        System.out.print("Max Number : ");
        minNumber.ifPresent(System.out::println);

        List< String > words = Arrays.asList("Stream","Operations","Java");
        List< String > collectedWords  = words.stream().collect(Collectors.toList());
        System.out.println(collectedWords);




    }
}

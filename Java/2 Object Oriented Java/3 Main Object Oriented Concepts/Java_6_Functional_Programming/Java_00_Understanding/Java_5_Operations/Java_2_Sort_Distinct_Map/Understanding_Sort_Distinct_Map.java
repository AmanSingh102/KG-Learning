package Java_6_Functional_Programming.Java_00_Understanding.Java_5_Operations.Java_2_Sort_Distinct_Map;

import java.util.List;
import java.util.stream.Collectors;

public class Understanding_Sort_Distinct_Map
{
    public static void main(String[] args)
    {
        List< Integer > numbers = List.of(1,2,3,4,5,6);
        List< Integer > sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);

        List< String > items = List.of("Apple","Banana","Apple","Orange","Banana");
        List< String > distinctItems = items.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctItems);

        List< String > words = List.of("Stream","Operation","Java");
        List< String > upperCaseWords = words.stream().map( String :: toUpperCase ).collect(Collectors.toList());
        System.out.println(upperCaseWords);
    }
}

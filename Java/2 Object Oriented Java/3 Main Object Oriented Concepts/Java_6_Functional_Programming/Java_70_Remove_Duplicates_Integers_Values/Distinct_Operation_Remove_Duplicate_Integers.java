package Java_6_Functional_Programming.Java_70_Remove_Duplicates_Integers_Values;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct_Operation_Remove_Duplicate_Integers
{
    public static void main(String[] args)
    {
        List< Integer > numbers = List.of(1,2,2,3,3,4,5,5,6,6,7,7,8,8,9,9);
        List< Integer > distinctNumbers = numbers.stream()
                                            .distinct()
                                            .collect(Collectors.toList());
        
        System.out.println("Original Numbers : "  + numbers);
        System.out.println("Distinct Numbers : "  + distinctNumbers);
    }
}

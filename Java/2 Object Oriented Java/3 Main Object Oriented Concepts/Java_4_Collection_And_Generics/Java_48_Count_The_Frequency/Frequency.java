package Java_4_Collection_And_Generics.Java_48_Count_The_Frequency;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Frequency
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(5,4,9,2,6,1,3,5,1,6,5);

        System.out.println("Occurrence of 5 : " + Collections.frequency(list, 5) + " times");
        System.out.println("Occurrence of 1 : " + Collections.frequency(list, 1) + " times");
        System.out.println("Occurrence of 6 : " + Collections.frequency(list, 6) + " times");
    }
}

package Java_4_Collection_And_Generics.Java_50_Reverse_The_Elements;

import Java_4_Collection_And_Generics.Java_49_Swap_Two_Elements_InAn_ArrayList.Swap_Two_Element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_Elements_InAn_ArrayList
{
    public static void main(String[] args)
    {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println(integerList);
        reverseUsingCollection(integerList);
        System.out.println(integerList);

        System.out.println();
        List<Integer> integerList2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(integerList2);
        reverse(integerList2);
        System.out.println(integerList2);
    }

    public static void reverseUsingCollection( List<Integer> list )
    {
        Collections.reverse(list);
    }

    public static void reverse( List<Integer> list )
    {
        for (int i = 0; i < list.size() / 2; i++)
        {
            Swap_Two_Element.swap(list, i, list.size() - 1 - i );
        }
    }
}

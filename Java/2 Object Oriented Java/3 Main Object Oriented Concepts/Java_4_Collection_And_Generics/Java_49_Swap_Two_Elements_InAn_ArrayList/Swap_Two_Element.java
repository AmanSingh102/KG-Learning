package Java_4_Collection_And_Generics.Java_49_Swap_Two_Elements_InAn_ArrayList;

import java.util.Arrays;
import java.util.List;

public class Swap_Two_Element
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println(list);
        swap(list, 2, 7);
        System.out.println(list);
    }

    public static void swap( List<Integer> list, int index1, int index2 )
    {
        int swap = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, swap);
    }
}

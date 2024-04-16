package Java_4_Collection_And_Generics.Java_00_Understanding.Java_3_Collection_Library.Java_4_Collections_Class;

import Java_4_Collection_And_Generics.Java_00_Understanding.Java_3_Collection_Library.Java_0_Utility.Utility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Understanding_Collections
{
    public static void main(String[] args)
    {
        System.out.println("\nNon - Sorted the Array ------->");
        List<Integer> numberList = new ArrayList<>();
        numberList.add(8);
        numberList.add(5);
        numberList.add(9);
        numberList.add(-79);
        Utility.print(numberList);

        System.out.println("\nSorted the Array ------->");
        List<Integer> numberList2 = new ArrayList<>();
        numberList2.add(8);
        numberList2.add(5);
        numberList2.add(9);
        numberList2.add(-79);
        Collections.sort(numberList2);   // Eska matlab samjhe daya bubble sorting, linear sorting ye sab ki koi jarurat nhi
        Utility.print(numberList2);

        System.out.println("\nReverse the Sorted the Array ------->");
        List<Integer> numberList3 = new ArrayList<>();
        numberList3.add(8);
        numberList3.add(5);
        numberList3.add(9);
        numberList3.add(-79);
        Collections.sort(numberList3);
        Collections.reverse(numberList3);
        Utility.print(numberList3);

        List<Integer> unmodifiable = Collections.unmodifiableList(numberList3);
        //unmodifiable.add(32);           throw an Exception

    }
}

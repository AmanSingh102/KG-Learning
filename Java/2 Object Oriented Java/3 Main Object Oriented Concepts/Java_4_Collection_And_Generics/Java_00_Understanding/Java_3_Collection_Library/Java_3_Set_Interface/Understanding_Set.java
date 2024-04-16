package Java_4_Collection_And_Generics.Java_00_Understanding.Java_3_Collection_Library.Java_3_Set_Interface;

import Java_4_Collection_And_Generics.Java_00_Understanding.Java_3_Collection_Library.Java_0_Utility.Utility;

import java.util.HashSet;
import java.util.Set;

public class Understanding_Set
{
    public static void main(String[] args)
    {
        Set<String> names = new HashSet<>();

        System.out.println(names.add("Aman"));
        System.out.println(names.add("Suresh"));
        System.out.println(names.add("Jack Sparrow"));

        Utility.print(names);

        System.out.println();
        System.out.println(names.add("Aman"));
        System.out.println("Size : " + names.size());
        Utility.print(names);

        System.out.println();
        System.out.println(names.contains("Aman"));
        System.out.println(names.remove("Aman"));
        Utility.print(names);
        System.out.println(names.contains("Aman"));
    }
}

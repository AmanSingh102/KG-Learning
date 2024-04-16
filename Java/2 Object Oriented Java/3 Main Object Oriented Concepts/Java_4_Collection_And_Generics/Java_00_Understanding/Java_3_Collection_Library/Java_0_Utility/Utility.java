package Java_4_Collection_And_Generics.Java_00_Understanding.Java_3_Collection_Library.Java_0_Utility;

import java.util.Collection;

public class Utility
{
    public static <E> void print(Collection<E> collection )
    {
        System.out.print("Collection is : ");
        for ( E coll : collection )
        {
            System.out.printf("%s ",coll);
        }
        System.out.println();
    }
}

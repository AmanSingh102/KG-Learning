package Java_4_Collection_And_Generics.Java_00_Understanding.Java_3_Collection_Library.Java_1_List_Interface;

import java.util.ArrayList;
import java.util.List;

public class Understanding_List
{
    public static void main(String[] args)
    {
        System.out.println("\n---- List Interface Understanding ----\n");

        List<String> stringList = new ArrayList<>();

        stringList.add("Rahul");
        stringList.add("Singh");

        stringList.add(1,"Kumar");
        stringList.remove(2);

        //System.out.println(stringList.get(0));

        for (int i = 0; i < stringList.size(); i++)
        {
            System.out.print( stringList.get(i) + " " );
        }

        System.out.println();
        if( stringList.contains("Singh"))
        {
            System.out.println("Singh exists");
        }
        else
        {
            System.out.println("Singh NOT exists");
        }

        System.out.println();
        if( stringList.contains("Rahul"))
        {
            System.out.println("Index of 'Rahul' : " + stringList.indexOf("Rahul"));
        }
        else
        {
            System.out.println("Rahul NOT exists");
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1000000000);
        integerList.add(100000000);
        integerList.add(10000000);
        integerList.add(1000000);
        integerList.add(100000);
        integerList.add(10000);
        integerList.add(1000);
        integerList.add(100);
        integerList.add(10);

        System.out.println();
        for( Integer integer : integerList )
        {
            System.out.println(integer);
        }

        System.out.println("This is set by Integer list : " + integerList.getFirst());


        System.out.println("\n--------------------------------------\n");
    }
}

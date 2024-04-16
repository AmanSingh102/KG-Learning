package Java_4_Collection_And_Generics.Java_00_Understanding.Java_4_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Understanding_Maps
{
    public static void main(String[] args)
    {
        Map< String, Integer > map = new HashMap<>();
        map.put("Aman", 1);
        map.put("Baman", 2);
        map.put("Daman", 3);
        map.put("Chaman", 4);

        System.out.println("Size of Map : " + map.size());

        System.out.println("Roll No : " + map.get("Aman"));

        System.out.println("Chaman Exists : " + map.containsKey("Chaman"));
        System.out.println("Geeta Exists : " + map.containsKey("Geeta"));

        System.out.printf("The value %s is removed",map.remove("Baman"));
        System.out.println("Size of Map : " + map.size());

        System.out.println("\nViewing all the contain ----->");
        for (String key : map.keySet())
        {
            System.out.printf("%s : %s\n",key, map.get(key));
        }
    }
}

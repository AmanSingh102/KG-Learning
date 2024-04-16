package Java_4_Collection_And_Generics.Java_52_Return_Unique_Characters_Using_Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique_Characters
{
    public static void main(String[] args)
    {
        Set<Character> unique = new HashSet<>();

        Scanner sc = new Scanner(System.in);

            System.out.print("Please, enter your string : ");
            String userString = sc.nextLine();

            for (char c : userString.toCharArray())
            {
                unique.add(c);
            }

            System.out.printf("Your string has %d unique characters",unique.size());

        sc.close();
    }
}

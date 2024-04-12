package Java_3_Exception_And_File_Handling.Java_00_Understanding.Java_2_Throws_And_Throw_Understanding;

import java.util.Scanner;

public class Throws_Understanding
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        returnName(name);

        sc.close();
    }

    private static void returnName( String name ) throws IllegalArgumentException
    {
        if( name.contains("-"))
        {
            throw new IllegalArgumentException("Name contains '-'");
        }
        System.out.println("Your name is " + name);
    }
}

package Java_6_Functional_Programming.Java_65_Filter_And_Concatenate_String;

import java.util.List;

public class String_Filter_And_Concatenate
{
    public static void main(String[] args)
    {
        List< String > strings = List.of("The real world","is so selfish","and rude","always want","but not give anything","but not", "give luck");

        String result = strings.stream()
                .filter( string -> string.length() > 10 )
                .reduce("", ( a,b ) -> a + " " + b );

        System.out.println(result);
    }
}

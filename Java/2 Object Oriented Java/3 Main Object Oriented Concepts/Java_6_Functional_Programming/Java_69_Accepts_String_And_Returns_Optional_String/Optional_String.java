package Java_6_Functional_Programming.Java_69_Accepts_String_And_Returns_Optional_String;

import java.util.Locale;
import java.util.Optional;

public class Optional_String
{
    public static void main(String[] args)
    {
        System.out.println(toOptional(null));
        System.out.println(toOptional(""));
        System.out.println(toOptional(" mosi mosi "));
    }

    public static Optional< String > toOptional(String string)
    {
        if( string == null || string.isBlank() )
        {
            return Optional.empty();
        }

        return Optional.of( string.toLowerCase());
    }
}

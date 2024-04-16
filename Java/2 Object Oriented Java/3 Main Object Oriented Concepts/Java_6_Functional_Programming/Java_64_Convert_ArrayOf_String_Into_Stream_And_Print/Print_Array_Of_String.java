package Java_6_Functional_Programming.Java_64_Convert_ArrayOf_String_Into_Stream_And_Print;

import java.util.List;

public class Print_Array_Of_String
{
    public static void main(String[] args)
    {
        List< String > names = List.of("Aman","Suhani","Pratik");

        names.stream()
                .forEach( name -> System.out.println(name));
    }
}

package Java_3_Exception_And_File_Handling.Java_00_Understanding.Java_4_FileReader_Class_Understanding;

import java.io.FileReader;
import java.io.IOException;

public class Reader
{
    public static void main(String[] args)
    {
        String fileName = "Java-Test-File.txt";

        try( FileReader reader = new FileReader(fileName))
        {
            int read = 0;
            do
            {
                read = reader.read();
                System.out.print( ( char ) read );

            }while( read != -1 );
        }
        catch( IOException exception )
        {
            System.out.printf("Exception occurred : %s",exception.getMessage());
        }
    }
}

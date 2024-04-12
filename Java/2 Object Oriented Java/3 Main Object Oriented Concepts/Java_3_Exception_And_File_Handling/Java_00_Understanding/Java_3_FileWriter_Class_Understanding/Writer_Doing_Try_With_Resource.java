package Java_3_Exception_And_File_Handling.Java_00_Understanding.Java_3_FileWriter_Class_Understanding;

import java.io.FileWriter;
import java.io.IOException;

public class Writer_Doing_Try_With_Resource
{
    public static void main(String[] args)
    {
        String fileName = "Java-2-Test-File.txt";

        try( FileWriter writer = new FileWriter(fileName))
        {
            writer.write("This is a text file !!!");
            for (int i = 1; i < 50; i++)
            {
                  writer.write('*');
            }
            writer.flush();
            System.out.println("File Written Successfully !!!");
        }
        catch( IOException exception )
        {
            System.out.printf("Exception occurred : %s",exception.getMessage());
        }

    }
}

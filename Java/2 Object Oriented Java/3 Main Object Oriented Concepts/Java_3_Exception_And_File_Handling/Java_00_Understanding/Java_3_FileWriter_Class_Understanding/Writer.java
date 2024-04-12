package Java_3_Exception_And_File_Handling.Java_00_Understanding.Java_3_FileWriter_Class_Understanding;

import java.io.FileWriter;
import java.io.IOException;

public class Writer
{
    public static void main(String[] args) throws IOException
    {
        String fileName = "Java-Test-File.txt";
        FileWriter writer = null;

        try
        {
            writer = new FileWriter(fileName);
            writer.write("This is a text file !!!");
            writer.flush();
            System.out.println("File Written Successfully !!!");
        }
        catch( IOException exception)
        {
            System.out.printf("Exception occurred : %s",exception.getMessage());
        }
        finally
        {
            if( writer != null )
            {
                writer.close();
            }
        }
    }
}

package Java_3_Exception_And_File_Handling.Java_45_Display_TextFile_To_user;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Robust_File_Reader
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Please, enter the name of the file you wish to read : ");
            String fileName = sc.nextLine();

            try( FileReader reader = new FileReader(fileName))
            {
                int read;
                while( (read = reader.read()) != -1)
                {
                    System.out.print( (char) read);
                }
            }
            catch( FileNotFoundException exception )
            {
                System.out.printf("%s not found",fileName);
            }
            catch( IOException exception )
            {
                System.out.printf("Exception occurred : %s",exception.getMessage());
            }

        sc.close();
    }
}

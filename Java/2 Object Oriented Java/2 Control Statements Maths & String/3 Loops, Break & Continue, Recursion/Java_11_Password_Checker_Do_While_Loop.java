import java.util.Scanner;

public class Java_11_Password_Checker_Do_While_Loop 
{
    public static void main(String[] args) 
    {
       System.out.println("\n---- Valid Password Checker Program ----\n");    
       Scanner sc = new Scanner(System.in);

            String password;
            do
            {
                System.out.print("Enter the Passowrd : ");
                password = sc.next();
            
            }while( ! isValidPassword(password) );

            System.out.println("\n--> Thanks for entering Valid password");

       sc.close();
       System.out.println("\n----------------------------------------\n"); 
    }   

    public static boolean isValidPassword( String password )
    {
        return password.length() >= 6 ;
    }
}

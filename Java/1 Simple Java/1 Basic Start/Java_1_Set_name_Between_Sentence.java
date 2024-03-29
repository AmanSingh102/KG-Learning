import java.util.Scanner;

public class Java_1_Set_name_Between_Sentence
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Namaste " + name + ", kaise ho !!!!");
        sc.close();
    }
}
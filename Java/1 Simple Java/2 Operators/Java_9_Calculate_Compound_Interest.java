import java.util.Scanner;

public class Java_9_Calculate_Compound_Interest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter Principle : ");
            int principle = sc.nextInt();
            System.out.print("Enter Time : ");
            float time = sc.nextFloat();
            System.out.print("Enter Rate : ");
            float rate = sc.nextFloat();

            double compoundInterest = principle * Math.pow((1 + rate / 100),time); 

            System.out.println("\nCompound Interest = " + compoundInterest);

        sc.close();
    }
}

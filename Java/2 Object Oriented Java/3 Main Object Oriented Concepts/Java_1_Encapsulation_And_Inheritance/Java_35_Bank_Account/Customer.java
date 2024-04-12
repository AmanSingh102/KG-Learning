package Java_1_Encapsulation_And_Inheritance.Java_35_Bank_Account;

import java.util.Scanner;

public class Customer
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Garib Bank ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter your Account Number : ");
            String accountNumber = sc.nextLine();
            System.out.print("Enter your Account Holder Name : ");
            String accountHolderName = sc.nextLine();

            BankAccount account = new BankAccount(accountNumber,accountHolderName);

            // OPERATIONS HAI TUM ISKO USER SE V LE SAKTE HO OKAY !!!
            System.out.println("\nOperation Performed ------- TEST");
            account.depositMoney(100);
            System.out.println(account.withDrawMoney(200));
            account.depositMoney(-40);
            account.withDrawMoney(0);

        sc.close();
        System.out.println("\n--------------------\n");
    }
}

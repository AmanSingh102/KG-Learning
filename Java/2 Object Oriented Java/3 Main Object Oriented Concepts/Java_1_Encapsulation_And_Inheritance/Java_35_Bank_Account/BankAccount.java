package Java_1_Encapsulation_And_Inheritance.Java_35_Bank_Account;
class BankAccount
{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money )
    {
        if( money <= 0 )
        {
            System.out.println("Invalid Deposit !!!");
        }
        else
        {
            balance = balance + money;
        }
    }

    public double withDrawMoney( double money )
    {
        if( money <= 0 )
        {
            System.out.println("Invalid Withdraw !!!");
        }
        else if( balance >= money )
        {
            balance = balance - money;
        }
        else
        {
            money = balance;
            balance = 0;
        }

        return money;
    }
}

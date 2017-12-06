import java.text.NumberFormat;

public class Program5
{
    public static void main(String[] args)
    {

        NumberFormat money = NumberFormat.getCurrencyInstance();

        //Try-Catch Blocks
        BankAccount act1 = new BankAccount("Brad Pitt"); //Creates new account
        try
        {
            act1.deposit(439.50); //Deposits money to act1
            act1.deposit(10); //Deposits money to act1
            act1.withdraw(60);  //withdraws money from act1
            System.out.println("The balance is: " + money.format(act1.getBalance())); //Prints act1 Balance
        } catch (Throwable ex)  //Catches everytype of exception.
        {
            ex.printStackTrace(); //Prints what exception is thrown.
        }

        BankAccount act2 = new BankAccount("Justin Hill"); //Creates new account
        try
        {
            act2.deposit(45.00); //Deposits money to act2
            act2.withdraw(20);  //Withdraw money from act2
            System.out.println(act2.toString()); //Prints account information about act2
        } catch (Throwable ex)
        {
            ex.printStackTrace();
        }

        BankAccount act3 = new BankAccount("Scam Artist"); //Creates new account
        try
        {
            act3.deposit(10); //Deposits money to act3
            act3.withdraw(260); //Withdraw too much money from act3
        } catch (Throwable ex)
        {
            ex.printStackTrace();
        }

        try
        {
            System.out.println(act3.getNumAccounts()); //Gives the total of accounts.
        } catch (Throwable ex)
        {
            ex.printStackTrace();
        }


    }
}

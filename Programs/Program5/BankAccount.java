import java.util.*;
import java.text.NumberFormat;

public class BankAccount implements AccountInterface
{
    //Data
    private String name;
    private double limit;
    private double balance;
    private final double MAXLIMIT = 500;
    private boolean frozen;
    private Date creationDate = new Date();
    private static int howMany;
    private int accountNumber;


    //Constructors
    public BankAccount()
    {
        this.frozen = false;
        this.howMany += 1;
        this.accountNumber = howMany;
        this.name = "classified";
        this.creationDate = new Date();
        this.balance = 0;
        this.limit = 300;
    }

    public BankAccount(String theName)
    {
        this.frozen = false;
        this.howMany += 1;
        this.accountNumber = howMany;
        this.name = theName;
        this.creationDate = new Date();
        this.balance = 0;
        this.limit = 300;
    }


    //Methods

    // deposit -	Throws a new IllegalArgumentException(<your explanation>) if
    //											--> the deposit amount is negative
    //					Throws a new IllegalStateException(<your explanation>) if
    //											--> the account is frozen
    //					THEN (if everything is OK), adds whatever was passed in to the
    //					balance (therefore �depositing� the money.
    public void deposit(double theMoney)
    {
        if(theMoney < 0)
            throw new IllegalArgumentException("Can't deposit negative funds.");
        if(frozen == true)
            throw new IllegalStateException("Bank account is FROZEN.");

        balance += theMoney;
    }

    // withdraw -	Throws a new IllegalArgumentException(<your explanation>) if
    //									any of the following conditions occur:
    //											--> the withdrawal amount is negative
    //											--> the account does not have enough money
    //											--> the withdrawal amount is more than the limit for that account
    //											--> the withdrawal amount is not a multiple of 20
    //						Throws a new IllegalStateException(<your explanation>) if
    //											--> the account is frozen
    //						THEN (if everything is OK), subtractS whatever is passed in from the balance
    //						(therefore "withdrawing" the money).  It also returns a double representing
    //						the amount that was withdrawn.
    public double withdraw(double theMoney)
    {
        if(theMoney < 0)
            throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        if(theMoney > balance)
            throw  new IllegalArgumentException("Balance less than withdrawal amount");
        if(theMoney > limit)
            throw new IllegalArgumentException("Withdrawal amount larger than account limit");
        if(theMoney%20!=0)
            throw new IllegalArgumentException("Withdrawal amount not a multiple of 20");
        if(frozen==true)
            throw new IllegalStateException("Your account is FROZEN.");

        balance -= theMoney;
        return theMoney;
    }
    // getBalance - returns double representing the account�s balance.
    public double getBalance()
    {
        return balance;
    }

    // freeze - changes its status to "frozen"
    public void freeze()
    {
        this.frozen = true;
    }

    // unfreeze - changes its status to not "frozen"
    public void unfreeze()
    {
        this.frozen = false;
    }

    // setLimit -	Throws a new IllegalArgumentException(<your explanation>) if
    //									any of the following conditions occur:
    //											--> the new limit is negative
    //											--> the new limit is larger than MAXLIMIT
    //						Throws a new IllegalStateException(<your explanation>) if
    //											--> the account is frozen
    //						THEN (if everything is OK), changes the limit for the account to
    //						what was passed in.
    public void setLimit(double newLimit)
    {
        if(newLimit < 0)
            throw new IllegalArgumentException("Limit cannot be negative");
        if(newLimit > MAXLIMIT)
            throw new IllegalArgumentException("Limit cannot be larger than " + MAXLIMIT);
        if(frozen == true)
            throw new IllegalStateException("Account is frozen");

        this.limit = newLimit;
    }

    // getLimit - returns the current limit for the account
    public double getLimit()
    {
        return limit;
    }

    // toString -	returns its representation as a String.
    //					The string should contain the account�s information (name,
    //					account number, balance, withdrawal limit, creationDate),
    //					and should also have \n�s in it so that each part is on a new line.
    public String toString()
    {

        /*String builder was a class i found on java.sun.com
        Upon research for StringBuilder i found that System.getProperty("line.separator") or System.lineSeparator()
        is better to use than \n, apparently this is because \n is system dependant as the other two will work on all systems.
        */
        StringBuilder toStringBuilder = new StringBuilder();
        toStringBuilder.append("\n");
        toStringBuilder.append(name);
        toStringBuilder.append("\n");
        toStringBuilder.append(accountNumber);
        toStringBuilder.append("\n");
        toStringBuilder.append(balance);
        toStringBuilder.append("\n");
        toStringBuilder.append(limit);
        toStringBuilder.append("\n");
        toStringBuilder.append(creationDate);
        return toStringBuilder.toString();
    }

    // NOTE:	A STATIC METHOD CANNOT BE DEFINED IN AN INTERFACE (because:
    //				an interface lists every method that must be implemented and available
    //				to instances of the class.  But static methods go with the class, not with
    //				instances of the class.   But ONE IS LISTED HERE TO BE IMPLEMENTED.

    // getNumAccounts - a static method that returns how many accounts have been created.
    public static int getNumAccounts()
    {
        return howMany;
    }



}

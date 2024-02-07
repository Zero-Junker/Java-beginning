/**
 * updated project 11
 *
 * @author Katelyn Junker
 * @version 11/16/2022
 */
import java.util.*;
public class KatelynJunkerProject12 {
    public static void main(String args[]){
        /* creating account class array of size 4 */
        Account accounts[] = new Account[4];
        Scanner stnd = new Scanner(System.in);
        int accountNum;
        double balance,interest,amount;
        /* assigning CheckingAccount class object into array cell 0 and 1 */
        accounts[0] = new CheckingAccount();
        accounts[1] = new CheckingAccount();

        /* adding data into objects */
        System.out.println("Please enter the account ID number:");
        accountNum = stnd.nextInt();
        accounts[0].setId(accountNum);
        System.out.println("Enter the balance for account #" + accountNum + ":");
        balance = stnd.nextDouble();
        accounts[0].setBalance(balance);
        System.out.println("Please enter the account ID number:");
        accountNum = stnd.nextInt();
        accounts[1].setId(accountNum);
        System.out.println("Enter the balance for account #" + accountNum + ":");
        balance = stnd.nextDouble();
        accounts[1].setBalance(balance);

        /* creating SavingAccount class objects */
        SavingAccount s1 = new SavingAccount();
        SavingAccount s2 = new SavingAccount();

        /* adding data into objects */
        System.out.println("Please enter the account ID number:");
        accountNum = stnd.nextInt();
        s1.setId(accountNum);
        System.out.println("Enter the balance for account #" + accountNum + ":");
        balance = stnd.nextDouble();
        s1.setBalance(balance);
        System.out.println("Please enter an interes rate as a decimal:");
        interest = stnd.nextDouble();
        s1.setInterestRate(interest);
        System.out.println("Please enter the account ID number:");
        accountNum = stnd.nextInt();
        s2.setId(accountNum);
        System.out.println("Enter the balance for account #" + accountNum + ":");
        balance = stnd.nextDouble();
        s2.setBalance(balance);
        System.out.println("Please enter an interes rate as a decimal:");
        interest = stnd.nextDouble();
        s2.setInterestRate(interest);

        /* assigning SavingAccount class object into array cell 0 and 1 */
        accounts[2] =s1;
        accounts[3] = s2;

        /* printing account information */
        System.out.println("\nAccount1 : "+accounts[0]);
        System.out.println("\nAccount2 : "+accounts[1]);

        System.out.println("\nAccount3 : "+accounts[2]);
        System.out.println("\nAccount4 : "+accounts[3]);

        /* adding interest into saving accounts */
        s1.addInterest();
        s2.addInterest();

        /* assigning saving account objects to array  */
        accounts[2] =s1;
        accounts[3] = s2;

        /* printing account information */
        System.out.println("\nAccount3 Updated Balance : "+accounts[2]);
        System.out.println("\nAccount4 Updated Balance : "+accounts[3]);

        /* withdraw from an account */
        System.out.println("Please enter an amount to withdraw form the first account");
        amount = stnd.nextDouble();
        accounts[0].withdraw(amount);

        /* deposit in an account */
        System.out.println("Please enter an amount to deposit in the second account");
        amount = stnd.nextDouble();
        accounts[1].deposit(amount);
        /* printing account information */
        System.out.println("\nAccount0 Updated Balance : "+accounts[0]);
        System.out.println("\nAccount1 Updated Balance : "+accounts[1]);
    }
}
/* Account class */
class Account{
    /* private members of class */
    protected int id;
    protected double balance;
    /* Non-Parameterized constructor  */
    public Account(){
        this.id = 0;
        this.balance = 0;
    }

    /* Parameterized constructor  */
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    } 

    /* getter and setter methods */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /* Deposit method to add money in account */
    public void deposit(double amount){
                try
        {
            if(amount <= 0)
                throw new IllegalAmountException("Illegal amount exception");
            else
            {
                balance += amount;
                System.out.println("Amount Deposited in Account " + id + ": " + amount);
            }
        }
        catch (IllegalAmountException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /* withdraw method to withdraw money from account */
    public void withdraw(double amount){

    }

    /* toString method to display info */
    public String toString(){
        return "ID : "+id+" , Balance : "+balance;
    }
}

/* CheckingAccount */
class CheckingAccount extends Account{
    
    @Override
    public void withdraw(double amount){
        /* condition for lesser or equal amount can be withdraw   */
        try
        {
            if(amount <= 0)
                throw new IllegalAmountException("Illegal amount exception");
            else if(amount > balance)
                System.out.println("Withdrawal amount of " + amount + " is too high for Account " + id);
            else
            {
                balance-= amount;
                System.out.println(amount + " Withdrawed in Account " + id);
            }
        }
        catch (IllegalAmountException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /* toString method to display info */
    @Override
    public String toString(){
        return "CheckingAccount , ID : "+super.getId()+" , Balance : "+super.getBalance();
    }
}

/* SavingAccount */
class SavingAccount extends Account{
    /* private members of SavingAccount class */
    private double interestRate;

    @Override
    public void withdraw(double amount){

        /* condition for lesser or equal to  500+account_balance can be withdraw   */
        try
        {
            if(amount <= 0)
                throw new IllegalAmountException("Illegal amount exception");
            else if(amount > balance-500)
                throw new NoSufficientFundsException("No sufficient funds");
            else
            {
                balance-= amount;
                System.out.println(amount +" Withdrawed in Account " + id);
            }
        }
        catch (IllegalAmountException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NoSufficientFundsException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /* addInterest method to set Interest amount into account balance */
    public void addInterest(){
        super.setBalance( (super.getBalance()* (1+ interestRate)) );
    }

    /* getter and setter methods */
    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /* toString method to display info */
    @Override
    public String toString() {
        return "SavingAccount , ID : "+super.getId()+" , Balance : "+super.getBalance();
    }
}
class IllegalAmountException extends Exception
{
    public IllegalAmountException(String msg)
    {
        super(msg);
    }
}
class NoSufficientFundsException extends Exception
{
    public NoSufficientFundsException(String msg)
    {
        super(msg);
    }
}


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Account
{
    protected int id;
    protected double balance;
    public Account(){
        this(1000,100.00);
    }
    public Account (int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void deposit(double amount) throws IllegalAmountException{
        if( amount < 0){
            throw new IllegalAmountException();
        }
        balance += amount;
    }
    public abstract void withdraw (double amount) throws IllegalAmountException, InsufficientFundsException;
    public String toString(){
        String result = "Account id: " + id;
        result += "\nAccount Balance $";
        return result;
    }
}
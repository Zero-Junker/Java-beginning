
/**
 * Write a description of class CheckingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckingAccount extends Account
{
    public CheckingAccount(){}
    public CheckingAccount(int id, double balance){
        super(id, balance);
    }
    public  void withdraw (double amount) throws IllegalAmountException, InsufficientFundsException{
        if(amount < 0){
            throw new IllegalAmountException();
        }
        if(balance < amount){
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }
}


/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends Account
{
    private double interestRate;
    public static final double MINIMUM_BALANCE = 500.00;
    public static final double DEFAULT_INTEREST_RATE = 0.05;
    public SavingsAccount(){
        super();
        interestRate = 0.0;
    }
        public SavingsAccount(int id, double balance){
        this(id,balance,DEFAULT_INTEREST_RATE);
    }
    public SavingsAccount(int id, double balance, double interestRate){
        super(id,balance);
        this.interestRate = interestRate;
    }
        public  void withdraw (double amount) throws IllegalAmountException, InsufficientFundsException{
        if(amount < 0){
            throw new IllegalAmountException();
        }
        if((balance -MINIMUM_BALANCE) < amount){
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }
    public double addInterest(){
        double interestAdd = balance * (1+ interestRate/12.0);
        balance = balance + interestAdd;
        return interestAdd;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public String toString(){
        String result = super.toString();
        result += "\nInterest Rate: " + interestRate;
        return result;
    }
}

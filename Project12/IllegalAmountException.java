
/**
 * Write a description of class IllegalAmountException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IllegalAmountException extends Exception
{
    public IllegalAmountException(){
        super("The amount must be positive");
    }
    public IllegalAmountException(String s){
        super(s);
    }
}

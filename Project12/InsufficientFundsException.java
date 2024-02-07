
/**
 * Write a description of class InsufficientFundsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsufficientFundsException extends Exception
{
   public InsufficientFundsException(){
       super("You do not have enough funds");
   }
   public InsufficientFundsException (String s){
       super(s);
   }
}

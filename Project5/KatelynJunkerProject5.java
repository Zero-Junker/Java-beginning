
/**
 * calculate the payment for each month and total payed for a given ammount
 * and interest rate.
 * @author Katelyn Junker
 * @version 09/14/2022
 */
import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class KatelynJunkerProject5
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        //declare varaibles
        double borrowed,interestRate,term,termMonths,payment,totalInterest,monthlyInterest,balance,cumulativeInterest;
        char again = 'y';
        do{
            //get input
            Scanner s = new Scanner(System.in);
            //get payment
            System.out.println("Please enter the payment amount");
            borrowed = s.nextDouble();
            balance = borrowed;
            //get interest
            System.out.println("Please enter the interest as a decimal");
            interestRate = s.nextDouble();
            //get term
            System.out.println("Please enter the term of the loan in years");
            term = s.nextDouble();
            //calculate total amount due back
            // calculate payment for each month
            totalInterest = 0;
            termMonths = term * 12;
            monthlyInterest = interestRate/12;
            payment =  borrowed * monthlyInterest * Math.pow(1+monthlyInterest,termMonths)/(Math.pow(1+monthlyInterest,termMonths)-1);
            //print out amprtization table
            System.out.println("Month       Payment     Total Interest Paid      Monthly Interest        Balance");
            df.setRoundingMode(RoundingMode.UP);
            //for loop
            //for(int i = 1; i < termMonths; i++){
            // calculate interest amount for each month
            //cumulativeInterest = ((borrowed*monthlyInterest)-payment)*((Math.pow(1+monthlyInterest,i)-1)/monthlyInterest) + (payment*i);
            //claculate money left to pay (balance)
            //balance = (Math.pow((1 + monthlyInterest),i) * borrowed) - ((Math.pow((1 + monthlyInterest),i)-1)) / (monthlyInterest) * payment;
            //calculate total interest amount
            //totalInterest += cumulativeInterest;
            //System.out.println(i + "        $" + df.format(payment) + "      $" + df.format(totalInterest) + "       $" + df.format(cumulativeInterest) + "      $" + df.format(balance));
            //}
            //while loop
            int temp = 1;
            while (temp < termMonths){
                // calculate interest amount for each month
                cumulativeInterest = ((borrowed*monthlyInterest)-payment)*((Math.pow(1+monthlyInterest,temp)-1)/monthlyInterest) + (payment*temp);
                //claculate money left to pay (balance)
                balance = (Math.pow((1 + monthlyInterest),temp) * borrowed) - ((Math.pow((1 + monthlyInterest),temp)-1)) / (monthlyInterest) * payment;
                //calculate total interest amount
                totalInterest += cumulativeInterest;
                System.out.println(temp + "          $" + df.format(payment) + "       $" + df.format(totalInterest) + "                  $" + df.format(cumulativeInterest) + "             $" + df.format(balance));
                temp ++;
            }
            //ask if want to repeat
            System.out.println("Would you like to enter another loan? (Y or N)");
            again = s.next().charAt(0);
            if ((again != 'y') && (again!='Y') && (again !='n') && (again !='N')){
                System.out.println("Invalid input please enter Y or N");
                again = s.next().charAt(0);
            }else{
                if((again == 'n') || (again == 'N')){
                System.out.println("Have a nice day.");
                System.exit(0);
            }
            }
        }while ((again == 'y') || (again == 'Y'));
    }
}


/**
 * This project randomly generates a number between 1 and 99.
 * It then determins how many quarters,dimes,nickles,and pennies make up
 * said number.
 * @author Katelyn Junker
 * @version 09/03/2022
 */
import java.util.*;
import java.lang.Math;
public class KatelynJunkerProj2
{
    public static void main(String[] args){
        //declare variables
        int quarters = 0,dimes = 0,nickles = 0,pennies = 0,cents = 0;
        Random r = new Random();
        //get user input
        /**Scanner input = new Scanner(System.in);
        *System.out.println("Please enter change as a whole number (ex: 92)");
        *cents = input.nextInt();
        **/
        
        //randomise input
        cents = r.nextInt(99-1) + 1;
        System.out.println("In " + cents + " there are:");
        
        //find amount of quarters,dimes,nickles,and pennies
        if(cents >= 25){
            quarters = (cents / 25);
            cents -= (quarters * 25);
        }
        if(cents >= 10){
            dimes = (cents / 10);
            cents -= (dimes * 10);
        }
        if(cents >= 5){
            nickles = (cents / 5);
            cents -= (nickles * 5);
        }
        if(cents >= 1){
            pennies = cents;
        }
        
        //print amounts
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + nickles);
        System.out.println("Pennies: " + pennies);
    }
}

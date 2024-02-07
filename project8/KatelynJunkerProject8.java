
/**
 * this program takes a decimal transfers it to binary than prints a 3x3
 * grid of heads or tails 
 * @author Katelyn Junker
 * @version 10/12/2022
 */
import java.util.*;
public class KatelynJunkerProject8
{
    public static void main(String[] args){
        //declare variables
        int coinState,row = 0;
        String binary;
        char zero = '0', again = 'y';
        //explain program
        System.out.println("A 3x3 grid has 511 different possible combinations of coins showing heads or tails");
        System.out.println("This program takes a number between 0 and 511 and displays the corrisponding matrix.");
        //get input
        Scanner stnd = new Scanner(System.in);
        do{
        System.out.println("Please enter the state of the coins as a whole number between 0 and 511: ");
        coinState = stnd.nextInt();
        if((coinState > 511) || (coinState < 0)){
            System.out.println("INvalid entry please enter a number between 0 and 511: ");
            coinState = stnd.nextInt();
        }
        //convert decimal to binary
        binary = Integer.toBinaryString(coinState);
        //make sure string has 9 chars
        if(binary.length() < 9){
            for(int i = binary.length(); i < 9; i ++){
                binary = zero + binary;
            }
        }
        //replace 0 with H and 1 with T
        binary = binary.replace("0","H");
        binary = binary.replace("1","T");
        //print 3x3 grid
        for(int i = 0; i < 9; i ++){
            if(row == 3){
                System.out.println();
                row = 0;
            }
            System.out.print(binary.charAt(i));
            row++;
        }
        System.out.println();
        System.out.println("Would you like to go again? (y/n)");
        again = stnd.next().charAt(0);
        if((again != 'y') && (again != 'Y') && (again != 'n') && (again != 'N')){
            System.out.println("Invalid input please enter y or n");
            again = stnd.next().charAt(0);
        }else if ((again == 'n') || (again == 'N')){
            System.out.println("Have a good day!");
        }
    }while((again == 'y') || (again == 'Y'));
}
}


/**
 * convert binary into an integer number easy and hard
 *
 * @author Katelyn Junker
 * @version 09/12/2022
 */
import java.util.*;
public class KatelynJunkerProject4
{
   public static void main(String[] args){
       //variables
       String binaryString;
       int number = 0,binary,temp,n = 0;
       //get binary input
       Scanner sc = new Scanner(System.in);
       binaryString = sc.nextLine();
       
       //change to int
       
       //easy way:
       //System.out.println(Integer.parseInt(binaryString,2));
       //hard way:
        binary = Integer.parseInt(binaryString);
        if(binary == 0){
            number = 0;
        }else{
            while(binary != 0){
            temp = binary % 10;
            number += temp*Math.pow(2,n);
            binary = binary / 10;
            n++;
        }
    }
    System.out.println(number);
   }
}

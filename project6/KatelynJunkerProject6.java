
/**
 * recives a string from user
 * recives a letter from the user
 * counts the number of english letters in the string given
 * counts the ammount of times the letter given appears in the string
 * @author Katelyn Junker
 * @version 09/28/2022
 */
import java.util.*;
public class KatelynJunkerProject6
{
    public static void main(String[] args){
        String s;
        char c,again = 'y';
        int engLetters, amountChar;
        Scanner stnd = new Scanner(System.in);
        do{
            System.out.println("please enter a string of characters with no spaces");
            s = stnd.next();
            System.out.println("Please enter one character");
            c = stnd.next().charAt(0);
            engLetters = countLetters(s);
            amountChar = countLetters(s,c);
            System.out.println("There are " + engLetters + " English letters in this string");
            System.out.println("The character " + c + " appears " + amountChar + " Times in this string");
            System.out.println("Would you like to enter another string? (y or n)");
            again = stnd.next().charAt(0);
            if((again != 'y') && (again != 'Y') && (again != 'n') && (again != 'N')){
                System.out.println("Invalid input, please enter a y or n");
                again = stnd.next().charAt(0);
            }
            if ((again == 'n') || (again == 'N')){
                System.out.println("Have a good day");
                System.exit(0);
            }
        }while ( (again == 'y') || (again == 'Y'));
    }
    /**
     * recives a string and counts the number of english letters in it.
     * @param s string recived from user
     * @return the number of letters in the string
     */
    public static int countLetters (String s){
        char y;
        int engLetters = 0;
        for(int i = 0; i < s.length(); i ++){
            y = s.charAt(i);
            if(Character.isAlphabetic(y)){
                engLetters ++;
            }
        }
        return engLetters;
    }
    /**
     * counts the ammount of times a char (c) appears in a given string (s).
     * @param s string recived form user
     * @param c character recived from user
     * @return the amount of times c appears in s
     */
    public static int countLetters (String s, char c){
        char y;
        int amountChar = 0;
        if(!(Character.isAlphabetic(c))){
            return -1;
        }
        for(int i = 0; i < s.length(); i ++){
            y = s.charAt(i);
            if(y == c){
                amountChar ++;
            }
        }
        return amountChar;
    }
}

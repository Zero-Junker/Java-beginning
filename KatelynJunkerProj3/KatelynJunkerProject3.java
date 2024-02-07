
/**
 * user inputs a number between 0 and 100, the program then uses switches to 
 * find the letter grade of the numerical value.
 * 
 * @author Katelyn Junker
 * @version 09/07/2022
 */
import java.util.*;
public class KatelynJunkerProject3
{
    public static void main(String[] srgs){
        //declare variables
        int grade;
        char letterGrade;
        //get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade as a number between 0-100");
        grade = input.nextInt();
        //check for valid input
        if((grade > 100) || (grade < 0)){
            System.out.println("invalid input");
            System.exit(0);
        }
        //if else-statment to find letter grade
        /**if(grade >= 90){
         * letterGrade = 'A';
         *}else if(grade >= 80){
         * letterGrade = 'B';
         *}else if(grade >= 70){
         *letterGrade = 'C';
         *}else if(grade >= 60){
         * letterGrade = 'D';
         *}else{
         * letterGrade = 'F';
         *}
         *}
         **/
        //switch to find letter grade
        switch(grade/10){
            case 9:
                letterGrade = 'A';
                break;
            case 8:
                letterGrade = 'B';
                break;
            case 7:
                letterGrade = 'C';
                break;
            case 6:
                letterGrade = 'D';
                break;
            default:
                letterGrade = 'F';
                break;
        }

        
        //print out grade
        System.out.println("Your grade at " + grade + " is a " + letterGrade);
    }
}


/**
 * tests code from MyString program
 *
 * @author Katelyn Junker
 * @version 11/13/2022
 */
import java.util.Arrays;
public class MyStringTest {
    public static void main(String[] args) {
        MyString ms = new MyString("hello".toCharArray());
        ms.output();
        System.out.println("Character at 0 index is : "+ms.charAt(0));
        System.out.println("Sunstring of "+Arrays.toString(ms.data)+" from 1 is : ");
        ms.substring(1).output();
        System.out.println("Sunstring of "+Arrays.toString(ms.data)+" from 0 to 3 is : ");
        ms.substring(0,3).output();
        System.out.println("Coverting string to UpperCase : ");
        ms.toUpperCase().output();
        System.out.println("Coverting string to LowerCase : ");
        ms.toLowerCase().output();
        System.out.println("Value of 97 is : ");
        MyString.valueOf(97).output();
    }

}

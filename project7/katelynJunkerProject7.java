
/**
 * 
 * This program generates an array with 10 elements between 0 and 100 then does the following
 * print out the array
 * find the largest element
 * find the smalles element
 * fin the range of the elements
 * find the average of the elements
 * ask for a number between 0 and 100 and checks if that number is present and, if so, when it first appears
 * sort the array from smalles to largest
 * re-print the array;
 * @author Katelyn Junker
 * @version 10/3/2022
 */
import java.util.*;
public class katelynJunkerProject7
{
    public static void main (String args[]){
        //declare variables and initialize scanner
        Scanner stnd = new Scanner(System.in);
        int key,index;
        char again = 'y';
        int[] tester;
        do{
        tester = new int[10];
        //test initialize array
        initializeArray(tester);
        //test print array
        System.out.println("The current array is: ");
        printArray(tester);
        //test largst
        System.out.println("The largest number in the array is: " + largest(tester));
        //test smallest
        System.out.println("The smallest number in the array is: " + smallest(tester));
        //test range
        System.out.println("The range of the array is: " + range(tester));
        //test average
        System.out.println("The average value of the array is: " + average(tester));
        //test linearSearch
        System.out.println("Please enter a number between 0 and 100 to search for");
        key = stnd.nextInt();
        if((key < 0) || (key > 100)){
            System.out.println("Invalid input, please neter a number between 0 and 100.");
            key = stnd.nextInt();
        }
        index = linearSearch(tester, key);
        if(index == -1){
            System.out.println(key + " does not appear in this array");
        }else{
            System.out.println(key + " first appears at index " + index);
        }
        //test selectSort
        selectSort(tester);
        //print array again
        System.out.println("The array in numerical order is: ");
        printArray(tester);
        System.out.println("Would you like another array? (y/n)");
        again = stnd.next().charAt(0);
        if((again != 'y') && (again != 'Y') && (again != 'n') && (again != 'N')){
            System.out.println("Invalid input, please enter y or n");
            again = stnd.next().charAt(0);
        }
    }while((again =='y') || (again == 'Y'));
    }

    /** return the index of the first occurrence of key in arr
     * if key is not found in arra, return -1
     * @param arr[] an array of 10 integers
     * @param key the integer being searched for in the key
     * @return the index of the first time key appears in arr[] or -1 if key is not found
     */
    public static int linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    /** sort the arr from least to largest by using select sort algorithm
     * @param arr[] an array with ten integers
     */    
    public static void selectSort(int arr[]){
        int minIndex = 0,temp;
        for(int i = 0; i < (arr.length - 1); i ++){
            minIndex = i;
            for(int j = i; j < arr.length; j ++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    /**    print out all array elements. 5 elements per line
     * @param arr[] an array with ten integers
     */

    public static void printArray(int arr[]){
        int n = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            n++;
            if(n == 5){
                System.out.println();
            }
        }
        System.out.println();
    }

    /** assign each element in array with a random number    
     * between 1 and 100, inclusive
     * @param arr[] an array with ten integers
     */
    public static void initializeArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * ((100-0) + 1));
        }
    }

    /**    find the range of all array elements
     * the range is defined as the difference between the largest and smallest elements
     * @param arr[] an array with ten integers
     * @return the difference between the biggest and smallest integers in the array
     */
    public static int range(int arr[]){
        int range;
        range = (largest(arr) - smallest(arr));
        return range;
    }

    /**    find the largest element in array
     * @param arr[] an array with ten integers
     * @return finds the larges integer in the array
     */

    public static int largest(int arr[]){
        int max;
        max = arr[0];
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    /**    find the smallest element in array
     * @param arr[] an array with ten integers
     * @return finds the smalles integer in the array
     */

    public static int smallest(int arr[]){
        int min;
        min = arr[0];
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    /**    find the average value of all elements in array
     * @param arr[] an array with ten integers
     * @return the average of all integeres in the array
     */

    public static double average(int arr[]){
        double ave = 0;
        for(int i = 0; i < arr.length; i ++){
            ave += arr[i];
        }
        ave = (ave/arr.length);
        return ave;
    }
}

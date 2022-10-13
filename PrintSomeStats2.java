/**
 * @author: Justin Lo
 * @version 1.15
 * @since 2022-01-24
 * Descritpion:  Prompt and read in two integers with two separate variables storing those values. 
 * It will output the sum, difference, product, average, the positive distance 
 * between the two values,the maximum, and the minimum. 
 */
import java.util.Scanner;

public class PrintSomeStats2 {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);  //creating scanner object to take in keyboard input
        System.out.print("Please enter two integers seperated with spaces: "); //asking user for integer
        int firstInt = in.nextInt(); //will only read Int
        int secondInt = in.nextInt();

        in.close(); //closes scanner object 
        System.out.printf("Sum: %11d\n", (firstInt + secondInt)); //prints out to the screen
        System.out.printf("Difference: %4d\n", (firstInt - secondInt));
        System.out.printf("Product: %7d\n", (firstInt * secondInt));
        System.out.printf("Average: %7d\n", ((firstInt + secondInt)/2)); //"%7.2f" doesn't seem to be working :\
        System.out.printf("Distance: %6d\n", (firstInt * secondInt));
        System.out.printf("Min: %11d\n", Math.min(firstInt, secondInt));
        System.out.printf("Max: %11d\n", Math.max(firstInt, secondInt));
    }
}

/**
 * @author: Justin Lo
 * @version 1.15
 * @since 2022-01-19
 * Descritpion:  Prompt and read in two integers with two separate variables storing those values. 
 * It will output the sum, difference, product, average, the positive distance 
 * between the two values,the maximum, and the minimum. 
 */
import java.util.Scanner;

public class PrintSomeStats {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);  //creating scanner object to take in keyboard input
        System.out.print("Please enter two integers seperated with spaces: "); //asking user for integer
        int firstInt = in.nextInt(); //will only read Int
        int secondInt = in.nextInt();

        in.close(); //closes scanner object 
        System.out.printf("Sum: %5d"+ (firstInt + secondInt)); //prints out to the screen
        System.out.printf("Difference: %10d"+ (firstInt - secondInt));
        System.out.printf("Product: %10d"+ (firstInt * secondInt));
        System.out.printf("Average: %10d"+ (firstInt + secondInt)/2);
        System.out.printf("Distance: %10d"+ (firstInt * secondInt));
        System.out.printf("Min: %10d"+ Math.min(firstInt, secondInt));
        System.out.printf("Max: %10d"+ Math.max(firstInt, secondInt));
    }
}

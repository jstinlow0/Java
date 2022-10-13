  /**
 * @author: Justin Lo
 * @version 1.15
 * @since 2022-01-24
 * Descritpion: Reads four integers and print "two pairs" if the input consists 
 * of two matching pairs in some order and "not two pairs: otherwise.
 */
import java.util.Scanner; 

public class pairs {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);  //creating scanner object to take in keyboard input
        System.out.print("Please enter 4 integers seperated with spaces: "); //asking user for integer
        
        int firstInt = in.nextInt(); //will only read Int
        int secondInt = in.nextInt();
        int thirdInt = in.nextInt();
        int fourthInt = in.nextInt();

        in.close(); //closes Scanner object. 

        int pairs = 0;
        
        //compares the entered integers with one another. 
        if (firstInt == secondInt || firstInt == thirdInt || firstInt == fourthInt) {
            pairs++;

            if (secondInt == thirdInt || secondInt == fourthInt || thirdInt == fourthInt) {
                pairs++;
            }
        }
        else{
            if (secondInt == thirdInt || secondInt == fourthInt || thirdInt == fourthInt) {
                pairs++;
            }
        }
        switch(pairs)
        {
            case 1 : System.out.println("There is just one pair.");
                break;
            case 2 : System.out.println("There are two pairs.");
                break;
            default: System.out.println("There are no pairs.");

        
        }
    }
    
}

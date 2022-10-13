public class TallyHo {

    // Instance variables = must be private which means
    // they only exist inside class and not publically outside
    // Define a variable with a type and name
    private int value;
    private int limit;

    // All public methods together in a class are the "public interface"
   
    // Constructor - is a special method that sets up instance variables
    // Looke like a method with no return type
    // The constructor alwasy has a capital letter at the start, because
    // its name always matches the class name.
    public TallyHo(int value) { // A Constructor
        limit = value;
        value = 0;
    }
    
    /**
     * Method adds 1 to the current value
     * also display message if value exceeds set limit
     */
    public void countValue() {
        value++;
        if (value >= limit){
            System.out.println("Limit exceeded.");
        }
    }

    /**
     * Method returns current contents of value
     */
    public int getValue() {
        return value;
    }

    // Method resets value to zero
    public void resetValue() {
        value = 0;
    }

    /**
     * sets a limit to how much the value can be
     */
    public void setLimit(int max) {
        limit = max;
    }

    /**
     * decrement the value by 1. 
     * will inform user if the value is going to be lower than 0
     */
    public void undo() {
        if(value <= 0) {
            System.out.println("Cannot undo below 0.");
        } else {
            value--; //decrement by 1
        }
    }

    /**
     * reports back remaining space in counter
     */
    public int space() {
        return limit - value; 
    }
}
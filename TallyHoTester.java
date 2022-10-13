

public class TallyHoTester {

    public static void main(String[] args) {
        // Create our own TallyCounter object
        // Call the constructor..
        // When we construct an object, we need to use new keyword
        TallyHo counter = new TallyHo(0);
        TallyHo counter2 = new TallyHo(10);

        // Exercise the object’s instance methods
        counter.setLimit(5);
        counter.countValue();
        counter.countValue();
        counter.countValue();
        counter.countValue();

        for (int i = 0; i < 6; i++) {
            counter.undo();
        }

        System.out.println("The tally is " + counter.getValue());
        System.out.println("The space available is " + counter.space());

        for (int i = 0; i < 8; i++) {
            counter2.countValue();
        }
        counter2.countValue();
        System.out.println("The tally2 is " + counter2.getValue());
        counter2.countValue();
        counter2.countValue();
        counter2.setLimit(18);
        System.out.println("The space available is " + counter2.space());

        System.out.println("The tally1 is " + counter.getValue());

        counter.countValue();
        counter.countValue();
        System.out.println("Now we have " + counter.getValue());

        counter.resetValue();
        System.out.println("Now we have " + counter.getValue());

        System.out.println("Finished here.");
    }
}
public class CashRegisterTester {
    
    public static void main (String[] args) {

        CashRegisterMod register1 = new CashRegisterMod();
        register1.addItem(1.95);
        register1.addItem(.55);
        register1.addItem(2.85);
        System.out.println(register1.getCount());
        System.out.println("Expected value: 3");

        System.out.printf("$%.2f%n", register1.getTotal());
        System.out.println("Expected value: $5.35");

        System.out.println("Displaying all of items: " + register1.displayAll());

        System.out.println("Cash Register Cleared. "+ register1.clear());

        System.out.println("Displaying all of items: " + register1.displayAll());
        System.out.println("Expected value: $0.00");

    }

}

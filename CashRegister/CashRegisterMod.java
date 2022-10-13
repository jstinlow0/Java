// import for arraylist
import java.util.ArrayList;

/** 
 * JavaDocs with author and date info
 * A simulated cash register that tracks the item count and
   the total amount due.
*/

public class CashRegisterMod
{
   private ArrayList<Double> itemPrices = new ArrayList<Double>();   //instance of ArrayList
   private double totalPrice;
   private double itemPrice;
   //=============Constructor=====================
   /**
      Constructs a cash register with cleared item totals
   */
  public CashRegisterMod() {
     totalPrice = 0.00;
     itemPrice = 0.00;
  }
   

   //=============addItem=====================
   /**
      Adds an item to this cash register.
      @param price the price of this item
   */
  public void addItem(double price) {
     itemPrice = price;
     itemPrices.add(itemPrice);

  }

   
   //=============getTotal=====================
   /**
      Gets the price of all items of the current sale.
      @return the total price
   */
  public double getTotal() {
      for (int i = 0; i < itemPrices.size(); i++) {
         totalPrice += itemPrices.get(i);
      }
      return totalPrice;
   }

   //=============getCount=====================
   /**
      Gets the number of items in the current sale.
      @return the item count
   */
   public int getCount() {
      return itemPrices.size();
   }

   //=============clear=====================
   /**
      Clears the item count and the total.
   */
   public Boolean clear() {
      itemPrices.clear();
      totalPrice = 0.00;
      return true;
   }


   //=============displayAll=====================
   /**
      Displays the prices of all items in the current sale.
   */
   public Boolean displayAll() {
      for ( Double item : itemPrices) {
         System.out.printf("$%.2f\n", item);
      }
      return true;
   }

}
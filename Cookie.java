   /** 
   * A simple program to manage baked sales.
   * 
   * Project 9
   * Collin Ward – COMP-1210 - 001
   * 11/3/22
   */ 
public class Cookie extends BakedItem {
/**
* Double BASE_RATE does not change.
*/
   public static final double BASE_RATE = .35;
   
   /**
   * Cookie constructor.
   * @param nameIn is name
   * @param flavorIn is flavor
   * @param quantityIn is quantity
   * @param ingredientsIn is ingredients array
   */
   public Cookie(String nameIn, String flavorIn,
      int quantityIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
   }
  /**
   * price method.
   * @return price is price
   */
   public double price() {
      double price = BASE_RATE * quantity;
      return price;
   }
}
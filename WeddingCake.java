   /** 
   * A simple program to manage baked sales.
   * 
   * Project 9
   * Collin Ward – COMP-1210 - 001
   * 11/3/22
   */ 
public class WeddingCake extends Cake {
   private int tiers;
    /**
   * BASE_RATE does not change, 15.
   */
   public static final double BASE_RATE = 15.0;
 /** 
   * WeddingCake constructor.
   * @param nameIn is name
   * @param flavorIn is flavor
   * @param quantityIn is quantity
   * @param layerIn is layers
   * @param tiersIn is tiers
   * @param ingredientsIn is ingredients
   */
   public WeddingCake(String nameIn, String flavorIn,
      int quantityIn, int layerIn, int tiersIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, layerIn, ingredientsIn);
      tiers = tiersIn;
   }
/**
* getTiers method.
* @return tiers is tiers
*/
   public int getTiers() {
      return tiers;
   }
    /**
* setTiers method.
* @param tiersIn is num tiers
*/
   public void setTiers(int tiersIn) {
      tiers = tiersIn;
   }
    /**
* price method.
* @return price is price
*/
   public double price() {
      double price = (BASE_RATE * layers * tiers) * quantity;
      return price;
   }

}
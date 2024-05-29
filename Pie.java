   /** 
   * A simple program to manage baked sales.
   * 
   * Project 9
   * Collin Ward – COMP-1210 - 001
   * 11/3/22
   */ 
public class Pie extends BakedItem {
   private double crustCost;
   /**
   * BASE_RATE does not change, 12.0.
   */
   public static final double BASE_RATE = 12.0;
   /**
   * Pie constructor.
   * @param nameIn is name
   * @param flavorIn is flavor
   * @param quantityIn is quantity
   * @param crustCostIn is crustCost
   * @param ingredientsIn is ingredients
   */
   public Pie(String nameIn, String flavorIn, int quantityIn,
      double crustCostIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      crustCost = crustCostIn;
   }
    /**
   * getCrustCost method.
   * @return crustCost is crust cost
   */
   public double getCrustCost() {
      return crustCost;
   }
    /**
   * setCrustCost method.
   * @param crustCostIn is cost of crust
   */
   public void setCrustCost(double crustCostIn) {
      crustCost = crustCostIn;
   }
    /**
   * price method.
   * @return price is price
   */
   public double price() {
      double price = (BASE_RATE + crustCost) * quantity;
      return price;
   }

}
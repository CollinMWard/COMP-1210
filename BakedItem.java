import java.text.DecimalFormat;
  /** 
   * A simple program to manage baked sales.
   * 
   * Project 9
   * Collin Ward – COMP-1210 - 001
   * 11/3/22
   */ 
   
public abstract class BakedItem implements Comparable<BakedItem> {
   protected String name = "";
   protected int quantity = 0;
   protected String flavorType = "";
   protected String[] ingredients;
   protected static int count = 0;
 /**
 * BakedItem constructor.
 * @param nameIn is name
 * @param flavorIn is flavor
 * @param quantityIn is quantity
 * @param ingredientsIn is array of ingredients
 */
   public BakedItem(String nameIn, String flavorIn, int quantityIn,
      String...ingredientsIn) {
      name = nameIn;
      flavorType = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      count++;
   }
   /**
   * getName method.
   * @return name is name
   */
   public String getName() {
      return name;
   }
    /**
   * setName method.
   * @param nameIn is name
   *
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
    /**
   * getFlavor method.
   * @return flavorType is flavor
   */
   public String getFlavor() {
      return flavorType;
   }
    /**
   * setFlavor method.
   * @param flavorIn is flavor
   */
   public void setFlavor(String flavorIn) {
      flavorType = flavorIn;
   }
    /**
   * getQuantity method.
   * @return quanity is quantity
   */
   public int getQuantity() {
      return quantity;
   }
    /**
   * setQuantity method.
   * @param quantityIn is quantity
   */
   public void setQuantity(int quantityIn) {
      quantity = quantityIn;
   }
    /**
   * getIngredients method.
   * @return ingredients is array of ingredients
   */
   public String[] getIngredients() {
      return ingredients;
   }
    /**
   * setIngredients method.
   * @param ingredientsIn is ingredientsIn array
   */
   public void setIngredients(String...ingredientsIn) {
      ingredients = ingredientsIn;
   }
    /**
   * getCount method.
   * @return count is total count of baked goods
   */
   public static int getCount() {
      return count;
   }
    /**
   * resetCount method.
   *
   */
   
   public static void resetCount() {
      count = 0;
   }
    /**
   * toString method.
   * @return output is formated output
   */
   public final String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
      String output2 = "";
   
      for (int i = 0; i < ingredients.length; i++) {
         if (i != 0 && i % 5 == 0) {
            output2 += "\n";
         }
         output2 += ingredients[i].trim();
      
         if (i != ingredients.length - 1) {
            output2 += ", ";
         }
      }
    
      String output = 
         this.getClass().toString().substring(6) + ": "
            + name.trim() + " - " + flavorType.trim()
         + "   Quantity: " + quantity + "   Price: "
            + decimalFormat.format(price()).trim()
         + "\n(Ingredients: " + output2.trim() + ")";
   
   
      return output;
   }
    /**
   * price method.
   * @return price is price
   */
   public abstract double price();
    /**
   * compareTo method.
   * @param other is bakedItem
   * @return is alphebatic order
   */
   
   public int compareTo(BakedItem other) {
      return this.toString().toLowerCase()
         .compareTo(other.toString().toLowerCase());
   }
   
   

}
   /** 
   * A simple program to manage baked sales.
   * 
   * Project 9
   * Collin Ward – COMP-1210 - 001
   * 11/3/22
   */ 
public class Cake extends BakedItem {
   protected int layers;
      /**
   * BASE_RATE does not change, 8.
   */
   public static final double BASE_RATE = 8;
   /**
   * Cake constructor.
   * @param nameIn is name
   * @param flavorIn is flavor
   * @param quantityIn is quantity
   * @param layerIn is layers
   * @param ingredientsIn is ingredients
   */
   public Cake(String nameIn, String flavorIn,
      int quantityIn, int layerIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layerIn;
   }
    /**
   * getLayer method.
   * @return layers is num of layers
   */
   public int getLayers() {
      return layers;
   }
 /**
   * setLayers method.
   * @param layerIn is num layer
   */
   public void setLayers(int layerIn) {
      layers = layerIn;
   }
 /**
   * price method.
   * @return price is price
   */
   public double price() {
      double price = (BASE_RATE * layers) * quantity;
      return price;
   }
   
}
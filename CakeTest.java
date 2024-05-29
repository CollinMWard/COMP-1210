import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
   /** 
   * A simple program to manage baked sales.
   * 
   * Project 9
   * Collin Ward – COMP-1210 - 001
   * 11/3/22
   */ 

public class CakeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
 /**
   * getLayerTest method.
   *
   */
   @Test public void getLayerTest() {
      Cake c1 = new Cake("c1", "van", 1, 1, "flour", "sugar", "eggs");
      Assert.assertEquals(c1.getLayers(), 1);
   }
    /**
   * setLayerTest method.
   *
   */
   @Test public void setLayerTest() {
      Cake c1 = new Cake("c1", "van", 1, 1, "flour", "sugar", "eggs");
      c1.setLayers(2);
      Assert.assertEquals(c1.getLayers(), 2);
   }
    /**
   * priceTest method.
   *
   */
   @Test public void priceTest() {
      Cake c1 = new Cake("c1", "van", 1, 1, "flour", "sugar", "eggs");
      Assert.assertEquals(c1.price(), 8.0, .00001);
   }
}

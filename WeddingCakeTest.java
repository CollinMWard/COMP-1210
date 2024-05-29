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

public class WeddingCakeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
    /**
* getTierTest method.
*
*/
   @Test public void getTiersTest() {
      WeddingCake w1 = new WeddingCake("w1", "van", 1, 1, 1, "sugar", "flour");
      Assert.assertEquals(w1.getTiers(), 1);
   }
    /**
* setTiersTest method.
*
*/
   @Test public void setTiersTest() {
      WeddingCake w1 = new WeddingCake("w1", "van", 1, 1, 1, "sugar", "flour");
      w1.setTiers(2);
      Assert.assertEquals(w1.getTiers(), 2);
   }
    /**
* priceTest method.
*
*/
   @Test public void priceTest() {
      WeddingCake w1 = new WeddingCake("w1", "van", 1, 1, 1, "sugar", "flour");
      Assert.assertEquals(w1.price(), 15.0, .001);
   }
}

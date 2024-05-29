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
public class PieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
    /**
   * getCrustCostTest method.
   */
   @Test public void getCrustCostTest() {
      Pie p1 = new Pie("p1", "bb", 1, 1, "flour", "sugar");
      Assert.assertEquals(p1.getCrustCost(), 1, .001);
   }
      /**
   * setCrustCostTest method.
   */
   @Test public void setCrustCostTest() {
      Pie p1 = new Pie("p1", "bb", 1, 1, "flour", "sugar");
      p1.setCrustCost(2);
      Assert.assertEquals(p1.getCrustCost(), 2, .001);
   }
      /**
   * priceTest method.
   */
   @Test public void priceTest() {
      Pie p1 = new Pie("p1", "bb", 1, 1, "flour", "sugar");
      Assert.assertEquals(p1.price(), 13.0, .001);
   }
}

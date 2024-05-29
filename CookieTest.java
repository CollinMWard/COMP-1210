import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

   /** 
   * A simple program to manage baked sales.
   * 
   * Project 9
   * Collin Ward – COMP-1210 - 001
   * 11/3/22
   */ 
public class CookieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   * getNameTest method.
   */
   @Test public void getNameTest() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      Assert.assertEquals(c1.getName(), "c1");
   }
   /**
   * setNameTest method.
   */
   @Test public void setNameTest() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      c1.setName("c2");
      Assert.assertEquals(c1.getName(), "c2");
   }
   /**
   * getFlavorTest method.
   */
   @Test public void getFlavorTest() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      Assert.assertEquals(c1.getFlavor(), "choc");
   }
   /**
   * setFlavorTest method.
   */
   @Test public void setFlavorTest() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      c1.setFlavor("van");
      Assert.assertEquals(c1.getFlavor(), "van");
   }
   /**
   * getQuantityTest method.
   */
   @Test public void getQuantityTest() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      Assert.assertEquals(c1.getQuantity(), 1);
   }
   /**
   * setQuantityTest method.
   */
   @Test public void setQuantityTest() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      c1.setQuantity(2);
      Assert.assertEquals(c1.getQuantity(), 2);
   }
   /**
   * getIngredientsTest method.
   */
   @Test public void getIngredientsTest() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      String[] c2 = new String[2];
      c2[0] = "sugar";
      c2[1] = "flour";
      Arrays.equals(c1.getIngredients(), c2);
   }
   /**
   * setIngredientsTest method.
   */
   @Test public void setIngredientsTest() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      String[] c2 = new String[3];
      c2[0] = "sugar";
      c2[1] = "flour";
      c2[2] = "eggs";
      c1.setIngredients(c2);
      Arrays.equals(c1.getIngredients(), c2);
   }
   /**
   * getCountTest method.
   */
   @Test public void getCountTest() {
      BakedItem.resetCount();
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      Cookie c2 = new Cookie("c1", "choc", 1, "sugar", "flour");
      Assert.assertEquals(BakedItem.getCount(), 2);
   }
   /**
   * resetCountTest method.
   */
   @Test public void resetCountTest() {
      BakedItem.resetCount();
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      Cookie c2 = new Cookie("c1", "choc", 1, "sugar", "flour");
      BakedItem.resetCount();
      Assert.assertEquals(BakedItem.getCount(), 0);
   }
   /**
   * toStringTest1 method.
   */
   @Test public void toStringTest1() {
      Cookie c1 = new Cookie("c1", "choc", 1);
      Assert.assertTrue(c1.toString().contains("Ingredients: "));
   }
    /**
   * toStringTest2 method.
   */
   @Test public void toStringTest2() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour",
         "coke", "meth", "so", "workpls");
      Assert.assertTrue(c1.toString().contains("\n"));
   }
    /**
   * toStringTest3 method.
   */
   @Test public void toStringTest3() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour",
         "coke", "meth", "so", "jodf", "dfsf", "gott");
      Assert.assertTrue(c1.toString().contains("dfsf"));
   }
    /**
   * toStringTest4 method.
   */
   @Test public void toStringTest4() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour",
         "coke", "meth", "so", "jodf", "dfsf", "gott", "why");
      Assert.assertTrue(c1.toString().contains("\n" + "jodf"));
   }
        /**
   * toStringTest5 method.
   */
   @Test public void toStringTest5() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour",
         "coke", "meth", "so");
      Assert.assertTrue(c1.toString().contains("so"));
   }
   /**
   * priceTest method.
   */
   @Test public void priceTest() {
      Cookie c1 = new Cookie("c1", "choc", 1, "sugar", "flour");
      Assert.assertEquals(c1.price(), .35, .001);
   }  
}

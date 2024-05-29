import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

    /** 
   * A simple program to test baked sales.
   * 
   * Project 9
   * Collin Ward – COMP-1210 - 001
   * 11/3/22
   */ 

public class FlavorComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**
   * compareTest1 method.
   */
   @Test public void compareTest1() { 
      BakedItem b1 = new Cookie("b1", "choc", 1, "sugar");
      BakedItem b2 = new Cookie("b2", "van", 1, "sugar");
      BakedItem b3 = new Cookie("b3", "red", 1, "sugar");
      FlavorComparator c1 = new FlavorComparator();
      Assert.assertEquals(-1, c1.compare(b1, b2)); 
   }
   /**
   * compareTest2 method.
   */
   @Test public void compareTest2() {
   
      BakedItem b1 = new Cookie("b1", "choc", 1, "sugar");
      BakedItem b2 = new Cookie("b2", "van", 1, "sugar");
      BakedItem b3 = new Cookie("b3", "choc", 1, "sugar");
      FlavorComparator c1 = new FlavorComparator();
      Assert.assertEquals(1, c1.compare(b2, b1));
   }
      /**
   * compareTest3 method.
   */
   @Test public void compareTest3() {
      BakedItem b1 = new Cookie("b1", "choc", 1, "sugar");
      BakedItem b2 = new Cookie("b2", "van", 1, "sugar");
      BakedItem b3 = new Cookie("b3", "choc", 1, "sugar");
      FlavorComparator c1 = new FlavorComparator();
      Assert.assertEquals(0, c1.compare(b3, b1));
   }
}


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
   /** 
   * A simple program to test manage baked sales.
   * 
   * Project 10
   * Collin Ward – COMP-1210 - 001
   * 11/11/22
   */ 

public class BakeryPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**
* mainTest method.
* @throws FileNotFoundException due to file
*/
   @Test public void mainTest() throws FileNotFoundException {
      BakedItemList.resetListCount();
      String[] args1 = {};
      BakeryPart2.main(args1);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }
    /**
* mainTest2 method.
* @throws FileNotFoundException because file is read in
*/
   @Test public void mainTest2() throws FileNotFoundException {
      BakeryPart2 app = new BakeryPart2(); 
      BakedItemList.resetListCount();
      String[] args2 = {"baked_item_data.csv"};
      BakeryPart2.main(args2);
      Assert.assertEquals(1, BakedItemList.getListCount());
   }
   
   
}

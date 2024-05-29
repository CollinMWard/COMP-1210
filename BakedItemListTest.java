import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
 /** 
   * A simple program to test baked sales.
   * 
   * Project 9
   * Collin Ward – COMP-1210 - 001
   * 11/3/22
   */ 


public class BakedItemListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**
* BakedItemListTest method.
*/
   @Test public void bakedItemListTest() {
      BakedItemList.resetListCount();
      BakedItemList t1 = new BakedItemList(); 
      Assert.assertEquals(1, BakedItemList.getListCount());
   }
   /**
   * getListNameTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void getListNameTest() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList(); 
      t1.readItemFile("baked_item_data.csv");
      Assert.assertEquals("Auburn's Best Bakery", t1.getListName());
   }
    /**
   * setListNameTest method.
   */
   @Test public void setListNameTest() {
      BakedItemList t1 = new BakedItemList(); 
      t1.setListName("Auburn's Best Bakery");
      Assert.assertEquals("Auburn's Best Bakery", t1.getListName());
   }
    /**
   * getItemListTest method.
   */
   @Test public void getItemListTest() {
      BakedItemList t1 = new BakedItemList();
      BakedItem[] bi = new BakedItem[2];
      Pie p1 = new Pie("pie1", "blue", 1, 0, "flour", "sugar");
      bi[0] = p1;
      t1.setItemList(bi);
      Assert.assertArrayEquals(t1.getItemList(), bi);
   }
    /**
   * setItemListTest method.
   */
   @Test public void setItemListTest() {
      BakedItemList t1 = new BakedItemList();
      BakedItem[] bi = new BakedItem[2];
      Pie p1 = new Pie("pie1", "blue", 1, 0, "flour", "sugar");
      bi[0] = p1;
      t1.setItemList(bi);
      Assert.assertArrayEquals(t1.getItemList(), bi);
   }
     /**
   * getItemCountTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void getItemCountTest() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      Assert.assertEquals(6, t1.getItemCount());
   }
   /**
   * setItemCountTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void setItemCountTest() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      t1.setItemCount(3);
      Assert.assertEquals(3, t1.getItemCount());
   }
   /**
   * getExcludedRecordsTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void getExcludedRecordsTest() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      Assert.assertTrue(t1.getExcludedRecords()[0].
            toString().contains("D,Chips Delight"));
   }
   /**
   * setExcludedRecordsTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void setExcludedRecordsTest() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      String[] er = new String[1];
      er[0] = "tea";
      t1.setExcludedRecords(er);
      Assert.assertTrue(t1.getExcludedRecords()[0].toString().contains("tea"));
   }
   /**
   * getExcludedCounttTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void getExcludedCountTest() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      Assert.assertEquals(2, t1.getExcludedCount());
   }
   /**
   * setExcludedCountTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void setExcludedCountTest() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      t1.setExcludedCount(3);
      Assert.assertEquals(3, t1.getExcludedCount());
   }
   /**
   * getListCountTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void getListCountTest() throws FileNotFoundException {
      BakedItemList.resetListCount();
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      Assert.assertEquals(1, t1.getListCount());
   }
   /**
   * resetListCountTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void resetListCountTest() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      BakedItemList.resetListCount();
      Assert.assertEquals(0, t1.getListCount());
   }
   /**
   * readItemFileTestC method.
   * @throws FileNotFoundException because of file
   */
   @Test public void readItemFileTestC() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      Assert.assertTrue(t1.generateReport().contains("Cookie"));
   }
   /**
   * readItemFileTestP method.
   * @throws FileNotFoundException because of file
   */
   @Test public void readItemFileTestP() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      Assert.assertTrue(t1.generateReport().contains("Pie"));
   }
    /**
   * readItemFileTestK method.
   * @throws FileNotFoundException because of file
   */
   @Test public void readItemFileTestK() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      Assert.assertTrue(t1.generateReport().contains("Cake"));
   } /**
   * readItemFileTestW method.
   * @throws FileNotFoundException because of file
   */
   
   @Test public void readItemFileTestW() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      Assert.assertTrue(t1.generateReport().contains("WeddingCake"));
   }
    /**
   * readItemFileTest0 method.
   * @throws FileNotFoundException because of file
   */
   @Test public void readItemFileTest0() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      Assert.assertTrue(t1.generateExcludedRecordsReport().
            contains("Excluded Records Report"));
   } /**
   * generateReportTest method.
   * @throws FileNotFoundException because of file
   */
   
   @Test public void generateReportTest() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      String wth = t1.generateReport().substring(0, 125);
      Assert.assertTrue(wth.contains("Cookie"));
   }
    /**
   * generateReportByClassTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void generateReportByClassTest() throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      String wth = t1.generateReportByClass().substring(0, 125);
      Assert.assertTrue(wth.contains("by Class"));
   }
    /**
   * generateReportByPriceTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void generateReportByPriceTest() throws FileNotFoundException { 
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      String wth = t1.generateReportByPrice().substring(0, 125);
      Assert.assertTrue(wth.contains("by Price"));
   }
    /**
   * generateReportByFlavorTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void generateReportByFlavorTest()
         throws FileNotFoundException { 
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      String wth = t1.generateReportByFlavor().substring(0, 125);
      Assert.assertTrue(wth.contains("by Flavor"));
   }
    /**
   * generateExcludedRecordsReportTest method.
   * @throws FileNotFoundException because of file
   */
   @Test public void generateExcludedRecordsReportTest()
         throws FileNotFoundException {
      BakedItemList t1 = new BakedItemList();
      t1.readItemFile("baked_item_data.csv");
      String wth = t1.generateExcludedRecordsReport().substring(0, 100);
      Assert.assertTrue(wth.contains("Excluded Records"));
   }
}

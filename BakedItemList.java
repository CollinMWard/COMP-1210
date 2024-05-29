import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.util.NoSuchElementException;
  /** 
   * A simple program to manage baked sales.
   * 
   * Project 9
   * Collin Ward – COMP-1210 - 001
   * 11/3/22
   */ 
public class BakedItemList {

   private String listName;
   private BakedItem[] itemList;
   private int itemCount;
   private String[] excludedRecords;
   private int excludedCount;
   private static int listCount = 0;
   
   /**
   * BakedItemList constructor.
   *
   */
   public BakedItemList() {
      listName = "";
      itemList = new BakedItem[100];
      itemCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
      listCount++;
   
   }
    /**
   * getListName method.
   * @return listName is name
   */
   public String getListName() {
      return listName;
   }
    /**
   * setListName method.
   * @param nameIn is name
   */
   public void setListName(String nameIn) {
      listName = nameIn;
   }
    /**
   * getItemList method.
   * @return itemList is list array
   */
   public BakedItem[] getItemList() {
      return itemList;
   }
    /**
   * setItemLust method.
   * @param itemListIn is list array in
   */
   public void setItemList(BakedItem[] itemListIn) {
      itemList = itemListIn;
   }
    /**
   * getItemCount method.
   * @return itemCount is count
   */
   public int getItemCount() {
      return itemCount;
   }
    /**
   * setItemCount method.
   * @param itemCountIn is count in
   */
   public void setItemCount(int itemCountIn) {
      itemCount = itemCountIn;
   }
    /**
   * getExcludedRecords method.
   * @return excludedRecords is excluded list array
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
    /**
   * setExcludedRecords method.
   * @param excludedRecordsIn is excluded array list in
   */
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
    /**
   * getExcludedCount method.
   * @return excludedCount is count
   */
   public int getExcludedCount() {
      return excludedCount;
   }
    /**
   * setExcludedCount method.
   * @param excludedCountIn is count in
   */
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
    /**
   * getListCount method.
   * @return listCount is count
   */
   public static int getListCount() {
      return listCount;
   }
    /**
   * resetLustCount method.
   */
   public static void resetListCount() {
      listCount = 0;
   }
    /**
   * readItemFile method.
   * @param fileNameIn is file name
   * @throws FileNotFoundException because file input
   */
   public void readItemFile(String fileNameIn) throws FileNotFoundException
   {
      Scanner fileScan = new Scanner(new File(fileNameIn));
      fileScan.useDelimiter(",");
      listName = fileScan.nextLine().trim();
      int lineNumber = 0;
   
      while (fileScan.hasNext()) {
      
         String line = fileScan.nextLine().trim();
         Scanner lineScan = new Scanner(line);
         lineScan.useDelimiter(",");
         char type = line.charAt(0);
         int ingredientsCount = 0;
         lineScan.next();
         try {
            switch (type) {
               case 'C':
                  while (lineScan.hasNext()) {
                     String name = lineScan.next().trim();
                     String flavor = lineScan.next().trim();
                     int quantity = Integer.parseInt(lineScan.next().trim());
                     String[] ingredientsIn = new String[50];
                     int counter = 0;
                  
                     for (int i = 0; lineScan.hasNext(); i++) {
                        ingredientsIn[i] = lineScan.next().trim();
                        ingredientsCount++;
                     }
                     String[] copy = Arrays.copyOf(
                        ingredientsIn, ingredientsCount);
                     itemList[itemCount] = new Cookie(
                        name, flavor, quantity, copy);
                     itemCount++;
                  }
                  break;
               case 'P':
                  while (lineScan.hasNext()) {
                     String name = lineScan.next().trim();
                     String flavor = lineScan.next().trim();
                     int quantity = Integer.parseInt(lineScan.next().trim());
                     double crustCost =
                        Double.parseDouble(lineScan.next().trim());
                     String[] ingredientsIn = new String[50];
                     for (int i = 0; lineScan.hasNext(); i++) {
                        ingredientsIn[i] = lineScan.next().trim();
                        ingredientsCount++;
                     }
                     String[] ingredientsCopy = Arrays.copyOf(
                        ingredientsIn, ingredientsCount);
                     itemList[itemCount] = new Pie(
                        name, flavor, quantity, crustCost, ingredientsCopy);
                     itemCount++;
                  }
                  break;
               case 'K':
                  while (lineScan.hasNext()) {
                     String name = lineScan.next().trim();
                     String flavor = lineScan.next().trim();
                     int quantity = Integer.parseInt(lineScan.next().trim());
                     int layer = Integer.parseInt(lineScan.next().trim());
                     String[] ingredientsIn = new String[50];
                     for (int i = 0; lineScan.hasNext(); i++) {
                        ingredientsIn[i] = lineScan.next().trim();
                        ingredientsCount++;
                     }
                     String[] ingredientsCopy = Arrays.copyOf(
                        ingredientsIn, ingredientsCount);
                     itemList[itemCount] = new Cake(
                        name, flavor, quantity, layer, ingredientsCopy);
                     itemCount++;
                  }
                  break;
               case 'W':
                  while (lineScan.hasNext()) {
                     String name = lineScan.next().trim();
                     String flavor = lineScan.next().trim();
                     int quantity = Integer.parseInt(lineScan.next().trim());
                     int layer = Integer.parseInt(lineScan.next().trim());
                     int tiers = Integer.parseInt(lineScan.next().trim());
                     String[] ingredientsIn = new String[50];
                     for (int i = 0; lineScan.hasNext(); i++) {
                        ingredientsIn[i] = lineScan.next().trim();
                        ingredientsCount++;
                     }
                     String[] ingredientsCopy = Arrays.copyOf(
                        ingredientsIn, ingredientsCount);
                     itemList[itemCount] = new WeddingCake(
                        name, flavor, quantity, layer, tiers, ingredientsCopy);
                     itemCount++;
                  }
                  break;
               default:
                  throw new InvalidCategoryException(line);
            
            }
         
         }
         catch (NumberFormatException e) {
            excludedRecords[excludedCount] =
                  "*** " + e + " in:\n" + line.trim();
            excludedCount++;
         }
         catch (NoSuchElementException e) {
            excludedRecords[excludedCount] =
                  "*** " + e + " in:\n" + line.trim();
            excludedCount++;
         }
         catch (InvalidCategoryException e) {
            excludedRecords[excludedCount] =
                     "*** " + e + " in:\n" + line.trim();
            excludedCount++;  
         }
         
      }
      
   
   }
    /**
   * generateReport method.
   * @return output is formated output
   */
   public String generateReport() {
      String output = "";
      output += "\n---------------------------------------\n";
      output += "Report for " + listName.trim();
      output += "\n---------------------------------------\n";
      for (int i = 0; i < itemCount; i++) {
         output += "\n" + itemList[i].toString().trim() + "\n";
      }
      output += "\n";
      return output;
   }
    /**
   * generateReportByClass.
   * @return output formated by class
   */
   public String generateReportByClass() {
      String output = "";
      output += "\n---------------------------------------\n";
      output += "Report for " + listName.trim() + " (by Class)";
      output += "\n---------------------------------------\n";
      BakedItem[] copyOfItemList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(copyOfItemList);
      for (int i = 0; i < itemCount; i++) {
         output += "\n" + copyOfItemList[i].toString().trim() + "\n";
      }
      output += "\n";
      return output;
   }
    /**
   * generateReportByPrice method.
   * @return output formated by price
   */
   public String generateReportByPrice() {
      String output = "";
      output += "\n---------------------------------------\n";
      output += "Report for " + listName.trim() + " (by Price)";
      output += "\n---------------------------------------\n";
      PriceComparator price = new PriceComparator();
      BakedItem[] copyOfItemList2 = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(copyOfItemList2, price);
      for (int i = 0; i < itemCount; i++) {
         output += "\n" + copyOfItemList2[i].toString().trim() + "\n";
      }
      output += "\n";
      return output;
   }
    /**
   * generateReportByFlavor method.
   * @return output formated by flavor
   */
   public String generateReportByFlavor() {
      String output = "";
      output += "\n---------------------------------------\n";
      output += "Report for " + listName.trim() + " (by Flavor)";
      output += "\n---------------------------------------\n";
      FlavorComparator flavor = new FlavorComparator();
      BakedItem[] copyOfItemList3 = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(copyOfItemList3, flavor);
      for (int i = 0; i < itemCount; i++) {
         output += "\n" + copyOfItemList3[i].toString().trim() + "\n";
      }
      output += "\n";
      return output;
   }
    /**
   * generateExcludedRecordsReport method.
   * @return output is formated excluded records
   */
   public String generateExcludedRecordsReport() {
      String output = "";
      output += "\n---------------------------------------\n";
      output += "Excluded Records Report";
      output += "\n---------------------------------------\n\n";
      for (int i = 0; i < excludedCount; i++) {
         output += excludedRecords[i].toString().trim() + "\n";
      }
      return output;
   }
}

import java.io.FileNotFoundException;
      /** 
   * A simple program to run baked sales.
   * 
   * Project 10
   * Collin Ward – COMP-1210 - 001
   * 11/11/22
   */ 

public class BakeryPart2 {
   /**
* main method.
* @throws FileNotFoundException is thrown
* @param args is used for file name input
*/

   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.print("\nFile name expected as command line argument.\nProgram ending.");
      } else {
         BakedItemList obj = new BakedItemList();
         obj.readItemFile(args[0]);
         System.out.print(obj.generateReport());
         System.out.print(obj.generateReportByClass());
         System.out.print(obj.generateReportByPrice());
         System.out.print(obj.generateReportByFlavor());
         System.out.print(obj.generateExcludedRecordsReport());
      }
   }
}
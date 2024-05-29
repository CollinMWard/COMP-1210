import java.io.FileNotFoundException;
      /** 
   * A simple program to run baked sales.
   * 
   * Project 11
   * Collin Ward – COMP-1210 - 001
   * 11/16/22
   */ 

public class BakeryPart3 {
   /**
* main method.
* 
* @param args is used for file name input
*/

   public static void main(String[] args) {
      try {
         if (args.length == 0) {
            System.out.print("File name expected as"
               + " command line argument.\nProgram ending.");
         } else {
            BakedItemList obj = new BakedItemList();
            obj.readItemFile(args[0]);
            System.out.print(obj.generateReport());
            System.out.print(obj.generateReportByClass());
            System.out.print(obj.generateReportByPrice());
            System.out.print(obj.generateReportByFlavor());
            System.out.print(obj.generateExcludedRecordsReport());
            FileOutputStream test = openFileOutput("Testy", Context.MODE_PRIVATE);
         }
      }
      
      catch (FileNotFoundException e) {
         System.out.print("Attempted to read file: " 
            + args[0] + " (No such file or directory)\nProgram ending.");
      }
   }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Demonstrates the NumberOperations class.
 */
public class HexagonalPrismListApp {

   /**
    * Reads a set of positive numbers from the user until the user enters 0.
	 * Prints odds under and powers of 2 under for each number.
	 *
    * @param args - Standard commandline arguments
    * @throws FileNotFoundException due to file scanner addition
    */
   public static void main(String[] args) throws FileNotFoundException {
     
      ArrayList<HexagonalPrism> hListIn = new ArrayList<HexagonalPrism>();
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = userInput.nextLine();
      Scanner fileScan = new Scanner(new File(fileName));
      String listNameIn = fileScan.nextLine();
      while (fileScan.hasNext()) {
         String labelIn = fileScan.nextLine();
         double edgeIn = Double.valueOf(fileScan.nextLine());
         double heightIn = Double.valueOf(fileScan.nextLine());
         hListIn.add(new HexagonalPrism(labelIn, edgeIn, heightIn));
      }
         
      HexagonalPrismList test = new HexagonalPrismList(listNameIn, hListIn);
      System.out.print("\n" + test);
      System.out.print("\n" + test.summaryInfo());
   }
}

import java.util.Scanner;
/** 
  * Provides the result of a specified formula after 
  * reading input values for x, y, and z.
  * Project 2
  * Collin Ward – COMP-1210 - 001
  * 9/1/22
  */ 
public class MySolver {
/**
* Prompts user for an x, y, and z input and then solves.
* 
* @param args Command line arguments – not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("result = (8.5x + 6.1) (10y + 7.9) / z ");
      System.out.print("\tEnter x: ");
      double x = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      double y = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      double z = userInput.nextDouble();
      double result = (8.5 * x + 6.1) * (10 * y + 7.9) / z;
      if (z == 0) {
         System.out.println("result is undefined ");
      }
      else { 
         System.out.println("result = " + result);
      }
   }
}
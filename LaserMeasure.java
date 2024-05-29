import java.util.Scanner;
/** 
  * A program that accepts a raw distance measurement in inches (of type int) 
  * and then displays the distance as a combination of miles, yards, feet, 
  * and inches for both short and long distances.
  *
  * Project 2
  * Collin Ward – COMP-1210 - 001
  * 9/1/22
  */ 
public class LaserMeasure {
/**
* Prompts user for a raw distance measurement in inches.
* 
* @param args Command line arguments – not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter the raw distance measurement in inches: ");
      int measurment = userInput.nextInt();
      if (measurment > 0) { 
         System.out.println();
         int miles = measurment / 63360;
         int yards = measurment % 63360 / 36;
         int feet = measurment % 63360 % 36 / 12;
         int inches = measurment % 63360 % 36 % 12;
         System.out.println("Measurement by combined miles, yards, " 
            + "feet, inches: ");
         System.out.println("\tmiles: " + miles);
         System.out.println("\tyards: " + yards);
         System.out.println("\tfeet: " + feet);
         System.out.println("\tinches: " + inches);
         System.out.println();
         System.out.println(measurment + " in = " + miles + " mi, " + yards 
            + " yd, " + feet + " ft, " + inches + " in");
      }
      else {
         System.out.println("Measurement must be non-negative!");
      }
   }
}
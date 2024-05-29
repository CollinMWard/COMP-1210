   /** 
   * A simple program to run baked sales.
   * 
   * Project 11
   * Collin Ward – COMP-1210 - 001
   * 11/16/22
   */ 

public class InvalidCategoryException extends Exception {
/**
* InvalidCaregoryException constructor.
* @param category is string input of line
*/
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category.charAt(0) + "\"");
   
   // something
   }
}
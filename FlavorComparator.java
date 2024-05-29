import java.util.Comparator;
      /** 
   * A simple program to manage baked sales.
   * 
   * Project 10
   * Collin Ward – COMP-1210 - 001
   * 11/11/22
   */ 
   
public class FlavorComparator implements Comparator<BakedItem> {

/**
* compare method sorts by flavor.
* @param p1 is BakedItem 1
* @param p2 is BakedItem 2
* @return is -1, 0, 1 depending on compare result
*/
  
   public int compare(BakedItem p1, BakedItem p2) {
      if (p1.getFlavor().compareTo(p2.getFlavor()) < 0) {
         return -1;
      }
      else if (p1.getFlavor().compareTo(p2.getFlavor()) > 0) {
         return 1;
      }
      else {
         return 0;
      }
   }
}
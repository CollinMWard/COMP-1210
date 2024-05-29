import java.text.DecimalFormat;
import java.lang.*;

   /** 
   *  A simple program to solve for lateral surface area,
   *  base area, surface area, and volume of a hexagon.
   * 
   * Project 4
   * Collin Ward – COMP-1210 - 001
   * 9/16/22
   */ 
public class HexagonalPrism
{
   private String label = "";
   private double edge = 0;
   private double height = 0;
     /** 
   * constructor for program that solves for lateral 
   * surface area, base area, surface area, and volume of hexagon.
   *
   * @param labelIn label in
   * @param edgeIn edge in
   * @param heightIn height in
   * 
   */ 
   public HexagonalPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   
   }
   /**
   *
   * getLabel method.
   *
   * @return label is string label
   */
   public String getLabel() {
      return label;
   }
  /**
  *
  * sets LabelisSet to true if labelIn is not void.
  * @return a boolean true if is set
  * @param labelIn label in
  */
   public boolean setLabel(String labelIn) {
      boolean labelIsSet = false;
      if (labelIn != null) { 
         label = labelIn.trim();
         labelIsSet = true;
         return labelIsSet;
      } else { 
         return labelIsSet;
      }
   }
    /**
   *
   * getEdge method.
   * @return double edge
   */
   public double getEdge() {
      return edge;
   }
    /**
   *
   * setEdge method.
   * @return isSet is true of Edgein is greater than 0
   * edge = edgeIn if greater than 0
   * @param edgeIn edge in
   */
   public boolean setEdge(double edgeIn) {
      boolean isSet = false;
      if (edgeIn > 0) {
         edge = edgeIn;
         isSet = true;
         return isSet;
      } else { 
         return isSet;
      }
   }
    /**
   *
   * getHeight method.
   * @return height 
   * 
   */
   public double getHeight() {
      return height;
   }
    /**
   *
   * setHeight method.
   * height = heightin of heightin > 0
   * @return true of heightin > 0
   * @param heightIn height in
   */
   public boolean setHeight(double heightIn) {
      boolean heightIsSet = false;
      if (heightIn > 0) { 
         height = heightIn;
         heightIsSet = true;
         return heightIsSet;
      } else {
         return heightIsSet;
      }
   }
    /**
   *
   * surfaceArea method.
   * solves for surfaceArea
   * @return surfacearea
   */
   public double surfaceArea() {
      double surfaceArea = 6 * (edge * height) + 3 * Math.sqrt(3)
          * Math.pow(edge, 2);
      return surfaceArea;
   }
   /**
   *
   * LateralSurfaceArea method.
   * solves for LateralSurfaceArea
   * @return lateral surface area
   */
   public double lateralSurfaceArea() {
      double lateralSurfaceArea = 6 * edge * height;
      return lateralSurfaceArea;
   }
   /**
   *
   * baseArea method.
   * solves for baseArea
   * @return base area
   */
   public double baseArea() {
      double baseArea = 3 * Math.sqrt(3) * (Math.pow(edge, 2) / 2);
      return baseArea;
   }
   /**
   *
   * volume method.
   * solves for volume
   * @return volume 
   */
   public double volume() {
      double volume = ((3 * Math.sqrt(3)) / 2) * Math.pow(edge, 2) * height;
      return volume;
   }
   /**
   *
   * toString method.
   * formates output
   * @return output
   */
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      String output = "HexagonalPrism " + "\"" + label + "\""
         + " has 8 faces, 18 edges, and 12 vertices." + "\n";
      output += "\tedge = " + decimalFormat.format(edge) + " units" + "\n";
      output += "\theight = " + decimalFormat.format(height) + " units" + "\n";
      output += "\tlateral surface area = " 
         + decimalFormat.format(lateralSurfaceArea())
          + " square units" + "\n";
      output += "\tbase area = " + decimalFormat.format(baseArea())
          + " square units" + "\n";
      output += "\tsurface area = " + decimalFormat.format(surfaceArea())
          + " square units" + "\n";
      output += "\tvolume = " + decimalFormat.format(volume())
         + " cubic units" + "\n";
      return output;
   }
}
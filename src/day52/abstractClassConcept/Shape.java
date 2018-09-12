package day52.abstractClassConcept;
public abstract class Shape {
   // Private member variable
   private String color;
   
   // Constructor
   public Shape (String color) {
      this.color = color;
   }
   
   @Override
   public String toString() {
      return "Shape[color=" + color + "]";
   }
   
   // All shapes must have a method called getArea().
   /*public double getArea() {
      // We have a problem here!
      // We need to return some value to compile the program.
      System.err.println("Shape unknown! Cannot compute area!");
      return 0;
   }*/
   
   public abstract double getArea();
}
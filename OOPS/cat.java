package OOPS;

public class cat {
    String name;
    String colour;
    String breed;

   public cat() {//default constructor
    this.name = "TOM";
    this.colour = "BLUE";
    this.breed  = "unknown";
   }
   //custom constructor
   public cat(
    String name,
    String colour,
    String breed

   ) {
    this.name =name;
    this.colour = colour;
    this.breed = breed;
   }
   void Cat() {
    System.out.println(name +" bhag ja");
   }
}

package Vertabrates;

public class Reptile extends Animal {
    public boolean haveTails = true;
    public boolean haveScales = true;

   public Reptile(String name, boolean isEndangered, int topSpeed){
       super(name, isEndangered, topSpeed);
   }
}

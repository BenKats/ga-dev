package Vertabrates;

public class Main {
    public static void main(String[] args) {
        Bovine cow = new Bovine("Bessy", false, 10);
        cow.haveMilk = false;
        System.out.println(cow.haveMilk);
        System.out.println(cow.haveHair);
    }
}

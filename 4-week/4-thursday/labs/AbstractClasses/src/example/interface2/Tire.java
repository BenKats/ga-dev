package example.interface2;

public class Tire extends MyClass implements Rollable, Moveable {
    int width;

    public boolean isMoveable() {
        return true;
    }

    public boolean isRollable() {
        return true;
    }

    public static void main(String[] args) {
        Tire goodYear = new Tire();
        goodYear.aveSpeed = 30;
        System.out.println(goodYear.aveSpeed);
        System.out.println(goodYear.isMoveable());
        System.out.println(goodYear.isRollable());
    }



}

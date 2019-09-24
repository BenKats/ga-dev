public class Animal {
    //Put instance variables here
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;

    //Put constructor here
    public Animal(){}
    public Animal(String name, boolean isEndangered, int numLegs, int topSpeed){
        this.name = name;
        this.isEndangered = isEndangered;
        this.numLegs = numLegs;
        this. topSpeed = topSpeed;
    }
    //Put getters and setters here
    public String getName() {
        return name;
    }

    public boolean getEndangered() {
        return isEndangered;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }

    @Override
    public String toString(){
        return "It is " + this.isEndangered  + " that the " + this.name + " is endangered. They have " + this.numLegs + " legs " + "and a top speed of " + this.topSpeed + " mph.";
    }
    public static void main(String[] args) {
        System.out.println("Hello, world");
        //Instantiate new Animal
//        Animal animal = new Animal();
        Animal animal = new Animal("Cheetah", false, 4, 75 );

        String name;
        int topSpeed;

        //get name and speed values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(animal);

        //Set new name, speed, and endangered properties values using setters
        animal.setName("Black Rhinoceros");
        animal.setEndangered(true);
        animal.setNumLegs(4);
        animal.setTopSpeed(34);
        //get new values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(animal.toString());
        System.out.println(animal.numLegs);
    }
}
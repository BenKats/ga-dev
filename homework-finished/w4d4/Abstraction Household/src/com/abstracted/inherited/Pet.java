package com.abstracted.inherited;

abstract class Pet implements Interactable {
    String name;

    public Pet(String name){
        this.name = name;
    }

}

class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void feedPet() {
        System.out.println("You feed your dog a bone.");
    }

    @Override
    public void groomPet() {
        System.out.println("You brush your dogs fur.");

    }

    @Override
    public void playPet() {
        System.out.println("You play fetch.");

    }
}
class Cat  extends Pet {

    public Cat (String name) {
        super(name);
    }

    @Override
    public void feedPet() {
        System.out.println("You feed your cat a fish.");
    }

    @Override
    public void groomPet() {
        System.out.println("You brush your cat's fur.");

    }

    @Override
    public void playPet() {
        System.out.println("You mesmerize your cat with a laser pointer.");

    }
}

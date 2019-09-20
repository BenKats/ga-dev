package com.abstracted.inherited;

public class Main {
    public static void main(String[] args) {
//        Dog fido = new Dog("fido");
//        fido.playPet();

        Mansion ben = new Mansion(573621, 100000, 50, new Dog("Spike"));
        Bungalow neb = new Bungalow(-4000, 25000, 50, new Cat("Mittens"));
        ben.earnMoney();
        ben.pet.feedPet();
        ben.pet.playPet();
        ben.pet.groomPet();

        neb.earnMoney();
        neb.pet.feedPet();
        neb.pet.playPet();
        neb.pet.groomPet();


    }
}

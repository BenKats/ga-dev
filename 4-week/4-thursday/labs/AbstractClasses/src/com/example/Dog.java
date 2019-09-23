package com.example;

public class Dog extends Animal {
    public void sound(){
        System.out.println("Making a sound.");

    }
    public void eat(){
        System.out.println("I EAT");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

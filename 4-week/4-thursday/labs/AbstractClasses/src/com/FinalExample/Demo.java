package com.FinalExample;

public class Demo {
    public static void main(String[] args) {
        Person p = new Person("Stacy");
        Person m = new Mother("Stacy's Mom");
        Wife w = new Wife("Jenna");

        System.out.println("P is a " + p.name);
        System.out.println("M is a " + m.name);
        System.out.println("W is a " + w.name);

        w.callHusband();
    }
}

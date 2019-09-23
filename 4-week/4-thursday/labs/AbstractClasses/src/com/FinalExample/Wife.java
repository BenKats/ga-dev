package com.FinalExample;

public class Wife extends Person {
    Wife(String n){
        super(n);
        name = "Wife " + n;
    }

    void callHusband(){
        System.out.println("Calling Husband ..");
    }
}

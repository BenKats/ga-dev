package com.rps;

import java.util.Arrays;
import java.util.Scanner;

public class Human extends Player {


    public Human(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String play() {
        //potential error here
        String[] options = new String[]{"rock", "paper", "scissors"};
        Scanner input = new Scanner(System.in);
        System.out.println(getName() + " Enter selection: ");
        String inputChoice = input.next().toLowerCase();
        if (Arrays.asList(options).contains(inputChoice)){
            setChoice(inputChoice);
        }else{
            System.out.println("Incorrect input, choose one from: rock, paper or scissors");
            play();
        }
       return getChoice();
    }
}

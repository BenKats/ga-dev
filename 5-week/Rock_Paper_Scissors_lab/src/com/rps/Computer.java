package com.rps;

import java.util.Random;

public class Computer extends Player {
    public Computer(String name) {
        super(name);
    }

    @Override
   public String play() {
        String[] options = new String[]{"rock", "paper", "scissors"};
        Random select = new Random();
        return options[select.nextInt(3)];
    }
}

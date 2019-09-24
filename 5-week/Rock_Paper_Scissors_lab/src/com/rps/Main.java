package com.rps;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Human("Player 1");
        Player player2 = new Human("Player 2");
        Player comp = new Computer("NPC");
        ArrayList<String> history = new ArrayList<>();

//        System.out.println(human.play());
//        System.out.println( comp.play());

        printPrompt();
        int gameMode = selectGameMode();
        boolean keepPlaying = true;
        while(keepPlaying){
            if (gameMode == 1){
                pvc(player1, player2, history);
            }else{
                pvc(player1, comp, history);
                System.out.println("Player has won " + player1.wins + " times");
                System.out.println("Computer has won " + comp.wins + " times");

            }
            keepPlaying = mainMenu(history);


        }
        System.out.println("==========================");
        System.out.println("|   Thanks for Playing   |");
        System.out.println("==========================");

    }

    private static boolean mainMenu(ArrayList<String> history) {
        System.out.println("==========================");
        System.out.println("|        MAIN MENU       |");
        System.out.println("==========================");

        System.out.println("To keep playing press:\n Y for yes\n N for no");
        System.out.println("To see history type \"history\"");
        Scanner input = new Scanner(System.in);
        String ans = input.next().toLowerCase();
        if(ans.equals("y")){
            return true;
        }
        else if (ans.equals("n")){
            return false;
        }else if (ans.equals("history")){
            history.forEach(System.out::println);
            mainMenu(history);
        }else{
            System.out.println("Invalid Input");
            mainMenu(history);
        }
        return true;
    }


    private static void printPrompt() {
        System.out.println("Rock Paper Scissors");
        System.out.println("==========================");
        System.out.println("|  Let The Games Begin!  |");
        System.out.println("==========================");
    }


    private static int selectGameMode() {
        System.out.println("Please Select game mode\n1:Player vs Player\n2:Player vs Computer");
        Scanner input = new Scanner(System.in);
        int gameMode = input.nextInt();
        if (gameMode == 1){
            System.out.println("Game Mode: Player vs Player");

        }else if (gameMode == 2){
            System.out.println("Game Mode: Player vs Computer");
        }else{
            System.out.println("Input not recognized, please retry");
            selectGameMode();
        }
        System.out.println("==========================");
        return gameMode;
    }

    private static void pvc(Player player, Player otherPlayerOrComp, ArrayList<String> history) {
        String pChoice = player.play();
        String cChoice = otherPlayerOrComp.play();
        System.out.println(pChoice +" "+ cChoice);
        String winner = determineWinner(pChoice, cChoice);
        if (winner.equals("choice1")){
            System.out.println(player.name + " Wins");
            history.add(System.currentTimeMillis() + " Player1 Wins");
            player.wins++;
            otherPlayerOrComp.losses++;
        }else if (winner.equals("choice2")){
            System.out.println(otherPlayerOrComp.name + " Wins");
            history.add(System.currentTimeMillis() + otherPlayerOrComp.getName());
            otherPlayerOrComp.wins++;
            player.losses++;
        } else{
            System.out.println("Draw");
            history.add(System.currentTimeMillis() + " Draw");
        }


    }
//    private static void pvp(Human player1, Human player2, ArrayList<String> history) {
//        String p1Choice = player1.play();
//        String p2Choice = player2.play();
//        System.out.println(p1Choice +" "+ p2Choice);
//        String winner = determineWinner(p1Choice, p2Choice);
//        if (winner.equals("choice1")){
//            history.add(System.currentTimeMillis() + " Player1 Wins");
//            System.out.println(player1.name + " Wins");
//            player1.wins++;
//            player2.losses++;
//        }else if(winner.equals("choice2")){
//            System.out.println(player2.name + " Wins");
//            history.add(System.currentTimeMillis() + " Player2 Wins");
//            player2.wins++;
//            player1.losses++;
//        }
//        else{
//            System.out.println("Draw");
//            history.add(System.currentTimeMillis() + " Draw");
//        }
//    }

    private static String determineWinner(String choice1, String choice2) {
        if (choice1.equals(choice2)){
            return "draw";
        }
        else if (choice1.equals("rock") && choice2.equals("scissors")){
                return "choice1";
            }
        else if (choice1.equals("paper") && choice2.equals("rock")){
            return "choice1";
        }
        else if (choice1.equals("scissors") && choice2.equals("paper")){
            return "choice1";
        }
        else{
            return "choice2";
        }
    }
}

package com.GoFish;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner myScanner = new Scanner(System.in);
        int numOfPlayers = 0;

        ArrayList<Person> gamePlayers= new ArrayList<Person>();

        System.out.println("How many players? ");
        numOfPlayers = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println(numOfPlayers);

        for(int i = 0; i < numOfPlayers; i++){
            if( i < 1){
                //System.out.print("Create Dealer");
                Dealer myDealer = new Dealer();
                myDealer = createDealer(myScanner);
                gamePlayers.add(myDealer);
                System.out.println(myDealer.getName());
                System.out.println(gamePlayers.get(0).getName());
            }
            else{
                System.out.println("Create Players");
                Player myPlayer = new Player();
                myPlayer = createPlayer(myScanner);
                gamePlayers.add(myPlayer);
                System.out.println(myPlayer.getName());
                System.out.println(gamePlayers.get(i).getName());
            }
        }

    }

    public static void gameloop(){
        //ASK FOR PLAYERS


    }

    public static Dealer createDealer(Scanner theScanner){
        Dealer myDealer = new Dealer();
        String name;
        //add dealer name
        System.out.println("What is the Dealer's name?");
        name = theScanner.nextLine();
        myDealer.setName(name);

        return myDealer;
    }

    public static Player createPlayer(Scanner theScanner){
        Player myPlayer = new Player();
        String name;
        //add player name
        System.out.println("What is the Player's name?");
        name = theScanner.nextLine();
        myPlayer.setName(name);

        return myPlayer;
    }

    //public static void createPlayers

}

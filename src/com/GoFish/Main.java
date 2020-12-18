package com.GoFish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner myScanner = new Scanner(System.in);
        int numOfPlayers = 0;
        DeckOfCards myDeck = new DeckOfCards();
        myDeck.shuffleDeck();

        ArrayList<Person> gamePlayers= new ArrayList<Person>();

        numOfPlayers = gameInit(myScanner);

        Collections.copy(gamePlayers,registerPlayers(numOfPlayers,myScanner));

    }

    public static int gameInit( Scanner input){
        //ASK FOR PLAYERS
        int newPlayers;
        System.out.println("How many players? ");
        newPlayers = input.nextInt();
        input.nextLine();

        System.out.println(newPlayers);

        return newPlayers;
    }

    public static ArrayList registerPlayers(int players,Scanner input){
        ArrayList<Person> gPlayers = new ArrayList<Person>();
        for(int i = 0; i < players; i++){
            if( i < 1){
                //System.out.print("Create Dealer");
                Dealer myDealer = new Dealer();
                myDealer = createDealer(input);
                gPlayers.add(myDealer);
                System.out.println(myDealer.getName());
                System.out.println(gPlayers.get(0).getName());
            }
            else{
                System.out.println("Create Players");
                Player myPlayer = new Player();
                myPlayer = createPlayer(input);
                gPlayers.add(myPlayer);
                System.out.println(myPlayer.getName());
                System.out.println(gPlayers.get(i).getName());
            }
        }

        return gPlayers;
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

    public static void dealCards(ArrayList<Person> _players, DeckOfCards _deck, int amountOfPlayers){

        int numberOfCardToDeal = 0;
        if(amountOfPlayers<4){
            //
            numberOfCardToDeal = 7;
        }else{
            //
            numberOfCardToDeal = 5;
        }

        for(int i = 0; i < numberOfCardToDeal; i++){
            _players.forEach(player -> player.AddCardToHand(_deck.pullRandomRemoveFromDeck(), 0));
        }

    }
}

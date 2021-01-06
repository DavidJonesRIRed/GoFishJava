package com.GoFish;

import java.util.ArrayList;
import java.util.Scanner;

public class GoFishGame {
    //variables
    private Scanner input = new Scanner(System.in);
    private int numberOfPlayers;
    private DeckOfCards myDeck = new DeckOfCards();
    private ArrayList<Person> gamePlayers= new ArrayList<Person>();

    //methods
    public GoFishGame(){

    }

    public void gameInit(){

        this.myDeck.shuffleDeck();
        //ASK FOR PLAYERS

        System.out.println("How many players? ");
        this.numberOfPlayers = this.input.nextInt();
        this.input.nextLine();

        System.out.println(numberOfPlayers);

        registerPlayers();
    }

    public Dealer createDealer(){
        Dealer myDealer = new Dealer();
        String name;
        //add dealer name
        System.out.println("What is the Dealer's name?");
        name = this.input.nextLine();
        myDealer.setName(name);

        return myDealer;
    }

    public Player createPlayer(){
        Player myPlayer = new Player();
        String name;
        //add player name
        System.out.println("What is the Player's name?");
        name = this.input.nextLine();
        myPlayer.setName(name);

        return myPlayer;
    }

    public void registerPlayers(){
        ArrayList<Person> gPlayers = new ArrayList<Person>();
        for(int i = 0; i < numberOfPlayers; i++){
            if( i < 1){
                //System.out.print("Create Dealer");
                Dealer myDealer = new Dealer();
                myDealer = createDealer();
                gPlayers.add(myDealer);
                //System.out.println(myDealer.getName());
                //System.out.println(gPlayers.get(0).getName());
            }
            else{
                System.out.println("Create Players");
                Player myPlayer = new Player();
                myPlayer = createPlayer();
                gPlayers.add(myPlayer);
                //System.out.println(myPlayer.getName());
                //System.out.println(gPlayers.get(i).getName());
            }
        }

    }

    public void dealCards(){

        int numberOfCardToDeal = 0;

        if(this.numberOfPlayers<4){
            //
            numberOfCardToDeal = 7;
        }else{
            //
            numberOfCardToDeal = 5;
        }

        for(int i = 0; i < numberOfCardToDeal; i++){
            this.gamePlayers.forEach(player -> player.AddCardToHand(this.myDeck.pullRandomRemoveFromDeck(), 0));
        }

    }


}

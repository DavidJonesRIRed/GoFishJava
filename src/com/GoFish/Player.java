package com.GoFish;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Player implements Person{
    //variables
    private String playerName;
    private int playerScore;
    private Hand playerHand;
    private ArrayList<Hand> playerHands;
    private boolean playerTurn;
    private float playerMoney;
    private float playerBet;
    private DecimalFormat df = new DecimalFormat("#.##");

    public Player() {
        this.playerHands = new ArrayList<Hand>();
        this.playerMoney = 0.00f;
        this.playerScore = 0;
        this.playerBet = 0.00f;
    }

    //methods
    @Override
    public void setName(String newName) {
        this.playerName = newName;
    }

    @Override
    public String getName() {
        return playerName;
    }

    @Override
    public void setTurn(Boolean isTurn){
        this.playerTurn = isTurn;
    }

    @Override
    public boolean getTurn(){
        return this.playerTurn;
    }

    @Override
    public void getDetails(){
        System.out.println("Player's current details are name: " + this.playerName + " amount of money: "
                + df.format(this.playerMoney) + " amount of hands: " + this.playerHands.size() + " player's score: "
                + this.playerScore);
    }

    @Override
    public void addHand(Hand newHand) {
        this.playerHand = newHand;
        this.playerHands.add(newHand);
    }

    @Override
    public void AddCardToHand(Card newCard, int whichHand) {
        this.playerHand = new Hand();
        this.playerHand = playerHands.get(whichHand);
        this.playerHand.handAddCard(newCard);
        this.playerHands.set(whichHand, playerHand);
    }

    @Override
    public void addSecondHand(Hand newHand) {
        this.playerHands.add(newHand);
    }

    @Override
    public Hand getPersonHand(int whichHand) {
        //place coed for getting
        return playerHand;
    }
}

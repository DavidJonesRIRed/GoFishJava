package com.GoFish;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Dealer implements Person{
    //variables
    private boolean shouldDealerHit;
    private String dealerName;
    private int dealerScore;
    private Hand dealerHand;
    private ArrayList<Hand> dealerHands;
    private boolean dealerTurn;
    private float dealerMoney;
    private float dealerBet;
    private DecimalFormat df = new DecimalFormat("#.##");

    //constructor
    public Dealer() {
        this.dealerHands = new ArrayList<Hand>();
        this.dealerMoney = 0.00f;
        this.dealerScore = 0;
        this.dealerBet = 0.00f;
    }


    //methods
    @Override
    public String getName() {
        return dealerName;
    }

    @Override
    public void setName(String newName) {
        this.dealerName = newName;
    }

    @Override
    public void setTurn(Boolean isTurn){
        this.dealerTurn = isTurn;
    }

    @Override
    public boolean getTurn(){
        return this.dealerTurn;
    }

    @Override
    public void getDetails(){
        System.out.println("Dealer's current details are name: " + this.dealerName + " amount of money: "
                + df.format(this.dealerMoney) + " amount of hands: " + this.dealerHands.size() + " dealer's score: "
                + this.dealerScore);
    }

    @Override
    public void addHand(Hand newHand){
        this.dealerHand = newHand;
        this.dealerHands.add(newHand);
    }

    @Override
    public void AddCardToHand(Card newCard,int whichHand){
        this.dealerHand = new Hand();
        this.dealerHand = dealerHands.get(whichHand);
        this.dealerHand.handAddCard(newCard);
        this.dealerHands.set(whichHand, dealerHand);
    }

    @Override
    public void addSecondHand(Hand newHand){
        this.dealerHands.add(newHand);
    }

    @Override
    public Hand getPersonHand(int whichHand) {

        return dealerHand;
    }

    public boolean isShouldDealerHit(int dealersCardScore){
        if(dealersCardScore >= 17){
            return this.shouldDealerHit = false;
        }
        else{
            return this.shouldDealerHit = true;
        }
    }
}

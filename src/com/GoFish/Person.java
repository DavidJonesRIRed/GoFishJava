package com.GoFish;

public interface Person {
    //variables

    //methods
    public void setName(String newName);
    public String getName();

    public void setTurn(Boolean isTurn);
    public boolean getTurn();

    public void getDetails();

    public void addHand(Hand newHand);

    public void AddCardToHand(Card newCard, int whichHand);

    public void addSecondHand(Hand newHand);

    public Hand getPersonHand(int whichHand);
}

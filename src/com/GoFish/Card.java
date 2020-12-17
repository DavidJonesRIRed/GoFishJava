package com.GoFish;

public class Card {
    protected String cardSuit;
    protected String cardRank;

    public Card(String newSuit, String newRank) {
        this.cardSuit = newSuit;
        this.cardRank = newRank;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public String getCardRank() {
        return cardRank;
    }
}

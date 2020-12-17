package com.GoFish;

import java.util.ArrayList;

public class Hand {
    //variables
    private ArrayList<Card> cardsInHand;

    //constructors
    public Hand(){

    }

    public ArrayList<Card> getHand(){
        return cardsInHand;
    }

    public void handAddCard(Card newCard){
        cardsInHand.add(newCard);
    }

    public void seeHand(){
        cardsInHand.forEach(card -> System.out.println("Cards in Hand are " + card.getCardRank() + " of " + card.getCardSuit()));
    }

    public Card removeCardFromHand(int numberOfCard){
        numberOfCard = numberOfCard -1;

        if(numberOfCard < 0 || numberOfCard > cardsInHand.size()){
            return null;
        }

        Card result = cardsInHand.remove(numberOfCard);

        return result;
    }
}

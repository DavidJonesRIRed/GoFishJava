package com.GoFish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class DeckOfCards {
    //variables
    private ArrayList<Card> Deck;
    private ArrayList<Card> cardPulled;
    private Random deckRandomizer;
    private String[] deckSuit = {
            "SPADES",
            "HEARTS",
            "DIAMONDS",
            "CLUBS"
    };
    private String[] deckRank ={
            "TWO",
            "THREE",
            "FOUR",
            "FIVE",
            "SIX",
            "SEVEN",
            "EIGHT",
            "NINE",
            "TEN",
            "JACK",
            "QUEEN",
            "KING",
            "ACE"
    };

    //Constructor
    public DeckOfCards() {
        deckRandomizer = new Random();
        cardPulled = new ArrayList<Card>();
        Deck = new ArrayList<Card>(deckSuit.length * deckRank.length);
        newDeck();
    }

    //methods
    public void newDeck() {
        cardPulled.clear();
        Deck.clear();
        /* Creating all possible cards... */
        for (String s : deckSuit) {
            for (String r : deckRank) {
                Card c = new Card(s, r);
                Deck.add(c);
            }
        }
    }

    public int randomizeIntForDeck(int min, int max) {
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = deckRandomizer.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public Card pullRandomRemoveFromDeck() {
        Card result = Deck.remove(randomizeIntForDeck(0, Deck.size() - 1));
        if (result != null)
            cardPulled.add(result);
        return result;
    }

    public Card pullRandomLeaveInDeck() {
        Card result = Deck.get(randomizeIntForDeck(0, Deck.size() - 1));
        return result;
    }

    public int currentDeckSize(){
        int result = Deck.size();

        return result;
    }

    public int currentAmountOfPulledCards(){
        int result = cardPulled.size();

        return result;
    }

    public void shuffleDeck(){
        Collections.shuffle(Deck);
    }

    public void shufflePulledDeck(){
        Collections.shuffle(cardPulled);
    }

    public void searchCardInDeck(String searchSuit, String searchRank){
        ArrayList<Card> result = Deck.stream()
                .filter(item-> item.cardSuit.contains(searchSuit) && item.cardRank.contains(searchRank))
                .collect(Collectors.toCollection(ArrayList::new));

        //result.forEach(System.out::println);
        if(result.size() == 0)
        {
            System.out.println("No com.GoFish.Card found in current DECK");
        }
        else {
            result.forEach(card -> System.out.println("Found card " + card.getCardRank() + " " + card.getCardSuit()));
        }

    }

    public void searchCardInDeckBySuit(String searchSuit){
        ArrayList<Card> result = Deck.stream()
                .filter(item-> item.cardSuit.contains(searchSuit))
                .collect(Collectors.toCollection(ArrayList::new));

        //result.forEach(System.out::println);
        if(result.size() == 0)
        {
            System.out.println("No Cards found by suit in current DECK");
        }
        else {
            result.forEach(card -> System.out.println("Found card " + card.getCardRank() + " " + card.getCardSuit()));
        }

    }

    public void searchCardInDeckByRank(String searchRank){
        ArrayList<Card> result = Deck.stream()
                .filter(item-> item.cardRank.contains(searchRank))
                .collect(Collectors.toCollection(ArrayList::new));

        //result.forEach(System.out::println);
        if(result.size() == 0)
        {
            System.out.println("No Cards found by rank in current DECK");
        }
        else {
            result.forEach(card -> System.out.println("Found card " + card.getCardRank() + " " + card.getCardSuit()));
        }

    }

    public void searchCardInPulledDeck(String searchSuit, String searchRank){
        ArrayList<Card> result = cardPulled.stream()
                .filter(item-> item.cardSuit.contains(searchSuit) && item.cardRank.contains(searchRank))
                .collect(Collectors.toCollection(ArrayList::new));

        //result.forEach(System.out::println);
        if(result.size() == 0)
        {
            System.out.println("No com.GoFish.Card found in current pulled DECK");
        }
        else {
            result.forEach(card -> System.out.println("Found card " + card.getCardRank() + " " + card.getCardSuit()));
        }

    }

    public void searchCardInPulledDeckBySuit(String searchSuit){
        ArrayList<Card> result = cardPulled.stream()
                .filter(item-> item.cardSuit.contains(searchSuit))
                .collect(Collectors.toCollection(ArrayList::new));

        //result.forEach(System.out::println);
        if(result.size() == 0)
        {
            System.out.println("No com.GoFish.Card found by suit in current pulled DECK");
        }
        else {
            result.forEach(card -> System.out.println("Found card " + card.getCardRank() + " " + card.getCardSuit()));
        }

    }

    public void searchCardInPulledDeckByRank(String searchRank){
        ArrayList<Card> result = cardPulled.stream()
                .filter(item-> item.cardRank.contains(searchRank))
                .collect(Collectors.toCollection(ArrayList::new));

        //result.forEach(System.out::println);
        if(result.size() == 0)
        {
            System.out.println("No com.GoFish.Card found by rank in current pulled DECK");
        }
        else {
            result.forEach(card -> System.out.println("Found card " + card.getCardRank() + " " + card.getCardSuit()));
        }

    }

    public boolean isEmpty(){
        return Deck.isEmpty();
    }
}

package com.GoFish;

import java.util.ArrayList;
import java.util.Collections;

public class Book {
    ArrayList<Card> book = new ArrayList<Card>();

    public Book(){

    }

    public void addCardsToBook(ArrayList<Card> bookCards){
        Collections.copy(book,bookCards);
    }
}

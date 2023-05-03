package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private ArrayList<Card>cardlist;

    User(){
        cardlist=new ArrayList<>();
    }

    public void receiveCard(Card c){
        this.cardlist.add(c);
    }
    public List<Card> openCards(){
        return cardlist;
    }
}

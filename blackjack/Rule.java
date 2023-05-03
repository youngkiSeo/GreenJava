package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Rule {

    Rule(){

    }

    public int getScore(List<Card> cards){
        int num=0;
        for (Card card : cards) {
            num+=getDenominationNum(card.getDenomination());
        }
       return num;

    }

    public int getDenominationNum(String card){
        int num=0;
        switch (card){
            case "A":
                return 1;
            case "J": case"Q": case "K":
                return 10;
            default:
                return Integer.valueOf(card);
        }
    }
}

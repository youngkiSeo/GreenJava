package com.green.java.blackjack;

import java.util.ArrayList;

public class BlackjackTest {


    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();
        Card c= cd.getCard();

        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());

       int gamerscore =rule.getScore(gamer.openCards());
        System.out.println("gamer: "+ gamerscore);

       int dealerscore =rule.getScore(dealer.openCards());
        System.out.println("dealer: "+dealerscore);

    }
}
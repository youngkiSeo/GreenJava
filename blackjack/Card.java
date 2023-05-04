package com.green.java.blackjack;

public class Card {
    private String pattern; //무늬
    private String denomination; // 정수


    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }
    public String getDenomination() {
        return denomination;
    }
    @Override
    public String toString(){
        return String.format("Card {%s,%s}", getPattern(),getDenomination());
    }
}

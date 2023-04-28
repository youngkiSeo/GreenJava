package com.green.java.ch04;

public class VendingMachine {
    private int money;


    public VendingMachine() {

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void insert(int money) {
        this.money += money;
    }

    public void showMoney(){
        System.out.printf("현재 잔액은  %d원입니다.",this.money);
    }



}
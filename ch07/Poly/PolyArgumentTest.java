package com.green.java.ch07.Poly;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Tv2 tv= new Tv2();
        Computer com = new Computer();
        Buyer buyer = new Buyer();
        buyer.buy(tv); //Tv를 100만원에 구매하였습니다
        buyer.buy(com);
        buyer.buy(com);
        buyer.printState(); //나의 잔고
    }
}
class Buyer{
    private int money;
    private int bonusPoint=0;

    Buyer(){
        this.money=1000;
        this.bonusPoint=0;
    }
    void buy(Product product){
        //.money=this.money-product.getPrice();
        this.money-=product.getPrice();
        System.out.printf("%S을 %d만원에 구매하였습니다.\n",product.toString(),product.getPrice());
        this.bonusPoint+=product.getBonusPoint();
    }

    void printState(){
        System.out.printf("나의 잔고: %d만원\n", this.money);
        System.out.printf("보너스 점수는 %,d 점입니다\n",this.bonusPoint);
    }
//123
}
class Product{
    protected int price;
    protected int bonusPoint;

    Product(int price){
        this.price =price;
        this.bonusPoint = (int)(price * 0.1);
    }
    public int getPrice(){
        return price;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}
class Computer extends Product{
    public Computer(){
        super(200);
    }
    //오버라이딩 object메소드
    public String toString(){
        return "Computer";
    }

}

class Tv2 extends Product{
    public Tv2(){
        super(100);
    }
    public String toString(){
        return "TV";
    }
}


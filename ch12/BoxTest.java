package com.green.java.ch12;

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItem("Hello");
        box.setItem(10);
        box.setItem(10.3);

        box.setItem(new Car(2000));
        box.setItem(new Car(3000));

        Object obj = box.getItem();

        Car car= (Car) obj;

        int cc = car.getcc();

        System.out.println(cc);

    }
}

class Car{
    private int cc;

    public Car(int num){
        this.cc = num;
    }

    public int getcc() {
        return cc;
    }


}
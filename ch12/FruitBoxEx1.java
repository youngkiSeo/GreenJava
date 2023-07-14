package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple);

        Box2<Fruit> fruitBox = new Box2();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        System.out.println(fruitBox);

        Box2<Apple> appleBox = new Box2();
        appleBox.add(new Apple());



    }
}

class Fruit{
    @Override
    public String toString(){
        return "Fruit";
    }
}
class Apple extends Fruit{
    @Override
    public String toString(){
        return "Apple";
    }
}
class Grape extends Fruit{
    @Override
    public String toString(){
        return "Grape";
    }
}
class Toy {
    @Override
    public String toString(){
        return "Toy";
    }
}

class Box2 <T>{
    private List<T> list = new ArrayList<>();
    void add(T item){
        list.add(item);
    }
    public T get(int idx){
        return list.get(idx);
    }

    public int size(){
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

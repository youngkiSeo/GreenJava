package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        Box3<Car> box = new Box3<>();
        FruitBox<Fruit2> fBox = new FruitBox();
        fBox.add(new Apple2());

        FruitBox<Apple2> aBox = new FruitBox();

    }
}

class Fruit2{
    @Override
    public String toString(){
        return "Fruit";
    }
}
class Apple2 extends Fruit2{
    @Override
    public String toString(){
        return "Apple";
    }
}
class Grape2 extends Fruit2{
    @Override
    public String toString(){
        return "Grape";
    }
}
class Toy2 {
    @Override
    public String toString(){
        return "Toy";
    }
}

class FruitBox<T extends Fruit2> extends Box3<T> {

}

class Box3 <T>{
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

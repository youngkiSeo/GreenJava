package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        Juice j1 = new Juice("레몬");
        System.out.println(j1);
        Box4<Fruit3> fruitBox = new Box4<>();
        fruitBox.add(new Fruit3());
        fruitBox.add(new Apple3());
        fruitBox.add(new Grape3());
        Juice makejuice = Juicer.makejuice(fruitBox);

        Box4<Toy3> toyBox = new Box4<>();


    }
}
class Juicer{
    public static Juice makejuice(Box4<? extends Fruit3>box){
        //Juice juice = new Juice(box.get();

        return null;
    }
}
class Juice{

    private String name;

    public Juice(String name){
        this.name = name + "주스";
    }

    @Override
    public String toString(){
        return name;
    }
}

class Fruit3{
    @Override
    public String toString(){
        return "Fruit";
    }
}
class Apple3 extends Fruit3{
    @Override
    public String toString(){
        return "Apple";
    }
}
class Grape3 extends Fruit3{
    @Override
    public String toString(){
        return "Grape";
    }
}
class Toy3 {
    @Override
    public String toString(){
        return "Toy";
    }
}
class FruitBox4<T extends Fruit> extends Box3<T> {

}

class Box4<T>{
    private List<T> list = new ArrayList<>();
    public void add(T item){
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

package com.green.java.ch07.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        myList.add(90,100);

        System.out.println(myList.toString());
    }
}

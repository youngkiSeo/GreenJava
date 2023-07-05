package com.green.java.ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyArrayListTest3 {
    public static void main(String[] args) {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));



        MyArrayList intList = new MyArrayList();
        for (int i = 100; i <=200 ; i++) {
            intList.add(i);
        }
        MyArrayList filterList = intList.filter(item -> item % 2 == 0);

        System.out.println(filterList);

        MyArrayList filterList2 = intList.filter(item -> (item <=150 || item % 2 == 1));

        System.out.println(filterList2);

    }
}

package com.green.java.ch14;

public class MyArrayTest7 {
    public static void main(String[] args) {
        MyArrayList ml = MyArrayList.asList(1,2,3,4,5);
        System.out.println(ml);


        int count = 0;
        for (int i = 0; i <10; i++) {
            count=(int) (Math.random() * 10) + 6;
            System.out.println(count);


        }


    }
}

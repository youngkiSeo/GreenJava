package com.green.java.ch01;

public class DateTest2 {
    public static void main(String[] args) {
        int y = 2023, m=5, d =27;
        System.out.print(y);
        Date(m);
        Date(d);

    }
    static void Date(int m){
        if (m>10){
            System.out.print("-"+m);
        }else {
            System.out.print("-0"+m);
        }
    }









}


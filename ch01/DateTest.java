package com.green.java.ch01;
public class DateTest {
    public static void main(String[] args) {
        int y = 2023, m=05, d =27;
        String strDate = String.format("%d-%02d-%d",y,m,d);
        System.out.println(strDate);
    }
}

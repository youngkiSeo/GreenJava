package com.green.java.ch02;

public class StringStudy1 {
    public static void main(String[] args) {
     String str = "abcdefghijklmn";
     String r1 =str.substring(0,5);
     String r2 =str.substring(3,6);
        System.out.println(r1);
        System.out.println(r2);

        int idx =str.indexOf("g");
        System.out.println("idx: " + idx);

        int len = str.length(); // 문자열의 길이를 알수있다
        System.out.println("len : " + len);

    }
}

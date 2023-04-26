package com.green.java.ch07.ArrayList;

import java.util.ArrayList;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        arraylist.add(10); // 0번방
        arraylist.add(20);// 1번방
        arraylist.add("ddd"); // 정수값도, 문자열도 아무거나 다들어감

        Object obj = 10; //Object 타입은 숫자도 저장할수있음

        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(1));
        System.out.println(arraylist.get(2));

        int n1 = (int)arraylist.get(0);  //Object타입이라서 object 타입으로 뱉어내기 때문에 강제 형변환을 해줘야함
        int n2 = (int)arraylist.get(1);
        String str1 = (String)arraylist.get(2);
    }
}
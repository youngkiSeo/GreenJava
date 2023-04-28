package com.green.java.ch04;

public class BreakContinueStudy {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i+", ");
            if (i==5){
                System.out.println("\n5에서 끝!");
                break;  //가장 가까운 for문을 빠져나옴
            }
        }
        System.out.println("--------");
        for(int i=0; i<10; i++){
            if(i==5){
                continue; //가장 가까운 for문을 증감 스킵
            }
            System.out.println(i+", ");
        }
    }
}

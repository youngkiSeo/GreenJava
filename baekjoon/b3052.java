package com.green.java.baekjoon;

import java.util.Scanner;

public class b3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[10];
        int num=0;
        for (int i = 0; i <arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            if (0!=arr[i]%42){
                num++;
            }else {

            }
        }
        System.out.println(num);
    }
}

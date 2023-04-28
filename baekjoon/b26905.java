package com.green.java.baekjoon;

import java.util.Scanner;
public class b26905 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int [] items = new int [input];
        for (int i = 0; i <items.length; i++) {
            items[i]= scan.nextInt();
        }
        int num = 0;
        int idx = 0;
        for (int i = 0; i < items.length; i++) {
            for (int z = 0; z < i; z++) {
                if (items[z] > items[z + 1]) {
                    num = items[z];
                    items[z] = items[z + 1];
                    items[z + 1] = num;
                    idx++;
                }
            }
        }
        System.out.println(idx);
    }
}

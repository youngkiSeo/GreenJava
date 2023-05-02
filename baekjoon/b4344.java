package com.green.java.baekjoon;

import java.util.Scanner;

public class b4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int N= scan.nextInt();
        int [][] score = new int [input][N];

        for (int i = 0; i <input; i++) {

            for (int z = 0; z <N; z++) {
                score[i][z]=scan.nextInt();
            }
            N= scan.nextInt();

        }

    }
}

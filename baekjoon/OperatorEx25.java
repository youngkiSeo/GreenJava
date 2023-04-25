package com.green.java.baekjoon;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int a=scan.nextInt();
        for(int i=1; i <10; i++){
            System.out.printf("%d * %d = %d\n",a,i,a*i);

        }
        scan.close();

    }
        }

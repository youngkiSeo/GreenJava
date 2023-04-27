package com.green.java.baekjoon;

import java.util.Scanner;

public class b1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int input2=0;


        int nanugi=input/10;
        int mod=input%10;
        input=nanugi+mod;//8=2+6

        int N =0;
        while (N<5){
            input2=input%10;
            input=mod+input2;//14=6+8 // 6=2+4
            System.out.println(mod+input);
            String str1=Integer.toString(mod%10);
            String str2=Integer.toString(input%10);
            str1=str1+str2;
            N=Integer.valueOf(str1);
            System.out.println(N);
            mod=input2;
                N++;
        }
    }
}

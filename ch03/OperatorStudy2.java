package com.green.java.ch03;

public class OperatorStudy2 {
    public static void main(String[] args) {
        int num = 10;
        int result = 10 % 2;
        System.out.printf("%d %% 2 = %d\n", num, result);
        //%% 두번적으면 변수에 값을 적는 곳이 아니라 %를 사용하겠다


        num = 9;
        result = num % 2;
        System.out.printf("%d %% 2= %d\n" ,num, result);

    }
}

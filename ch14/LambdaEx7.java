package com.green.java.ch14;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {
    public static void main(String[] args) {
        Function<String,Integer> f = s -> Integer.parseInt(s,16); // 16진수 문자열 -> 10진수 변환
        Function<Integer, String> g = i-> Integer.toBinaryString(i);
        Function<String,String> h = f.andThen(g);
        Function<String, String> f2 = x -> x; //항등 함수
        System.out.println(f2.apply("AAA"));
        System.out.println(f.apply("A"));
        System.out.println(g.apply(3));
        System.out.println(h.apply("A"));



        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r3 = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate(); // P의 부정
        System.out.println("P.test : " + p.test(99));
        System.out.println("notP.test : " + notP.test(99));


        Predicate<Integer> all = notP.and(q.or(r3));
        System.out.println(all.test(101));

        String str1 = new String("abc");
        String str2 = new String("abc");
        Predicate<String> p2 = Predicate.isEqual(str1);
        System.out.println(p2.test("바보"));
        System.out.println(str1 == str2);





    }
}

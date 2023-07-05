package com.green.java.ch14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100 + 2);


        //Wrapper Type
        //int > Integer



        Consumer<Integer> c = i -> System.out.println(i*5);
        c.accept(55);
        Consumer<Integer> c4 = System.out::println;

        Consumer<Integer> c3 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println();
            }
        };

        int val = 9;
        Predicate<Integer> p1 = i -> i >10;
        System.out.printf(" ",val , p1.test(val));

        Function<Double,Integer> fn1 = dVal -> dVal.intValue();
        System.out.println(fn1.apply(10.5));



        Integer n1 = 10;
        int n2 = n1;
       Integer n3 = 20;
       n1 = 20;
        System.out.println(n1 == n3);


    }
}

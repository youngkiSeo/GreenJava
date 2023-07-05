package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdbaEx5_1 {
    public static void main(String[] args) {
        Supplier<Integer> s = () ->(int)(Math.random()*100) +1;

        Consumer<Integer> c = i -> System.out.print(i+",");


        Predicate<Integer> p = i -> i %2 ==0;


        Function<Integer,Integer> f = i -> i/10 * 10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s,list); //10개의 랜덤한 값을 list에 추가해주는 메소드
        System.out.println(list);
        printEvenNum(p,c,list); // list 자료에서 p를 이용해서 체크 true이면 c를 이용해서 출력

        List<Integer> newList = doSometing(f,list);
        List<Integer> newList2 = dosomething2(f,list);
        System.out.println(newList);
        System.out.println(newList2);
    }

    public static void makeRandomList(Supplier<Integer> s, List<Integer> list) {
        for (int i = 0; i <10; i++) {
            list.add(s.get());
        }
    }
    public static void printEvenNum( Predicate<Integer> p,Consumer<Integer> c, List<Integer> list){
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {

            if (p.test(list.get(i))){
                c.accept(list.get(i));
            }
        }
        System.out.println("]");
    }
    public static List<Integer> doSometing(Function<Integer,Integer> f, List<Integer> list){

        List<Integer> newList = new ArrayList<>();

        for (Integer val: list) {
            newList.add(f.apply(val));
        }
        return newList;

    }

    public static <T> List<T> dosomething2(Function<T,T> f, List<T> list){
        return list.stream().map(f).toList();
    }

}


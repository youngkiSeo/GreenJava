package com.green.java.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamStudy1 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5);

        intList.stream()
                .distinct()
                .skip(2)
                .limit(3)
                .forEach(item -> {
                    System.out.print(item + ",");
                });

        System.out.println();
        System.out.println("------");

        int [] intArr ={99,1,2,9,3,110,4,5};

        IntStream intArrStream = Arrays.stream(intArr);
        intArrStream.sorted().forEach(System.out::print);
        System.out.println(Arrays.toString(intArr));

    }
}

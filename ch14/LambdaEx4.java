package com.green.java.ch14;

import java.util.*;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            list.add(i);
        }

        System.out.println();
          list.forEach(num -> System.out.print(num + ","));
        System.out.println();


          list.forEach(num -> {
                     String result = (num + ",");
              System.out.print(result);
          });
        System.out.println();

         list.removeIf(num -> (num % 2 == 0 ));
        System.out.println(list);
        list.replaceAll( item -> item * 10);
        list.forEach(item-> System.out.print(item + ", "));
        System.out.println();

        Map<String, Object> map = new HashMap();
        map.put("age",28);
        map.put("name","홍길동");
        map.put("height",177.7);

        int age = (int)map.get("age");
        String name = (String)map.get("name");
        double height = (double)map.get("height");

        map.forEach((key,value)->{
            System.out.printf("%s : %s\n", key,value);
        });

    }
}

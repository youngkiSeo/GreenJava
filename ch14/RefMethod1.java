package com.green.java.ch14;

import java.util.function.*;

public class RefMethod1 {
    public static void main(String[] args) {
        Function<String,Integer> f = s -> Integer.parseInt(s);

        Function<String,Integer>f2 = Integer::parseInt;

        System.out.println("f.apply(10) : " + (f.apply("10")+10) );
        System.out.println("f.apply(20) : " + (f.apply("20")+10) );

        BiFunction<String, String, Boolean> f3 = (s1, s2) -> s1.equals(s2);

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println("f3.apply(s1,s2) : " +f3.apply(s1,s2));

        BiFunction<String,String,Boolean> f4 = String::equals;

        BiPredicate<String, String> p1 = String::equals;
        System.out.println("p1.test(s1,s2) :" + p1.test(s1,s2));

        Supplier<MyClass> s = ()-> new MyClass();
                //파라미터는 없고 리턴타입만 있는게 Supplier
               //Consumer 는 파라미터만 있다. void 리턴타입없음

        MyClass mc = s.get();

        Supplier<MyClass> s3 = MyClass::new;

    }
}

class MyClass{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}

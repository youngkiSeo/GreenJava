package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest6 {
    public static void main(String[] args) {
        MyArrayList ma = new MyArrayList();

        for (int i = 0; i <10; i++) {
            ma.add(i);
        }
        ma.removeIf(item -> (item%2 ==0));
        System.out.println(ma);

        MyFunction3 mFn = item -> item * 10;

        MyFunction3 myFunction3 = new MyFunction3() {
            @Override
            public int apply(int p) {
                return p * 10;
            }
        };
        ma.replaceAll(myFunction3);

     //   ma.replaceAll(mFn);
        System.out.println(ma);
    }
}

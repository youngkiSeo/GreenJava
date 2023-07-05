package com.green.java.ch14;

import java.util.function.Predicate;

@FunctionalInterface
interface MyConsomer{
    void accept(int num);
}
@FunctionalInterface
interface MyPredicate{
    boolean test(int num);
}
@FunctionalInterface
interface MyFunction3{
    int apply(int p);
}
public class MyArrayList {
    private int[] arr;


    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public MyArrayList(){
     this.arr=new int[0];
    }

    public static MyArrayList asList(int ... num){
        MyArrayList ma = new MyArrayList();
        for (int i = 0; i <num.length; i++) {
            int val = num[i];
            ma.add(val);
        }

        return ma;

    }

    public void add(int num) {
        int []temp = new int [arr.length+1];
        temp[arr.length]=num;
        for (int i = 0; i <arr.length; i++) {
            temp[i]=arr[i];
        }
        this.arr=temp;
    }
    public void forEach(MyConsomer consomer){
        for (int i = 0; i < this.arr.length; i++) {
            consomer.accept(this.arr[i]);
        }
    }
    public MyArrayList filter(MyPredicate predicate){
        MyArrayList temp = new MyArrayList();
        for (int i = 0; i <this.arr.length; i++) {
            int val = this.arr[i];
            if (predicate.test(val)){
                temp.add(val);
            }
        }
        return temp;
    }
    public MyArrayList map(MyFunction3 function){

        MyArrayList temp = new MyArrayList();

        for (int i = 0; i <this.arr.length; i++) {
            int apply = function.apply(this.arr[i]);
            temp.add(apply);
        }
        return temp;
    }
    public void removeIf(MyPredicate predicate){
        int[] temp = new int[this.arr.length];
        int idx =0;
        for (int i = 0; i <this.arr.length; i++) {
            int val = this.arr[i];
            boolean test = predicate.test(val);
            if (test == false){
                temp[idx++] = val;
            }
        }
        int[] temp2 = new int[idx];

        for (int i = 0; i <temp2.length; i++) {
            temp2[i]=temp[i];
        }
        for (int i = 0; i < temp2.length; i++) {
            System.out.print(temp2[i]);
        }
        System.out.println();

        this.arr=temp2;
    }
    public void replaceAll(MyFunction3 myFunction){
        for (int i = 0; i <this.arr.length; i++) {
            this.arr[i]= myFunction.apply(arr[i]);
        }
    }

    @Override
    public String toString(){

        StringBuilder str = new StringBuilder("[");

        for (int i = 0; i < arr.length-1; i++) {
            str.append((arr[i])).append(",");
        }
        str.append(arr[arr.length - 1]);
        str.append("]");
        return str.toString();
    }


}

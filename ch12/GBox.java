package com.green.java.ch12;

public class GBox<T> {
    // T 부분에 타입을 지정하게되면
    private T obj;

    public void setItem(T obj){
        this.obj = obj;
    }

    public T getItem(){
        return obj;
    }


}

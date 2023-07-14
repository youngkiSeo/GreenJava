package com.green.java.ch12;

public class Box {
    public final static int NUM_MAX = 10;

    private Object val;

    public void setItem(Object obj) {
        this.val = obj;
    }

    public Object getItem() {
        return val;
    }

}
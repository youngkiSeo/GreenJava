package com.green.java.ch14;

public class LambaInterfaceTest {
    public static void main(String[] args) {
        LambaInterface li1 = heal-> System.out.println("에너지: " + heal);
        li1.healing(100);
    }

}

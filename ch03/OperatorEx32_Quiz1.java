package com.green.java.ch03;

public class OperatorEx32_Quiz1 {
    public static void main(String[] args) {
        int x =10, y = -5, z =0;
        int absX, absY, absZ; //절대값이 없는값
        OperatorEx32_Quiz1 OE = new OperatorEx32_Quiz1();

        absX=OE.getAbs(x); //OE 객체 주소값점 메소드 호출
        absY=OE.getAbs(y);
        absZ=OE.getAbs(z);

        System.out.println("absX: "+ absX);
        System.out.println("absY: "+ absY);
        System.out.println("absZ: "+ absZ);

    }

    public int getAbs(int num){

        if (num >=0){
            return num;
        }else {
            return -num;
        }
    }
}


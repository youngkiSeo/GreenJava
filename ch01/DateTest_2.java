package com.green.java.ch01;
public class DateTest_2 {

    public static void main(String[] args) {
        int y = 2023, m =11, d=2;
        String sMon = (m<10 ? "0" : "")+ String.valueOf(m);
        String sDay = (d<10 ? "0" : "")+ String.valueOf(d);
        System.out.printf("%s-%s-%s \n", y, sMon,sDay);

        String str = String.valueOf(y);

        str +="-"+connvertTwoNumber(m);
        str +="-"+connvertTwoNumber(d);

        System.out.println(str);
    }

    public static String connvertTwoNumber(int n){
        return(n<10? "0" : "") +n;
    }
}
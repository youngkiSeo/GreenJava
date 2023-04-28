package com.green.java.ch02;

public class StringQuiz1 {
    public static void main(String[] args) {
        String fullfileNm= "newjeans.jpg";
        String fileNm, ext;

        int len = fullfileNm.length();

        fileNm=fullfileNm.substring(0,len-4);
        ext = fullfileNm.substring(len-3,len);

        System.out.println(fileNm + "."+ext);

        int idx = fullfileNm.lastIndexOf(".");

        fileNm=fullfileNm.substring(len-len,idx);
        ext = fullfileNm.substring(idx,len);
        System.out.println(fileNm +ext);

    }
}

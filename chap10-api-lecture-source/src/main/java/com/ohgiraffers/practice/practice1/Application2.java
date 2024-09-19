package com.ohgiraffers.practice.practice1;

import java.util.StringTokenizer;

public class Application2 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("안녕하세요");
        sb.insert(0,"찬");
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        System.out.println(sb.length());

        int intValue = 10;
        Integer integer = new Integer(intValue);
        Integer integer1 = Integer.valueOf(10);
        int intValue2 = Integer.valueOf(1);
        int intValue3 = new Integer(10);


        String[] fruit = {"사과 , 과일"};

        for(String i : fruit){
            System.out.println(i);
        }


    }
}

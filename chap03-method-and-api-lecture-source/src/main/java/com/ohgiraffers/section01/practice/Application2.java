package com.ohgiraffers.section01.practice;

public class Application2 {

    public static void main(String[] args) {

        boolean result = false;

        int num1 = 10;
        int num2 = 3;

        for (int i =0 ;i < 3;i++){
            result = num1 % num2 == 0 ? true : false;
            num2++;
            System.out.println(i+"번째 결과: "+result);
        }
    }
}
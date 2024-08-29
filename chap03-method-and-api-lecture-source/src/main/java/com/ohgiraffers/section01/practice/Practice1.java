package com.ohgiraffers.section01.practice;

public class Practice1 {

    public static void main(String[] args) {
        

        System.out.println("maxNum(1,2) = " + maxNum(1,2));
        System.out.println("minNum(1,2) = " + minNum(1,2));

    }

    public static int maxNum(int firstNum, int secondNum) {
        return firstNum > secondNum ? firstNum : secondNum;
    }

    public static int minNum(int firstNum, int secondNum) {
        return firstNum < secondNum ? firstNum : secondNum;
    }

    // 5 10일 경우 :  5
    // 10 5일 경우 :  5
}

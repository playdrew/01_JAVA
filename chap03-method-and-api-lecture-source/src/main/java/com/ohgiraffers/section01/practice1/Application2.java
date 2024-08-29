package com.ohgiraffers.section01.practice1;

public class Application2 {

    public static void main(String[] args) {

        int num1 = 37;
        int num2 = 28;


        Application2 app2 = new Application2();
        System.out.println("app2.isEven(num1) = " + app2.isEven(num1));
        System.out.println("app2.isEven(num1) = " + app2.isEven(num2));

    }

    public String isEven(int num){
        return (num==0) ? "0입니다" : (num%2==0) ? "짝수입니다" : "홀수입니다";
    }
}

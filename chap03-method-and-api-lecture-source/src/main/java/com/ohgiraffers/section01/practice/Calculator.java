package com.ohgiraffers.section01.practice;

public class Calculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.checkMethod();
        System.out.println("10와 20의 합 : " + calc.sumTwoNumber(10, 20));
        System.out.println("10와 20의 합 : " + calc.minusTwoNumber(10,5));
        System.out.println("10와 5의 곱 : " + calc.multiTwoNumber(10,5));
        System.out.println("10과 5의 나눈 후의 몫 : " + calc.divideTwoNumber(10,5));

        calc.minusTwoNumber(10,5);
        calc.multiTwoNumber(10,5);
        calc.divideTwoNumber(10,5);

    }

    public void checkMethod(){
        System.out.println("메소드 호출확인");
        return;
    }

    public int sumTwoNumber(int a, int b){
        return a+b;
    }

    public int minusTwoNumber(int a, int b){
        return a-b;
    }

    public int multiTwoNumber(int a, int b){
        return a*b;
    }

    public int divideTwoNumber(int a, int b){
        return a/b;
    }
}

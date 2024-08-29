package com.ohgiraffers.section01.practice1;

public class Application1 {

    public static void main(String[] args) {

        Application1 app7 = new Application1();
        app7.isEven(3);

    }

    public void isEven (int num){
        String result = (num == 0) ? "0입니다" : (num%2==0) ? "짝수입니다." : "짝수가아닙니다";
        System.out.println(result);
    }
}
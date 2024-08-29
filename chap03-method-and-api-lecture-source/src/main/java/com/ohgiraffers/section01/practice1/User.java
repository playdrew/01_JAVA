package com.ohgiraffers.section01.practice1;

class Account {

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, double num2) {
        return (int) (num1 * num2);
    }
}

public class User {
    public static void main(String[] args) {

        int sum = 0;

        Account acc = new Account();
        sum = acc.plus(sum, 300);  // sum = 0 + 300
        sum = acc.minus(sum, 60);  // sum = 300 - 60 = 240
        sum = acc.minus(sum, 5);   // sum = 240 - 5 = 235
        sum = acc.minus(sum, 15);  // sum = 235 - 15 = 220
        sum = acc.multiply(sum, 1.1); // sum = 220 * 1.1 = 242 (캐스팅 후 242로 변환)
        System.out.println(sum);   // 출력: 242

    }
}

package com.ohgiraffers.section01.practice;

public class Application1 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        Application1 home = new Application1();

        home.add(num1,num2);

    }

    public void add (int a, int b) {
        int c = a + b;
        int d = b++;

        // ++b를 하면 d와 b 당장 1더해집니다.
        // b++를 하면 b는 당장 1 더해집니다.
        // b++를 하면 d는 더해진 값이 나오지 아니함

        System.out.println("a = " +  a);
        System.out.println("b = " +  b);
        System.out.println("d = " +  d);

        sub(c,d);

        System.out.println("결과: " + c);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("d = " + d);

        sub(a,b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("d = " + d);
    }

    public void sub (int a, int b) {

        // 다른 매서드로 가면 더해진다. b++; 되어서
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("결과: " + (a - b));
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
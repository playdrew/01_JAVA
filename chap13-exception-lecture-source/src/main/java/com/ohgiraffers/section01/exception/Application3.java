package com.ohgiraffers.section01.exception;

public class Application3 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            // 상품의 가격이 더 높게 만들 것이다.
            et.checkEnoughMoney(50000,10000);
            System.out.println("=============상품구입가능=============");
        } catch (Exception e) {
            System.out.println("===========상품구입불가능===========");
        }

        System.out.println("프로그램을 종료합니다..");

    }
}

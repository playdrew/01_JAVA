package com.ohgiraffers.section01.exception;

public class Application2 {

    public static void main(String[] args) {

        /* title. try-catch 블럭을 이용하여 예외처리를 할 수 있다.*/

        /* Index. 2. try-catch 블록을 이용한 방법(예외 발생하지 않음)*/

        ExceptionTest et = new ExceptionTest();

        // try 구문내에서 예외가 발생하면 catch 구문이 동작을 한다.
        try {
            et.checkEnoughMoney(10000,50000); // et.checkEnoughMoney 이것만 있으면 컴파일에러 매소드시그니쳐부분에 해당하는 메소드를 부르면 반드시 예외를 처리해라고 나와서 빨간불이 뜬것
            System.out.println("=============상품구입가능=============");
        } catch (Exception e) {
            System.out.println("===========상품구입불가능===========");
        }

        System.out.println("프로그램을 종료합니다..");

    }
}

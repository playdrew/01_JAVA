package com.ohgiraffers.section02.userexception.exception;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException(String message){
        super(message); // 해당하는 메소드의 인스턴스를 호출할때 반드시 문자열을 넘기게 한다.
    }
}

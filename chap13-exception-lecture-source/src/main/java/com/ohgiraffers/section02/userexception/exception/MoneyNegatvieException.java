package com.ohgiraffers.section02.userexception.exception;

public class MoneyNegatvieException extends NegativeException{
    public MoneyNegatvieException(String message) {
        super(message); // 여기서 super 는 negativeException
    }
}

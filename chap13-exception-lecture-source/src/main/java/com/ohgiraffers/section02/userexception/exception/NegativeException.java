package com.ohgiraffers.section02.userexception.exception;

// 예외 클래스를 만드는 방법. Exception 을 상속 받게 되면
// 사용자 정의의 예외 클래스를 만들 수 있다.
public class NegativeException extends Exception{

    public NegativeException(String message){
        super(message); // 부모에게 전달받은 메세지를 넘긴다.
    }
}

package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    
    //내부에서 하나의 인스턴스로 만들어준담에 메소드로 반환해줌
    //클래스가 초기화 되는 시점에 인스턴스를 생성한다
    //왜 private 일까요 -> eager 라는 키워드를 통해서 외부에서 접근할수있으니 private 로 막아놈
    //선언과 동시에 초기화 했으니 이른 초기화라고 하고요
    private static EagerSingleton eager = new EagerSingleton();

    // singleton 패턴은 외부에서 생성자를 통해
    // 인스턴스 생성을 못 하게 제한한다.
    private EagerSingleton(){}

    //외부에서 getInstance 호출시 eager 인스턴스를 반환해주어요
    public static EagerSingleton getInstance(){
        return eager;
    }
}

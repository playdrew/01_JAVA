package com.ohgiraffers.sction01.polymorphism;

public class 개구리 extends 동물 {

    //ctrl o
    @Override
    public void 먹기() {
        System.out.println("개구리가 식탁에 앉아 햄버거를 먹습니다.");
    }

    @Override
    public void 뛰기() {
        System.out.println("개구리가 폴~짝 뛰기 시작합니다.");
    }

    @Override
    public void 울부짖기() {
        System.out.println("개굴개굴");
    }

    /*comment. 자식(상속)은 부모의 메소드 재정의 뿐 아니라 본인의 기능도 가질 수 있다.*/
    public void 낼름공격(){
        System.out.println("개구리가 혓바닥으로 쎄게 내리칩니다.");
    }
}

//상속의 장점 내 입맛대로 부모의 메소드를 오버라이드 할 수 있다.
//부모의 메소드를 쓸수있지만 자식의 특별한 메소드를 쓸 수 있는것도 장점이다.

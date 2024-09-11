package com.ohgiraffers.sction01.polymorphism;

public class 너구리 extends 동물 {
    @Override
    public void 먹기() {
        System.out.println("너구리가 너구리라면을 먹습니다.");
    }

    @Override
    public void 뛰기() {
        System.out.println("너구리가 잽싸게 뛰어갑니다.");
    }

    @Override
    public void 울부짖기() {
        System.out.println("너굴너굴");
    }

    //고유기능추가
    public void 깨물기(){
        System.out.println("너구리가 자기 밥그릇을 건든 사람에게 깨물기 공격을 시전합니다.");
    }
}

//코드상 동물은 너구리일까요 아니죠 너구리는 동물입니다
//모든 클래스는 오브젝트의 자손이다.
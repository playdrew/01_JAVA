package com.ohgiraffers.practice.practice1;

public class 개구리 extends 동물{

    @Override
    public void 먹기() {
        super.먹기();
        System.out.println("개구리가 밥을 먹습니다");
    }

    @Override
    public void 뛰기() {
        super.뛰기();
        System.out.println("개구리가 뛰었습니다");
    }

    @Override
    public void 울기() {
        super.울기();
        System.out.println("개구리가 울었습니다");
    }
    
    public void 개굴(){
        System.out.println("개굴개굴 깨물었습니다.");
    }
}

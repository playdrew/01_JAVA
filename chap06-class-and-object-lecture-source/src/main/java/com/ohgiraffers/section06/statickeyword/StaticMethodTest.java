package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod(){
        this.count++;
        System.out.println("nonStatic 메소드 호출됨...");
    }

    public static void staticMethod(){
        // this.count++;
        // new 라는 키워드를 만나면 주소가 생기는데 주소를 의미하는게 this 에요
        // static 은 별도의 주소를 만들 필요가 없습니다.

        // static 메소드는 인스턴스를 생성하지 않고
        // 사용하는 메소드 이기 때문에
        // this 에는 인스턴스의 주소가 들어갈 수 없다.
        // 클래스명을 구지 사용하는 이유 : 어디 클래스에 있는 공유된 값을 모르기 때문에 공유하니까 어디서 공유하는지 클래스명으로 알 수 있는 것입니다.
        System.out.println("static 메소드 호출됨...");
    }
}

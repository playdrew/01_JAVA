package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {
    
    //non-static 필드 , static 필드
    private int nonStaticCount;
    private static int staticCount;
    
    //기본 생성자
    public StaticFieldTest(){}

    public int getNonStaticCount(){
        return this.nonStaticCount;
    }

    public int getStaticCount(){
        /*comment.
        *   static 필드에 접근하기 위해서는
        *   메소드와 마찬가지로 클래스명.필드명으로 접근하다.
        *   this. 도 가능하다 하지만 사용하지 않는 것이 좋다.
        * */
        return StaticFieldTest.staticCount;
    }
    
    // 두 필드의 값을 1씩 증가시키기 위한 메소드
    public void increaseNonStaticCount(){
        this.nonStaticCount++;
    }

    public void increaseStaticCount(){
        StaticFieldTest.staticCount++;
    }
}

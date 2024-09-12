package com.ohgiraffers.section02.abstractclass;

//public class SmartPhone extends Product 빨간불떠요 이것만 있을때 must be declared abstract or implement abstract method 라고 선언해야만한데요 
//alt enter 키 눌러서 implement method 를 눌러서 해결해요
//public class SmartPhone extends Product , Phone 이렇게 하면 에러가 뜨는데 이걸 위한 개념이 인터페이스입니다.
public class SmartPhone extends Product {

    //추상적으로 만든 메소드는 반드시 상속받은 곳에서 사용해야한다는 것이에요
    //Product 에는 구현부가 없었는데 {} 여기선 구현부가 있어요 
    //부모의 것을 확장시키는 느낌
    @Override
    public void abstMethod() {
        System.out.println("Product 클래스의 오버라이딩 강제화 된 abstMethod() 호출됨...");
    }

    // 상속 복습 : 부모의 것 뿐만 아니라 자기만의 기능을 가질 수 있다.
    public void childMethod(){
        System.out.println("SmartPhone 클래스의 childMethod() 호출됨...");
    }
}

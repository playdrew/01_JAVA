package com.ohgiraffers.section03.interfaceimplements;

//interface 를 상속하는 것은 implements 를 사용해요
//interface 를 상속 받을 때는 implements 키워드를 사용한다.
//이미 Object 를 상속받았어요 , 근데 다중 상속을 하고 싶어서 implements 에 InterfaceProduct
//public class Product extends Object implements InterfaceProduct , jave.io.Serializable{
//} 이것만 있으면 빨간불 must 선언해야하기 때문에 추상메소드를
//
public class Product extends Object implements InterfaceProduct , jave.io.Serializable{

    /*comment.
    *   클래스에서 인터페이스를 상속 받을 때는 implements 키워드를
    *   사용하게 된다.
    *   또한 인터페이스는 여러개를 상속받을 수 있으며
    *   extends 로 다른 클래스를 상속 받는 경우에도 별개로 추가 상속 가능하다.
    *   단, extends 가 implements 보다 앞에 작성되어야 한다.*/

    @Override
    public void nonStaticMethod() {
        System.out.println("InterfaceProduct 의 nonStaticMethod 호출...");

    }
}

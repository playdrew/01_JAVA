package com.ohgiraffers.section03.interfaceimplements;

public class Application {

    public static void main(String[] args) {

        /*title. 인터페이스(interface)에 대해 이해할 수 있다.*/

        /*comment.
        *   인터페이스도 추상클래스와 마찬가지로
        *   클래스의 변형체이다.
        *   추상메소드와 상수 필드만 가질 수 있는 특징이 있다.
        * */

        /*comment.
        *   인터페이스의 사용목적
        *   1. 추상클래스와 비슷하기 필요한 기능을 공통화 해서 강제성을 부여할 목적
        *   2. 자바가 가진 단일상속의 단점을 극복할 수 있다.
        * */

        //인터페이스도 인스턴스를 생성할 수 없다
//        InterfaceProduct interfaceProduct = new InterfaceProduct() {
//            @Override
//            public void nonStaticMethod() {
//
//            }
//        }; 이건 익명클래스라고 합니다.

       // InterfaceProduct interfaceProduct = new InterfaceProduct()

       // 다형성을 이용해서 자식타입의 인스턴스로 사용할 수 있다
       InterfaceProduct interfaceProduct = new Product();
       // 동적 바인딩을 통해 오버라이딩 된 메소드로 호출이 된다.
       interfaceProduct.nonStaticMethod();
       InterfaceProduct.staticMethod();
       
        //공통적으로 쓸 기능을 하나의 클래스로 넣은다음에 반드시 해야할 기능들을 추상클래스와 인터페이스에 정의해서 상속만 받게 되면 강제적으로 그 메서드는 우리가 구지 작성하지 않더라도 사용하게 되요
        // 3번 3번 3번 여러번 쓰는개 아니라 하나를 만든 다음에 상속만 딱 만드는 것이에요 좋은 코드를 위한 기능이죠
        //공통적인 기능을 한 군데에서 정의하면 어떨까에서 나온것



    }
}

package com.ohgiraffers.section03.interfaceimplements;

public interface InterfaceProduct {

    /*comment.
    *   인터페이스의 특징은
    *   상수 필드만 작성이 가능하다.
    *   public static final 키워드 조합을 상수 필드라고 한다.
    *   반드시 선언과 동시에 초기화를 해주어야 한다.
    * */

    // public static final 키워드를 생략해도 묵시적으로 적용
    int MAX_NUM = 100;

    /*comment.
    *   인터페이스는 추상메서드만 작성이 가능하다.
    *   따라서 인터페이스 내부에 작성한 메소드는 묵시적으로
    *   public abstract 의 의미를 가지게 된다.
    *   인터페이스는 생성자를 가질 수 없다.
    * */
    
    //구현부가 없어요 상속받은 클래스를 통해 인스턴스 작성
    /*Index. 1. 인터페이스는 생성자를 가질수 없다.*/
    //public InterfaceProduct(){} // not allowed
    
    /*Index. 2 인터페이스는 구현부가 있는 메소드를 가질 수 없다*/
    //public void nonStaticMethod(){}// {} <-cannot have 바디 구현체

    /*Index. 3. 추상클래스에서 작성해본 추상메소드만 작성할 수 있다*/
    //public abstract void nonStaticMethod(); 회색줄은 작성안해도 된다는 의미 또는 사용하고 있지 않다는 의미이기도
    /*comment.
    *   인터페이스 내부의 메소드는 묵시적으로 public abstract 의 의미를
    *   가지고 있다.
    *   다른 접근제한자는 사용이 불가능하다.
    *   */
    void nonStaticMethod();
    
    /*static 메소드는 작성 가능*/
    /*static 은 생성시점이 아닌 프로그램 run 하는 시점에 수집한다는 것이에요 그래서 인터페이스 내부에서도 몸통을 가질 수 있게 됩니다.*/
    /*static 은 위에서 아래로 가서 new 를 붙여서 하는데 static 은 run 하자말자 수집 그래서 생명주기가 다른 것입니다.*/
    static void staticMethod(){
        System.out.println("InterfaceProduct 의 staticMethod 호출...");
    }
}

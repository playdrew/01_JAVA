package com.ohgiraffers.section02.abstractclass;

//부모클래스의 역할을 한다.
public abstract class Product {

    /*추상클래스는 필드를 가질 수 있다.*/
    private int nonStaticField;
    private static int staticField;
    
    //추상클래스는 생성자를 가질 수 있다
    //Application app = new Application() 에서 new Application() 구문이 기본생성자를 호출하는 구문이었어요
    public Product(){}

    /*추상클래스는 일반적인 메소드도 가질 수 있다*/

    public void nonStaticMethod(){
        System.out.println("Product 의 nonStaticMethod 호출됨 ...");
    }

    //추상클래스는 static 메소드도 가질 수 있다.
    public static void staticMethod(){
        System.out.println("Product 의 staticMethod 호출됨");
    }

    /*comment.
    *   위에 까지는 일반적인 클래스와 다를 바가 없다.
    *   하지만 클래스를 추상클래스로 만들게 되면 추상 메소드를 작성 할 수 있다.
    *   미완성 메소드(추상 메소드) : 구현부가 없는 메소드를 의미한다.
    *   추상메소드가 0개 이상인 경우 선택으로 abstract 키워드를 클래스에
    *   작성해야 한다.
    *   하지만, 추상메소드가 존재하면 즉 1개 이상이면 abstract 키워드는 필수 
    * */
    
    //public abstract class Product 에서 public class Product 하면 컴파일에러
    public abstract void abstMethod(); // {} 중괄호의 영역없이 만들었습니다. 추상메소드는 구현체 몸통이 없어요 껍데기는 제공하는데 내용물을 제공하진 않습니다.
    

}

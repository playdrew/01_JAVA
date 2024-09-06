package com.ohgiraffers.section01.user_type;

public class Member {

    /*comment.
    *  지금까지 우리는 클래스 내부에 메소드만 작성을 했었다.
    *  근데 사실은 메소드를 작성하지 않고, 바로 변수를 선언 할 수도 있다.
    *  이것을 전역변수(필드 == 인스턴스변수 == 속성) */
    
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobbies;


}

//public void test1(){
//        int x = 10; // x가 활동하는 범위는 test1
//        //System.out.println("y = " + y); 출력할 수 없습니다. 이를 지역변수라고 합니다. 위쪽에 다가 쓴 것은 전역변수라는 것이죠
//        //전역변수란 클래스내부에서 다 사용할 수 있다는 것입니다.
//    }
//
//    public void test2(){
//        System.out.println("id = " + id);
//        //int x = 10; x가 활동하는 범위는 test2
//        int y = 20; //y는 지역변수기에 다른 메소드에서 출력할수없습니다.
//    }

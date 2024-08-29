package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /*title. static 메소드를 호출할 수 있다.*/
        /*comment.
        *  우리가 지금 만들고 있는 메소드는 public or void(자료형) 사이에
        *  static 키워드가 붙은 메소드를 만들어서 호출을 해 볼 것이다.
        *  static 나중에 다시 다룰거지만 ,
        *  static 키워드가 붙은 메소드 호출을 알아 볼 것이다.
        * */

        /* comment.
            [표현식]
            클래스명.메소드명(); <- 이런 방식으로 호출한다
        * */

        Application8.sumToNumbers(10,20);

        // new 라는 키워드 필요없이
        // 공간을 만들어서 static static
        // static 은 기울임체로 적혀집니다. 

        int result = Application8.sumToNumbers(10,20);

        System.out.println("result = " + result);

        /* comment.
        *   동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략가능하다.*/
        //sumToNumbers(); // 같은 클래스내에 있어야함 Application8
        sumToNumbers(10,20);

    }

    public static int sumToNumbers(int first , int second) {
        //클래스명 변수명 = new 클래스명()
        //변수명.메서드명 으로 호출했었는데 static 이 붙으면 달라요
        return first + second;
    }

}

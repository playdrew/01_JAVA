package com.ohgiraffers.section04.dto;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        
        /*title. 생성자를 이용한 초기화와 설정자를 이용한 초기화의 장단점*/

        /*Index. 1. 생성자를 이용한 초기화*/
        //UserDTO user1 = new UserDTO(); 기본 생성자의 호출 user1 은 jvm 에서 제공하는 기본값으로 채워져있습니다.
        //장단점 : user01이 무엇을 의미하는지를 몰라요 툴이 똑똑해서 id로 나오긴 하지만요
        /*comment.
        *  장점 : setter 메소드를 여러번 호출할 필요없이 단 한 번의 호출로
        *        인스턴스를 생성 및 초기화 할 수 있다.
        *  단점 : 매개변수의 개수를 경우의 수 만큼 만들어줘야 한다.
        *        만약 호출 시 인자가 많아지는 경우 어떤 값이 어떤 필드를 의미하는지 헷갈린다.
        **/

        UserDTO user1 = new UserDTO("user01","pass01","조평훈", LocalDateTime.now());
        System.out.println("user01 정보 : " + user1.toString()); // 회색의 toString 구지 안써도 적용
        System.out.println("user01 정보 : " + user1);
        //user.toString(); 가 오버라이드가 되어있으면 원래는 주소값을 출력해야하는데 toString 을 생략해도 toString()의 값이 나온다
        
        /*Index. 2. 기본 생성자와 설정자를 이용한 초기화*/
        /*comment.
        *  장점 : 필드를 초기화하는 값들이 어떤 필드를 지칭하는 지 명확하게 알 수 있다.
        *  단점 : 하나의 인스턴스를 생성할 때, 단 한 번의 호출로 끝나지 않는다.*/
        //장단점 : user01이 무엇을 의미하는지 알아요
        UserDTO user2 =new UserDTO(); // 기본 생성자
        user2.setId("user02");
        user2.setPwd("pass02");
        user2.setName("조평순");
        user2.setEnrollDate(LocalDateTime.now());
        System.out.println(user2.toString());
    }
}

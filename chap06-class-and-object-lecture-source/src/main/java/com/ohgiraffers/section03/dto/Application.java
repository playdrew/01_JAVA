package com.ohgiraffers.section03.dto;

public class Application {

    public static void main(String[] args) {
        
        /*title. 데이터를 추상화하는 기법을 이해할 수 있다.*/
        /*comment.
        *   캡슐화의 원칙에는 일부 어긋나긴 하지만, 다른 목적을 가진
        *   클래스와 객체를 추상화하는 기번이 있다.
        *   행위(메소드) 위주가 아닌 데이터를 하나로 뭉치기 위한
        *   객체(Data Transfer Object)의 경우이다.
        *   이러한 객체를 설계할 때는 행위가 아닌 데이터 위주이며
        *   갭슐화를 적용하여 모든 필드를 private 로 막고 각
        *   필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해둔다.
        *   어떤 값을 쓸 지 모르니 미리 다 준비해두는 선물세트 같은 느낌이다.
        *   private 캡슐화가 된 필드와 , 필드의 값을 수정할 수 있는
        *   설정자(setter), 필드의 값을 접근할 수 있는 접근자(getter)
        *   로 구성이 된다. 주로 계층간의 데이터를 주고 받을 목적이다.
        * */

        MemberDTO member = new MemberDTO(); // heap 이란 공간에 기본값이 채워진 상황
        member.setMemberNo(1);
        member.setName("조평훈");
        member.setAge(20);
        member.setGender('남');
        member.setHeight(180.32);
        member.setWeight(60);
        member.setActivated(true);

        System.out.println("회원 번호 : " + member.getMemberNo());
        System.out.println("회원명 : " + member.getName());
        System.out.println("회원나이 : " + member.getAge());
        System.out.println("회원성별 : " + member.getGender());
        System.out.println("회원키 : " + member.getHeight());
        System.out.println("회원몸무게 : " + member.getWeight());

    }
}

//DTO -> 데이터를위한 클래스 (여러 기능을 가진 클래스에서 데이터를 운반하기 위한 클래스다)
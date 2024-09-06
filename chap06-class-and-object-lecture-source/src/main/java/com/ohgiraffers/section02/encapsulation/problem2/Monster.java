package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {

    /*Index. 1. name 과 hp 에 대한 값을 저장할 필드 선언*/
    //전역변수 필드로 선언
    //몬스터라는 프로그램을 만들었는데 몬스터 이름만 받을려고 했는데 이름대신 종류로 만들어요.
    //이름이라고 하는 게 필요가 없어졌다해요
//    String name;
//    int hp;

    /*Index. 2. 기획의도가 바뀌었다.. 이름 대신에 몬스터 종류로 ..*/
    /*comment. 
    *   우리는 단 한 단어만 바꾸었을 뿐인데 8줄의 수정이 필요하다
    *
    * */
    String kinds;
    int hp;

}

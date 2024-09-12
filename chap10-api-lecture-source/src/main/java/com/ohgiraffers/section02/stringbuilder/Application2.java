package com.ohgiraffers.section02.stringbuilder;

import java.sql.SQLOutput;

public class Application2 {

    public static void main(String[] args) {

        /* title. StringBuilder 의 특징을 확인해보자. */

        StringBuilder sb = new StringBuilder("javamysql");

        /*comment.
        *   delete() : 시작 인덱스와 종료 인덱스를 이용하여 제거
        *   deleteCharAt() : 문자열 인덱스를 이용하여 문자 하나 제거 
        *   - 중요!! 둘 다 원본에 영향을 미친다. WHY? 하나의 인스턴스다*/

        System.out.println("delete() : " + sb.delete(2,5)); //jaysql
        System.out.println("sb = " + sb); // 원본이 반영됨 하나의 인스턴스이므로 // sb = jaysql
        System.out.println("deleteCharAt() : " + sb.deleteCharAt(2)); //jasql 수정된 jaysql 에서 2번째 인덱스인 y를 삭제
        System.out.println("sb = " + sb); // sb = jaysql
        
        // 지정한 위치에 값을 집어넣기
        
        /*comment.
        *   insert() : 인자로 전달한 값을 문자열로 변환 후 지정한 위치에 삽입
        *   reverse() : 문자열 인덱스 순번을 역순으로 재배치
        * */

        System.out.println("insert() : " + sb.insert(1,"avamy")); // jasql의 첫번째 인덱스 a 가 뒤로 밀리고 javamyasql 첫번째 인덱스는 삭제되는듯
        System.out.println("reverse() : " + sb.reverse()); // 뒤집어달라는 명령어 lqsaymavaj

        int x = 10;
        //int 의 부모님이 있어요는 잠시 스택에 있다 사라지는 공간
        Integer y = new Integer(10);//deprecated 권장하지 않음 이것은 int 기본자료형을 인스턴스화 시킨것입니다. 기존 스택에 잠깐 머무르는 것이아니라 메모리공간에 할당받는 것이에요
        //나중에 collection 클래스를 가게 되면 Integer 그니까 Wrapper 를 쓸 수 밖에 없어요
        //인스턴스화를 시킬 거냐 말거냐 객체로 만들거냐 말거냐 입니다.
        
        

    }
}

// Wrapper 래핑(감싸기) 클래스가 있습니다.

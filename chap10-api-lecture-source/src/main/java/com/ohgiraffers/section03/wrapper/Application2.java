package com.ohgiraffers.section03.wrapper;

public class Application2 {

    public static void main(String[] args) {

        /* title. 문자열 파싱(parsing)에 대해 이해할 수 있다. */
        
        
        //파싱은 번역한다 바꿔준다로 이해
        /*comment.
        *   parsing 이란, 문자열(String) 값을 기본 자료형 값으로 변경하는 것 */
        //화면상에서 넘어오는 값이 우리의 입맛대로 오지않아요 int 면 int char 면 char 이러길 바라는데 숫자든 문자든 불리언이든 타입에 맞게 넘기는게 아니라
        //문자열로 넘기는 경우가 간간히 있습니다. 문자열로 넘겨온 값은 int 면 int 불리언이면 불리언으로 넘겨주어야 하는데 이것을 파싱이라고 합니다.

        /*comment.
        *   기본 자료형은 넘겨진 문자열을 스스로 바꿀 수 있는 기능이 없다
        *   따라서 byte 의 Wrapper 클래스인 Byte 가 가지고 있는 parseByte();
        *   메소드를 사용해서 문자열 값을 Byte 형으로 변경할 수 있다.*/
        //byte b = ("1"); 안됨
        byte b = Byte.parseByte("1"); // ("1") 문자열 1을 byte 로 바꾸고 싶어요 기본자료형으로는 넣을 수 없어요 래퍼클래스의 도움을 받습니다. 클래스를 인스턴스화 시킨 것으로요
        //Byte 클래스의 parseByte 메소드를 이용해서 1을 바이트로 바꾼것입니다.
        //오토언박싱과정이 일어났습니다. 래퍼클래스의 값을 원시타입에 넣었잖아요
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");
        //char c = Character.parseCharacter Character 는 parsing 제공하지 않는다 하지만 우리에겐 charAt()이 있다
        char c = "ABC".charAt(0);


    }
}

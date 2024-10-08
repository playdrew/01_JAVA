package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        /*수업 목표. 변수를 선언하고, 값을 할당하여 사용할 수 있다. */
        /*
        * 필기.
        *  변수를 사용하는 방법
        *  1. 변수를 준비한다.(선언) - 공간을 만든다
        *  2. 변수에 값을 대입한다.(값대입 및 초기화) - 삭제보단 초기값설정의 의미
        *  3. 변수를 사용한다.
        * */
        
        //아래가 선언. 4byte에 값을 넣지는 않음
        //int inum;

        /*목차. 1. 변수를 준비(선언)한다*/
        // 자료형 변수형; ex) int num;

        /*
        * 자료형이란?
        * 다양한 값의 형태별로 어느 정도 크기를 하나의 값으로 취급할 것인지 compiler 와 약속한 키워드이다.
        * 예를 들어 앞에서 사용한 int 라는 자료형은 정수를 4byte 만큼 읽어서
        * 하나의 값으로 취급하겠다는 약속이다
        *
        * ! compiler 작성한 언어를 컴퓨터가 이해하게 만드는 번역기같은 것
        * 자료형은 기본자료형(Primary Type)과 참조 자료형(Reference Type) 두가지로 나뉘어진다.
        * 그 중 기본자료형 8가지 부터 살펴봅시다.
        * */

        /* 목차. 1-1-1. 숫자를 취급하는 자료형*/
        /* 필기. 정수를 취급하는 자료형은 4가지가 있다 */
        byte bnum ; //공간 1byte
        short snum ; //공간 2byte
        int inum ; //공간 4byte
        long lnum ; //공간 8byte
        //2 의 배수로 커집니다.

        /*필기. 실수를 취급하는 자료형은 2가지가 있다.*/
        float fnum ; //4byte
        double dnum ; //8byte

        /* 목차. 1-1-2. 문자를 취급하는 자료형*/
        /* 필기. 문자를 취급하는 자료형은 한가지가 있다.*/

        char ch; //2byte

        /* 목차. 1-1-3. 논리값을 취급하는 자료형*/
        boolean isTrue; //1byte

        /*필기. 이상 8가지를 기본 자료형(Primary) 이라고 한다.*/

        /* 목차. 1-1-4. 문자열을 취급하는 자료형*/
        String str; //4byte 주소는 엄밀하게 따지면 4byte 정수형으로 저장된다.

        /* 목차. 2. 변수에 값을 대입한다.(값 대입 및 초기화)*/
        // 메모리에 값을 저장하기 위한 공간 만 생성을 한 상태이다.
        // 이제 우리는 =(대입연산자)를 이용하여 값을 저장할 수 있다.

        /* 목차. 2-1. 정수를 취급하는 자료형에 값 대입해보기*/

        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L; // 소문자 l을 써도 되지만 1과 혼선여부가 있어 대문자.

        /* 목차. 2-2. 실수를 취급하는 자료형에 값 대입해보기*/

        fnum = 4.0f; // 대문자 f를 써도 되지만 소문자를 쓰는것이 일반적
        dnum = 8.0;

        /* 목차. 2-3 문자를 취급하는 자료형에 값 대입해보기*/
        ch = 'a'; // 문자는 '' 홀따음표
        ch = 97; // 문자는 내부적으로 숫자로 저장이 되어있다.

        isTrue = true;
        isTrue = false;
        
        str = "안녕하세요";

        //대표 자료형 : 정수 int 실수 double 이 대표 자료형이다.

        //참조 자료형 : 자료의 저장된 공간의 주소를 저장





    }
}

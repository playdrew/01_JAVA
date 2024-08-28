package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {

        /*title. 메소드의 호출 흐름에 대해 이해할 수 있다.*/
        /*comment.
        *  메소드란
        *  특정 작업을 수행하기 위한 명령문(코드의 집합)
        *  특수명
        *  */

        System.out.println("main()시작됨...");

        /*Index. 2. 작성한 methodA()호출하기*/
        /*comment.
        *  우리가 만든 메소드 호출하는 방법.
        *  [표현식]
        *  클래스명 변수명 = new 클래스명();
        *  변수명.메소드명();
        *  .(점앞에 속해있는것들) */

        /*comment.
        *  main 영역 밖에 있는 친구를 소환할 때 쓰는 구문
        *  */

        Application1 app1 = new Application1();

        app1.methodA();

        System.out.println("main()종료됨...");


    }

    /*Index. 1. methodA() 만들어보기 */
    public void methodA(){
        System.out.println("methodA()등장...");
        methodB();
        System.out.println("methodA()퇴장...");
    }

    /*Index. 3. methodB() 만들어보기*/
    public void methodB(){

        System.out.println("methodB()두둥장...");
        //methodA() 무한반복 stackoverflow
        System.out.println("methodB()퇴장한다...");

    }
}

/* new 라고 하지 않아도 같은 영역이므로 (.)할 필요는 없다
 * 같은 클래스에 속해있으면 이름만 불러도 아는데 메인에서는 아니다.*/

/*메모리공간에 app1이라는 것이 생김 힙이고 실제 메모리에 남아있어요
* 기본자료형(int char ..) 스택이라는 영역*/

/*나중엔 메인엔 코드 거의 남아있지 않음 메소드로 연결연결하는듯*/

/*ctrl + 클릭 누르면 따라다님 */

/* 위에서 아래 근데 메서드호출할때 호출부위같다가 다시올라옴 */

/*로그인 메소드 로그아웃메소드도 있음*/

/*흐름*/
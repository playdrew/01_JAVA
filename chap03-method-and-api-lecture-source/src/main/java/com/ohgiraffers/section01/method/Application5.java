package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {

        /*title. 메소드 리턴에 대해서 이해할 수 있다.*/
        /*comment.
         *  return 이란?
         *  모든 메소드 내부에는 return; 이 존재한다.
         *  void 형의 메소드는 return; 을 명시적으로 작성하지 않아도
         *  마지막 줄에 컴파일러가 자동으로 추가를 해준다.
         *  return 은 현재 메소드를 강제 종료하고
         *  호출한 구문으로 돌아가는 명령어 이다 <- **중요**  *
         */

        System.out.println("main 시작됨....");

        Application5 app5 = new Application5();
        app5.testMethod();
        int age = 10; // 회색인 이유는 쓰지 않고 있기 때문

        System.out.println("main 종료됨....");
    }

    public void testMethod(){

        System.out.println("testMethod() 호출됨...");



        System.out.println("testMethod() 종료됨...");

        return; // 회색 안써도 되는 거 or 안 쓰고 있는 것 (둘중하나라도 참이면 참이다) 현재메소드를 강제종료 
        // 쭉 내려가다 다시 올라감

        /*comment.
        *  return 키워드는 컴파일러에 의해 자동으로
        *  가장 마지막 줄에 추가된다.
        *  만약 가장 마지막 줄에 쓰지 않게 되면
        *  도달할 수 없는 코드가 되며 컴파일 에러를 발생 시킨다. */
        //System.out.println("종료되었나?"); unreachable statement 위에 return 있으므로 접근하지 못함.
    }
}

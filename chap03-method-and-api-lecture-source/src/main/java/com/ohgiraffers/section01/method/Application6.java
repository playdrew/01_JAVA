package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {

        /*title. 메소드의 리털값에 대해 이해하고 활용할 수 있다.*/
        /*comment. void 피하다 책임을 회피하는 녀석. void 형 메소드는 자기가 출력할꺼 하면 끝
        *  자기 영역내에 코드만 실행하는것 . void 형이 아닌 녀석들에 대해서 알아봅시다.*/

        /*comment.
        *  메소드의 리턴값 테스트
        *  메소드 라는 녀석은 항상 마지막에 돌아가야 한다. => 즉 리턴이 존재한다.
        *  어디로? => 자신을 부른(호출한) 쪽으로 가야한다.
        *  복귀를 할 때, 그냥 복귀를 할 수도 있지만, 값을 가지고 복귀할 수 있다.
        *  이 때 가지고 가는 값을 리턴값이라고 한다. 값 리터럴을 가지고 호출한 쪽으로 간다.
        * */

        /*comment.
        *  리터럴은 항상 변수에 담겨있어야한다
        * */

        /*comment.
        *  return 값을 반환 받기 위해서는 메소드 선언부에 리턴타입을 명시해주어야 한다.
        *  void 는 아무 반환값도 가지지 않겠다는 키워드이고 ,
        *  return 구문을 생략해도 컴파일러가 자동으로 추가되지만
        *  반환값이 있는 경우는 return 구문을 반드시 명시적으로
        *  작성을 해주어야 한다.
        *  또한, 리턴타입의 반환 값의 자료형은 반드시(!) 일치해야한다.
        *  - 자바는 자료형이 정말 중요하다.*/


        System.out.println("main 시작됨....");

        Application6 app6 = new Application6();

        /*comment.
        *  메소드를 호출을 했을때 main 시작과 끝 출력문만 나온다.
        *  그러나 호출은 된 상태이다.
        *  그러면 "안녕하세요"라는 값은 왜 출력이 안될까??
        *  값 = 리터럴
        *  즉 값을 출력하는 구문이 없을 뿐이다,
        *  호출한 메소드가 종료되면서 호출 구문 자체가
        *  반환값 = return 구문에 작성한 값이 된 것이다.
        *  */




        app6.testMethod();
        System.out.println("app6.testMethod() = " + app6.testMethod());
        //app6.testMethod() 의 리터럴 자체가 "안녕하세요"이다.
        //리터럴은 변수에 담을수 있어요
        String hi = app6.testMethod(); // 리터럴이 string 인데 int 자료형에 들어갈 수 없음 int hi = app6.testMethod();
        System.out.println("hi = " + hi);

       // app6.testMethod(); 만하면 아무것도 출력되지 않는데 이것은 출력구문도 없고 "안녕하세요" 리터럴이 변수에 담겨있지 않아서 그럼.

        System.out.println(" app6.testMethod2 " + app6.testMethod2(1,2) );
        System.out.println(" app6.testMethod3 " + app6.testMethod3(1,2) );

        System.out.println("main 종료됨....");
    }

    //void 가 아닌 자료형을 사용함
    public String testMethod(){
        return "안녕하세요"; // return ; missing return value 가 없데요
        // return 3; required type String 을 요구하는데 3이 provided 됨
    }   //아무것도 없으면 missing return statement 없데요

    public int testMethod2(int num1 , int num2){
        return num1 + num2++;
    }

    public int testMethod3(int num1 , int num2){
        return num1 + ++num2;
    }
}

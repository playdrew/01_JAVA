package com.ohgiraffers.section07.kindofvariable;

public class KindOfVariable {  // 클래스 영역의 시작

    /*title. 다양한 변수들을 이해하고 사용할 수 있다.*/
    /*comment.
    *   클래스 영역 내부에 작성하는 변수를 필드 라고 한다.
    *   필드 == 멤버변수(클래스가 가진 멤버) == 전역변수
    * */
    
    /*comment. non-static 필드를 인스턴스 변수라고도 한다
    *   인스턴스 생성 시점에 사용 가능한 변수의 의미
    **/
    private int globalNum;

    /*comment. static 필드는 정적필드(클래스변수) 라고도 한다.*/
    private static int staticNum;
    //전역변수 멤버변수 필드라고는 부르지만 인스턴스변수라고 하지는 않습니다.

    public void testMethod(int num){ // 메소드 영역의 시작

        /*comment.
        *   메소드 영역내에서 작성하는 변수를 지역변수라고 한다.
        *   매개변수도 일종에 지역변수이다.
        *   지역변수와 매개변수는 모두 메소드 호출 시
        *   stack 영역에 생성이 된다.*/

        int localNum;
        // 매개변수는 호출 시 값이 넘어와서 변경 되기 때문에 초기화가 필요없다
        System.out.println(num);
        // 하지만 지역변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화를 해야한다
        // System.out.println(localNum);
        // 전역변수는 메소드내부에서도 사용가능하다
        System.out.println(globalNum);
        System.out.println(staticNum);

    } // 메소드 영역의 끝

    public void testMethod2(){
        System.out.println(globalNum);
        System.out.println(staticNum);
        //지역변수는 해당(영역) 내에서만 사용이 가능하다.
        //System.out.println(localNum); 지역변수는 해당메소드에서만 사용할 수 있다.
    }

} // 클래스 영역의 끝

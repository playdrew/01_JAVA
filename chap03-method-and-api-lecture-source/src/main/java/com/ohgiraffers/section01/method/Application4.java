package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {
        
        /* title. 여러 개의 전달 인자를 이용한 메소드 호출 테스트 */

        /* Index. 2. 여러 개 매개변수를 가진 메소드 호출하기 */

        Application4 app4 = new Application4();
        app4.testArgsMethod("조평훈",20, '남');
        //app4.testArgsMethod(20,'남',"조평훈"); '남'은 오류가 나지 않았는데 자동형변환된것
        //값의 개수는 맞지만 , 순서가 다르게 전다로디면 안된다.
        //String name = "조평훈"

        //app4.testArgsMethod(name,20,'남');
        //String name = "조평훈" //위의 코드는 작동되지 않는다 위에서 아래로 컴퓨터는 흐르기 때문이다.
        
        //복습방법 : 모르는 것이 있으면 처음부터 보지 말고 현재 챕터를 공부하면서 모르는 부분 뒤에서 보는 방식 추천


        
    }

    /*Index. 1. 여러 개 전달인자를 받을 수 있는 메소드 만들기.*/
    public void testArgsMethod(String name , int age , final char gender){
        
        /*comment.
        *  매개변수도 일종의 지역변수로 분류된다.
        *  매개변수 역시 상수의 의미를 가지는 final 키워드를 사용할 수 있다.
        *  (지역변수에 final 키워드를 붙이는 것과 동일하다) */
        System.out.println(" 제 이름은 " + name + "이고 , 나이는 " + age + "세이며 " + "성별은 " + gender +"자 입니다.");
        
        return ; // 생략된 return void 의 경우에는 명시적으로 적을필요없다.
        
    }
}

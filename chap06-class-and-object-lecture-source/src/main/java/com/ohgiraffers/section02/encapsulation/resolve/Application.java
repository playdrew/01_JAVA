package com.ohgiraffers.section02.encapsulation.resolve;

public class Application {

    public static void main(String[] args) {

        /*title. 접근제한자를 이해하고 지금까지 발생한 문제를 해결할 수 있다.*/
        
        /*Index. 1. private 필드에 직접 접근 했을때 */
        Monster monster1 = new Monster();
        //monster1.kinds = "시진핑"; kinds is not public in ~ . cannot be accessed from outside package kind가 빨간색 private으로 해서

        /*comment.
        *   encapsulation 우리가 클래스에 만들어둔 필드(전역변수==인스턴스변수)
        *   대로 공간은 생성이 되어 있지만 , private 로 직접적으로 접근은
        *   막아두고
        *   public 으로 만들어둔 메소드를 통해서만 필드의 값을 대입할 수
        *   있도록 해놓은 것이다.
        *   이것을 캡슐화(encapsulation)이라고 한다.
        * */
        
        /*
        *  하나 수정했는데 오류가 많다 그럼 안좋은 코드
        *  적게 오류다 좋은 코드
        * */
        
        /*클래스내부에 있는 것을 전역변수 메소드에 갇혀 있는 것을 지역변수
        * */

    }
}

//추상화란 프로그램상에서 필요한 것만 추려내는 것을 의미해요
//예를 들면 , 롤이란 게임을 생각해봐요. 캐릭터가 있어요. 그 친구의 패시브와 스킬4개가 고유한 속성이죠
//그 친구의 키랑 몸무게가 필요할까요? 게임에서 중요한 건 스킬이죠
//회원가입을 해요 구지 안경착용유무 키 필요없잖아요
//우리가 할려는 것에서 필요한 것들만 도출하는 것을 의미해요 
//자동차의 필드의 종류로 택시 트럭 등등하는 것과 비슷한듯?
//즉 프로그램에서 공통점을 추출하고 불필요한 공통점을 제거하는 과정

// 클래스명 변수명 = new 클래스명()
// 인제 클래스명() 소괄호에 대해서 new 라는 키워드를 쓰면 힙메모리에 메모리가 생김
// 해당하는 공간에 값을 매겨주는 것들
// this == 자기자신 member 에 this.age 는 age this.는 멤버 멤버가 가진 age


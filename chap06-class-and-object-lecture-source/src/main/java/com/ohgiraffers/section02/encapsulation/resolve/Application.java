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

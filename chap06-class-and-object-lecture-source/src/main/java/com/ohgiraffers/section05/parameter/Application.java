package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /*title. 메소드의 파라미터에 대해 이해할 수 있다.*/

        /*comment.
        *   매개변수(parameter) 로 사용 가능한 자료형
        *   1.기본자료형
        *   2.기본자료형 배열
        *   3.클래스자료형
        *   4.클래스자료형 배열
        *   5.가변인자.
        *  */

        /*Index.1. 기본 자료형 매개변수 전달*/
        int num = 20;

        ParameterTest pt = new ParameterTest();
        pt.testPrimary(num); //(.)을 하는 순간 해당 heap 메모리로 날라가고요

        /*Index.2. 기본 자료형 배열을 매개변수로 전달 받는 메소드 호출*/
        int[] iarr = {1,2,3,4,5};
        System.out.println("인자로 전달하는 값 : " + iarr);

        // alt enter
        //인자로 전달하는 값 : [I@38af3868
        //매개변수로 전달 받은 값 : [I@38af3868 가 동일한 걸로보아 얕은 복사입니다.
        //얕은 복사의 특징 : 다른 곳에서 수정하면 영향을 끼친다는 것
        //값을 메소드에 넘긴다는 것은 해당하는 메소드에서 수정하면 반영된다는 것이에요

        pt.testPrimaryArrayParameter(iarr);

        System.out.print("메소드 전달 후 원본 배열의 값 확인 : ");
        for(int i = 0 ; i<iarr.length ; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /*Index. 3. 클래스 자료형 매개변수 전달*/
        //기본생성자를 호출하지 않았기 때문에 Rectangle r1 = new Rectangle(); 는 에러 입니다.
        Rectangle r1 = new Rectangle(12.5,22.5);

        //인자로 전달하는 클래스 자료형 값 : com.ohgiraffers.section05.parameter.Rectangle@72ea2f77
        //매개변수로 전달 받은 값 : com.ohgiraffers.section05.parameter.Rectangle@72ea2f77 얕은 복사가 되었습니다.
        System.out.println("인자로 전달하는 클래스 자료형 값 : " + r1);
        pt.testClassParameter(r1);

        /*Index. 5. 가변인자*/
        //너가 몇개의 공간을 보낼지 모르는데 공간을 준비해주겠다?
        //pt.testVariableLengthParameter("조평훈"); 하나만 보내도 오류가 안나요 원래 조평훈 취미도 적어야 하잖아요
        /*comment.
        *   가변인자 : 인자로 전달하는 값의 갯수가 정해지지 않은 경우 사용하는
        *            배열이다 
        *   가변인자는 매개변수가 여러 개 일 때 , 반드시 뒤에 작성해야 한다.
        *   why? -> 가변인자의 끝을 알 수 없기 때문에*/
        pt.testVariableLengthParameter("조평훈"); // 가변인자는 전달하지 않아도 된다는게 특징입니다.
        pt.testVariableLengthParameter("조평훈","야구");
        pt.testVariableLengthParameter("조평훈","야구","볼링","축구");
        pt.testVariableLengthParameter("조평훈", new String[]{"테니스","볼링","야구","축구"}); // 배열도 됩니다.근데 그 뒤는 안되는듯
    }

}

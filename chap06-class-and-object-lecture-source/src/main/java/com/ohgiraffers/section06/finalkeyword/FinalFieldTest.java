package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /*title. final 키워드에 대해 조금 더 자세히 이해할 수 있다.*/

    /*comment.
    *   final : 종단의 의미를 가지는 키워드이다.
    *   final 키워드는 사용하는 위치가 다양하지만, 결국 변경 불가의 의미를 갖는다.
    *   1. 지역변수 : 초기화 이후 값 변경 불가
    *   2. 매개변수 : 호출 시 전달한 인자 변경 불가
    *   3. 전역변수 : 인스턴스 생성 후 초기화 이후 값 변경 불가
    *   4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
    *   5. non-static 메소드 : 메소드 재작성(override) 불가
    *   6. static 메소드 : 메소드 재작성(override) 불가
    *   7. 클래스 : 상속 불가
    * */

    /*Index. 1. non-static 필드에 final 사용*/
    /*comment.
    *   인스턴스가 생성 될 때 int 자료형의 기본값인 0이 필드에 들어가는데
    *   초기화 이후 값을 변경할 수 없기 때문에 바로 초기화를 시켜주어야 한다
    *   그렇지 않으면 compile error 가 발생한다.*/
    //final 하면 반드시 값을 넣어주어야 한다는 것입니다. compiler 의 기본값은 안돼요
    //private final int nonStaticNum; 일반적으로 이렇게 캡슐화를 진행해서 private int nonStaticNum; 여기서 final 만 붙이면 에러되는데요

    /*Index. 1-1. 해결방안(1) 선언과 동시에 초기화를 한다.*/
    private final int NON_STATIC_NUM = 1;

    /*Index. 1-2. 해결방안(2) 생성자를 통해 초기화를 한다.*/
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName){
        this.NON_STATIC_NAME = nonStaticName;
    }

    /*Index. 2. static 필드에 final 키워드 사용*/
    //private static final int STATIC_NUM; //0이라는 기본값이기 오류
    private static final Double PI = 3.14;

    /*comment.
    *   static 이 붙은 키워드는 생성자를 이용한 초기화가 불가능하다.
    *   생성자는 인스턴스가 생성되는 시점(new 를 만나는 시점)에 호출이 되기 때문에
    *   그 전에는 초기화가 일어나지 못한다.
    *   하지만 static 키워드는 프로그램이 run 하는 동식에 할당되기 때문에
    *   초기화 되지 않은 상태로 선언 된 것과 동일하여
    *   기본값으로 초기화 된 후 값을 변경하지 못하기 때문에 에러가 발생한다.
    * */

    private static final double STATIC_DOUBLE;

//    public FinalFieldTest(DOUBLE staticDouble){
//        //FinalFieldTest.STATIC_DOUBLE= staticDouble;
//        //this.도 안돼요
//    }

    //static 의 특징 : 인스턴스가 생성되는 것은 코드가 new 라는 것을 만났을때 메모리에 뜨는 것이에요
    //run 을 누르는 시점에 해당하는 시점에 메모리공간에 다 띄어나요 new 라는 키워드는 필요없어요.
    //생성자전에 미리 static 이 동작을 해요 static 은 항상 먼저 공간을 만들고 있어요
    //생성자 초기화해도 그전에 이미 0이라는 초기값이 되기 때문에 안돼요 private static final double STATIC_DOUBLE;

    /*comment. 정적 초기화 블록으로 초기화 할 수 있다.*/
    static {
        STATIC_DOUBLE = 0.5;
    }
    //생명주기가 static 으로 똑같기 때문에 가능하다.

}

//공유되고 바뀌지 않았으면 좋겠다 그럼 static final 키워드를 사용해요
//메모리는 stack heap static 이 있어요
//프로그램이 시작하면 static 에 붙은 애들을 다 담아놓아요.
//new 라는 애를 만나야 메모리공간이 생기는 것과는 달라요..
//new 키워드 없이 static 은 사용가능합니다 이미 공간이 만들어져있기 때문에
//단 하나만 만들어서 공유하는 것 싱글톤이라고 해요 구지 16개를 만들지 않더라도 하나만 리모컨 있으면 된다.
//인스턴스 생성 없이 사용가능 왜냐 미리 공간을 만들어 놓았기 때문에 공유에서 사용할 목적으로 많이 사용합니다.

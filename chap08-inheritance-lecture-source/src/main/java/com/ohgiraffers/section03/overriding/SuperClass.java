package com.ohgiraffers.section03.overriding;

public class SuperClass {

    /*title. 오버라이딩에 대해 이해할 수 있다.*/

    /*comment.
    *   오버라이딩의 성립요건
    *   1. 메소드 이름이 동일해야 한다. // 이름이 다르면 자식의 추가적인 기능 (자식이 새로운 메소드를 만든셈)
    *   2. 메소드의 리턴 타입이 동일해야 한다
    *   3. 매개변수의 타입, 갯수, 순서가 동일해야 한다.
    *   4. private 메소드는 접근이 불가능하기 때문에 오버라이딩 불가능
    *   5. final 키워드가 사용 된 메소드는 오버라이딩 불가능
    *   6. 접근제한자는 부모 메소드와 같거나, 더 넓은 범위여야 한다. // 상속을 받는 이유 부모의 것을 받아서 확장시키려는 의미인데 확장시켜야하는데 오히려 상속받아놓고 다른데서 못쓰면 필요가 없는것
    *   7. 예외처리 같은 예외이거나 , 더 구체적(하위)인 예외를 다루어야 한다. // 해당하는 예외를 처리하는데 자식은 부모의 것보다 진화시키면 진화시켰지 더 퇴보할 수 없음 부모보다 간출할수는 없음
    * */

    public void method(int num){}

    private void privateMethod(){}

    public final void finalMethod(){}

    protected void protectedMethod(){}
}

// 다형성 : 형태를 많이 가질 수 있습니다.
// 이런 식으로 자바에서 중요하다는 것 자료형일치 아니면 들어갈 수가 없습니다.
// 상속이라는 개념이 나오면서 여러가지의 값을 가질수있어요
// 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것 이게 핵심입니다.
// int 안에다 String boolean 은 아니고 연관성이 있는 애들을 집어넣을 수 있어요 extends 상속받게 끔 연결시켜보았어요 
// 3대특징 : 캡슐화 상속 다형성 자바의 꽃인데.. 해당하는 언어를 이래서 사용하는 구나 알수있게끔사용하는건데
// 뭔가 쓰면 좋을 것 같은데 남용하면 안좋은 적당한 선을 찾아가는게 중요
// 변수 메소드 클래스 안에 자연스럽게 녹아있으니까 가장 중요한것 흐름 대입연산자 왼쪽은 값 오른쪽은 공간
// 여러타입의 객체를 하나의 타입으로 관리할수있다가 특징중에 하나인데
// 자식은 성을 물려받는데 김씨라는 정체성 실제이름은 다르다. 성으로 이어있지만 고유의 사람 나만의 뭔가 가 있다는 것입니다.
// 동적바인딩 : Parent p = new Child(Parent 가 아니다) p.methodA . 부모가 가진 메서드 A같지만 실제 값은 child 이다 자료형은 PARENT지만 실제값은 자식
// 자식에게 없는 메소드를 쓸 수 있었어요 부모의 메소드를 끌고 오기 때문에 얘도 마찬가지 부모의 메서드를 쓸 수 있지만 부모의 메서드A가 아닌 내가 가진 메서드A도 쓸수있다는 것이에요
// 만약에 Child methodA가 있다면 이것을 실행한다는 것이에요 Parent 안에 Child 가 들어간다 종속된다.


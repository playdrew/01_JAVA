package com.ohgiraffers.section03.overriding;

//public final class SubClass extends SuperClass
//SubSubClass 클래스 생성하고 extends SubClass 하면 안되요 final 이란 것의 클래스에 붙이면 상속안됨 확장시키지 말란 의미 잘 안쓴다고 함
//클래스에 final 키워드를 붙이면 상속을 제한하는 의미이다.
public class SubClass extends SuperClass{
    
    //int x= 10
    // x="String" 불가 한데 부모타입으로 상속해서 부모가 상속받고 있는 자식타입을 넣을 수 있을까;
    
    /*Index. 1. 메소드 이름 변경하면 오류 발생*/
    //@Override 슈퍼클래스에 DOES NOT OVERRIDE 왜냐하면 method2가 존재하지 않기 때문에
    //public void method2(int num){}

    /*Index. 2. 메소드의 리턴타입 변경하면 오류 발생*/
    //@Override 보이드여야 하는데 int 로 리턴타입을 지정했다
    //public int method(int num){return 0;}
    
    /*Index. 3. 매개변수의 갯수 , 타입 변경 시 오류발생*/
    //@Override (String num)이 아닌 int num 이어야 된다
    //public void method(String num){}

    /*Index. 4. 매소드의 이름, 리턴타입, 매개변수 갯수 , 타입 , 순서 모두 일치 */
    @Override // 오버라이딩의 성립조건
    public void method(int num){}

    /*Index. 5. private 메소드는 오버라이딩 불가*/
    //@Override
    //private void privateMethod(){}
    
    /*Index. 6. final 메소드 오버라이딩 불가*/
    //@Override // final 은 종단의 의미 더이상 바꾸지말자라 약성한건데 재작성은 기존의 것을 바꾸는 것이기 때문에 안됨
    //public final void finalMethod(){}
    
    /*Index. 7. 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 해야 가능*/
    //@Override // 아무것도 작성하지 않은게 default 인데 default < protected 이기 때문에 안됨 상속은 확장의 개념 더 퇴보할수 없음
    // 더 좁은 범위로는 불가능하다
    //void protectedMethod(){}

    //@Override
    //protected void protectedMethod(){} 부모와 같은 범위는 가능하다.

    @Override // protected 보다 더 큰 public 으로 하니 오버라이딩이 된다.
    public void protectedMethod(){} // 더 넓은 범위도 가능하다.
    
}

// 목적의식이 있다고 하면 거기서는 계층구조를 만드는 것이 좋습니다. 정확한 목적성이 있어야 하는데 그렇지 않으면 의미없기 때문입니다.

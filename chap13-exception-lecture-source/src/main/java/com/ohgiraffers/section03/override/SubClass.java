package com.ohgiraffers.section03.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{


    // 같은 예외를 던져주는 구문으로는 오버라이딩 가능하다.
//    @Override
//    public void overrideTestMethod() throws IOException {
//    }

    // 예외를 제외하고도 오버라이딩 가능하다.
//    @Override
//    public void overrideTestMethod(){}


    // 부모의 예외처리 클래스보다 상위타입 오버라이딩 : 클래스구조가 아래로 내려갈 수록 자세해진다. 부모가 IOException 을 throw 하는데 자손이 부모보다 추상적인 클래스를 throw 하면 안된다는 것이에요
    // 자식은 항상 부모 보다 더 자세하게(더 구체적인 예외상황) 작성해야 한다.
//    @Override
//    public void overrideTestMethod() throws Exception{}
    
    // Exception <-- IOException <-- FileNotFoundException (오른쪽으로 갈수록 자식) 연결고리가 생길때 자식은 부모보다 더 구체적이어야한다 아래로 내려가면 내려갈 수록 더 세밀해야한다. 
    // IOException 은 FileNotFoundException 보다 추상 FileNotFoundException 은 IOException 보다 더 구체적
    // 부모의 예외처리 클래스 보다 더 하위에 있는 예외(즉, 구체적)인 경우 오버라이딩 가능
    @Override
    public void overrideTestMethod() throws FileNotFoundException {
    }
}

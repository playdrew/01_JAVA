package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegatvieException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {


        ExceptionTest2 et = new ExceptionTest2();
        try {
            // 상품가격음수
            //et.checkEnoughMoney(-3000,5000);
            // 가진 돈 음수
            //et.checkEnoughMoney(3000,-5000);
            // 물건의 가격이 가진 돈 보다 큼
            et.checkEnoughMoney(10000,5000);

            /*title. 주의의 의미
            *   주의사항
            *   catch 블럭은 위에서부터 아래로 자신의 타입과 맞는 경우
            *   동작을 하는데, 상위타입(NegativeException)이
            *   catch 블럭 상단에 위치하게 된다면
            *   하단에 작성한 하위타입(MoneyNegativeException)은
            *   절대 도달 할 수 없는 코드가 되기 때문에 컴파일 에러를 발생한다.
            * */

            //예외 상황 별 catch 블럭을 따로 작성해서 처리할 수 있다.
        } catch (PriceNegativeException e) { // NegativeException e 하면 아래 e 구문에서 빨간불 뜨는데요 부모에서 이미 다 걸리기 때문에 재처리가 안오기때문에 컴파일에러가 뜹니다. has already been caught 닿을 수가 없는 코드 부모가 위에서 다 낚아챔
            System.out.println("가격이 음수 상황 발생!!!!!!");
            System.out.println(e.getMessage());
        } catch (MoneyNegatvieException e) { // 위의 NegativeException e 에선 오류가 안나요6
            System.out.println("돈이 음수 상황 발생!!!!!!");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("돈이 충분하지 않은 상황 발생!!!!");
            System.out.println(e.getMessage());
            //finally : 예외 발생 여부와 상관없이 실행할 내용
            /*comment.
            *   finally 구문은 나중에 다시 다루겠지만,
            *   사용한 자원을 닫는 곳에 많이 쓴다.
            * */
        } finally {
            System.out.println("finally 블럭 예외 상관 없이 동작 확인...");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}

// Stream 통로에서 output input 이 있는데 다 input output 해도 통로는 직접 잡아줘야해요. 거기서 finally 를 통해서 닫아주어요
// 부모의 것을 오버라이딩할때 자식은 부모보다 많죠.. 자식은 부모보다 구체적 부모는 추상적으로 쓴 느낌

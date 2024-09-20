package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section01.exception.ExceptionTest;
import com.ohgiraffers.section02.userexception.exception.MoneyNegatvieException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {

    public static void main(String[] args) {

        //클래스는 자료형 : 우리가 직접만드는 자료형 , 예외클래스도 직접만들수 있어요

        /* title. 사용자 정의의 예외 클래스 정의 후 발생한 예외를 처리 할 수 있다.*/

        ExceptionTest2 et = new ExceptionTest2();
        try {
            // 상품가격음수
            //et.checkEnoughMoney(-3000,5000);
            // 가진 돈 음수
            //et.checkEnoughMoney(3000,-5000);
            // 물건의 가격이 가진 돈 보다 큼
            et.checkEnoughMoney(10000,5000);


        } catch (PriceNegativeException e) {
            throw new RuntimeException(e);
        } catch (MoneyNegatvieException e) {
            throw new RuntimeException(e);
        } catch (NotEnoughMoneyException e) {
            throw new RuntimeException(e);
        }

    }
}

package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegatvieException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest2 {

    public void checkEnoughMoney(int price, int money) throws
            PriceNegativeException,
            MoneyNegatvieException,
            NotEnoughMoneyException {

        // 상품가격이 음수라면?
        if(price<0){
            throw new PriceNegativeException("상품가격은 음수일 수 없습니다");
        }

        // 가진 돈이 음수라면?
        if(money<0){
            throw new MoneyNegatvieException("가진 돈은 음수일 수 없다.");
        }

        //위의 조건을 모두 만족
        //내가 가진 돈이 상품의 가격보다 적으면
        if(money<price){
            throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 비쌉니다");
        }

        System.out.println("모든 조건 만족하시네요. 즐거운 쇼핑하세요~~~");

    }
}

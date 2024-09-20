package com.ohgiraffers.practice.practice1;

import com.ohgiraffers.practice.practice1.exception.DivideNotZeroException;
import com.ohgiraffers.practice.practice1.exception.MutipleNotZeroException;

import java.security.DigestException;

public class Calculator {

    private static int result;

    public static void add(int num1, int num2) {
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    public static void minus(int num1, int num2) {
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    public static void multiply(int num1, int num2) throws MutipleNotZeroException {
        if(num1 == 0){
            throw new MutipleNotZeroException("첫번째 곱하는 정수가 0 은 허용하지 않았습니다");
        }
        if(num2==0){
            throw new MutipleNotZeroException("두번째 곱하는 정수가 0 은 허용하지 않았습니다");
        }
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    public static void divide(int num1, int num2) throws DivideNotZeroException {
        if(num2 == 0){
         throw new DivideNotZeroException("나누는 수가 0 일수는 없습니다.");
        }
        result = (num1 / num2);
        System.out.println(num1 + " / " + num2 + " = " + result);
    }

    public static void mod(int num1, int num2) throws DivideNotZeroException {
        if(num2 == 0){
            throw new DivideNotZeroException("두번째 수가 0 일수는 없습니다.");
        }
        result = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result);
    }
}

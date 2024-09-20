package com.ohgiraffers.practice.practice1;

import com.ohgiraffers.practice.practice1.exception.DivideNotZeroException;
import com.ohgiraffers.practice.practice1.exception.MutipleNotZeroException;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("다음 중에 선택해주세요 : + - * / % : ");
        char choice = sc.nextLine().charAt(0);

            switch (choice) {
                case '+':
                    Calculator.add(num1, num2);
                    break;
                case '-':
                    Calculator.minus(num1, num2);
                    break;
                case '*':
                    try {
                        Calculator.multiply(num1, num2);
                    } catch (MutipleNotZeroException e) {
                        if(num1==0){
                            System.out.println("첫번째 정수가 " + num1 + " 이라서 안됩니다");
                        }
                        if(num2==0){
                            System.out.println("두번째 정수가 " + num2 + " 이라서 안됩니다");
                        }
                        System.out.println(e.getMessage());
                    }
                    break;
                case '/':
                    try {
                        Calculator.divide(num1, num2);
                    } catch (DivideNotZeroException e) {
                        System.out.println("두번째 정수(나누는 수)가 "+ num2 + " 이라서 안됩니다.");
                        System.out.println(e.getMessage());
                    }
                    break;
                case '%':
                    try {
                        Calculator.mod(num1, num2);
                    } catch (DivideNotZeroException e) {
                        System.out.println("두번째 정수가 " + num2 + " 이라서 안됩니다.");
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("요상한 값이 들왔습니다.");
                    break;
            }
        }
    }


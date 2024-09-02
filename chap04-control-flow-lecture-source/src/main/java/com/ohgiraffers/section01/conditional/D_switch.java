package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSwitchStatement(){
        /*title. switch 문 단독 사용에 대한 흐름을 이해할 수 있다.*/
        /*comment.
        *   [표현식]
        *   switch(비교할변수){
        *       case 비교값1 : 비교값1와 일치하는 경우 실행구문; break;
        *       case 비교값2 : 비교값2와 일치하는 경우 실행구문; break;
        *       default : case 에 모두 해당하지 않는 경우 실행구문; break;
        *  switch 는 if 로 보고 case 는 else if 로 보고 default 는 else 로 볼 수도 있다.
        *
        **/
        
        /*comment.
        *  여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은
        *   if-else-if 구문과 유사하다
        *  하지만 switch 문으로 비교가 가능한 값은 정수 , 문자 , 문자열 형태의
        *  값이다. 
        *  실수와 논리는 비교할 수 없다 <- 중요
        *  또한 정확하게 일치하는 경우만 비교할 수 있으며
        *  대소비교를 할 수 없다는게 차이점이다.
        *  case 절에는 변수를 사용할 수 없다 <- 값만 비교 가능하다
        * */
        
        /*Index. 1. 문제
        *  정수 두 개와 연산 기호 문자를 입력 받아
        *  두 숫자의 연산 결과를 출력해보는 계산기 만들어 보기*/

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("두번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 ( + , - , * , / , % ) : ");
        //문자열을 charAt(인덱스)으로 문자로 만들기
        char operator = sc.next().charAt(0);
        int result = 0;

        switch (operator){
            case '+' :
                result = first+second;
                break;
            case '-' :
                result = first-second;
                break;
            case '*' :
                result = first*second;
                break;
            case '%' :
                result = first%second;
                break;

        }

        System.out.println(first + " " + operator + " " + second + " = " + result);
        
        return;
    }

    public void testSwitchVendingMachine(){

        System.out.println("=========  HiMedia 음료자판기  =========");
        System.out.println("   s.사이다 m.맥콜 n.눈의솔 c.콜라 h.환타 k.밀키스   ");
        System.out.println("======================================");
        System.out.print("음료를 선택해주세요 : ");
        
        Scanner sc = new Scanner(System.in);
        String selectDrink = sc.nextLine();
        //투입가격을 위한 변수
        int price = 0;

        switch (selectDrink){
            case "s" :
                System.out.println("사이다를 선택했습니다.");
                price = 500;
            case "m":
                System.out.println("맥콜을 선택했습니다");
                price = 300;
            case "n":
                System.out.println("눈의솔을 선택했습니다");
                price = 200;
            case "c":
                System.out.println("콜라를 선택했습니다");
                price = 100;
            case "h":
                System.out.println("환타를 선택했습니다");
                price = 400;
            case "k":
                System.out.println("밀키스를 선택했습니다");
                price = 600;
        }

        System.out.println(price + "원을 투입해주세요!!!");


        System.out.println("================================");
        System.out.println("=====HiMedia 자판기 개선해보기=====");
        System.out.println("================================");

        String orderMenu = "";

        //투입가격을 위한 변수

        switch (selectDrink){
            case "s" :
                System.out.println("사이다를 선택했습니다.");
                price = 500;
                orderMenu = "사이다";
                break;
            case "m":
                System.out.println("맥콜을 선택했습니다");
                price = 300;
                orderMenu = "맥콜";
                break;
            case "n":
                System.out.println("눈의솔을 선택했습니다");
                price = 200;
                orderMenu = "눈의솔";
                break;
            case "c":
                System.out.println("콜라를 선택했습니다");
                price = 100;
                orderMenu = "콜라";
                break;
            case "h":
                System.out.println("환타를 선택했습니다");
                price = 400;
                orderMenu = "환타";
                break;
            case "k":
                System.out.println("밀키스를 선택했습니다");
                price = 600;
                orderMenu = "밀키스";
                break;
        }

        System.out.println(orderMenu + "를 선택하셨습니다!!!");
        System.out.println(price + "원을 투입해주세요!!!");

        return;
    }

}

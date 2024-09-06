package com.ohgiraffers.practice.practice;

import java.util.Scanner;

public class Practice3{

    public static void main(String[] args) {

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력받은 검색할 문자가 배열에 몇 개 있는지를 출력하세요.
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         * 검색할 문자를 입력하세요 : l
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld 에서 찾으시는 문자 l은 3개 입니다.
         * */

        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String stringInput = scan.nextLine();
        System.out.print("검색할 문자를 입력하세요 : ");
        char charInput = scan.next().charAt(0);

        int count = 0 ;

        for(int i = 0 ; i<stringInput.length();i++){
            if(charInput==stringInput.charAt(i)){
                count++;
            }
        }

        System.out.println("입력하신 문자열" + stringInput + "에서 찾으시는 문자" + charInput + "은" + count + "개 입니다.");




    }
}

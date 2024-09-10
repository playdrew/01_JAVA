package com.ohgiraffers.practice.practice1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberManager memberManager = new MemberManager();

        while(true){
            System.out.println("=========================");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원조회");
            System.out.println("9. 프로그램종료");
            System.out.print("번호를 선택해주세요 : ");
            int no = sc.nextInt();
            switch(no){
                case 1:
                    memberManager.signup();
                    break;
                case 2 :
                    memberManager.search();
                    break;
                case 9 :
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default :
                    System.out.println("이상한 값을 입력하셨습니다.");
                    break;
            }
        }

    }
}

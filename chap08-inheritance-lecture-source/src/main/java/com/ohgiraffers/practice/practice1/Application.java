package com.ohgiraffers.practice.practice1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MemberManager memberManager = new MemberManager();
        Scanner sc = new Scanner(System.in);
        while(true){
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    memberManager.sign();
                    break;
                case 2:
                    memberManager.search();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("이상한 값을 입력했습니다");
                    break;
            }
        }

    }


}

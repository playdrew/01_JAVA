package com.ohgiraffers.section04.practice;

import java.util.Scanner;

public class RockScissorPaper2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //컴퓨터랑 가위(1) 바위(2) 보(3)
        int com = random();

        System.out.print("가위(1) 바위(2) 보(3) 중 숫자로 입력해주세요: ");
        int user = sc.nextInt();

        System.out.println("com = " + com);
        System.out.println("user = " + user);

        String result = com == 1? user == 2? "user win" : user == 3 ? "user lose" : "무승부"
                : com == 2 ? user == 1 ? "user lose" : user == 3 ? "user win" :"무승부"
                : com == 3 ? user == 1 ? "user win" : user == 2? "user lose" : "무승부"
                : "컴퓨터 오류";

        System.out.println("result = " + result);
    }

    public static int random(){
        return (int)(Math.random()*3 + 1);
    }
}


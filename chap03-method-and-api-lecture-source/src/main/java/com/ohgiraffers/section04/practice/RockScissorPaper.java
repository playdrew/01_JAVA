package com.ohgiraffers.section04.practice;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {

    public static void main(String[] args) {

        Random random = new Random();
        int computerOutput = random.nextInt(3)+1;
        System.out.println("computerOutput = " + computerOutput);

        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : (1~3)");
        int userInput = scan.nextInt();

        String play = (computerOutput==userInput) ? "비김" : (computerOutput==1 && userInput==2)||(computerOutput==2&& userInput==3)||(computerOutput==3 && userInput==1) ? "승리": "패배";
        System.out.println("play = " + play);

    }

}

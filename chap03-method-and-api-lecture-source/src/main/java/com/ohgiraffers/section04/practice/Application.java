package com.ohgiraffers.section04.practice;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int maxNumber = scan.nextInt();
//        int minNumber = scan.nextInt();
//
          RandomMaker r = new RandomMaker();
//        int random = r.randomNumber(maxNumber,minNumber);
//        System.out.println("random = " + random);
//        System.out.println("maxNumber = " + maxNumber);
//        System.out.println("minNumber = " + minNumber);

        String coinResult = r.tossCoin();
        System.out.println("coinResult = " + coinResult);
        String rockResult = r.rockPaperScissors();
        System.out.println("rockResult = " + rockResult);
    }
}

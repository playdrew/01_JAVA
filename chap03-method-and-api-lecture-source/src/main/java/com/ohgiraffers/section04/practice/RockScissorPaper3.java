package com.ohgiraffers.section04.practice;

import java.util.Scanner;

public class RockScissorPaper3 {

    public static void main(String[] args) {

        //가위 1
        //바위 2
        //보 3

        int computerOutput = random();

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        String result = (computerOutput==1) ? (userInput==2) ? "userWin" : (userInput==3) ? "userLose" : "무승부" :
                        (computerOutput==2) ? (userInput==3) ? "userWin" : (userInput==1) ? "userLose" : "무승부" : 
                                (computerOutput==3) ? (userInput==1) ? "userWin" : (userInput==2) ? "userLose" : "무승부" : "컴퓨터오류";
                


        System.out.println("computerOutput = " + computerOutput);
        System.out.println("userInput = " + userInput);
        System.out.println("result = " + result);


    }

    public static int random(){
        return (int)(Math.random()*3)+1;
    }
}


//        String result = (computerOutput==1) ? (userInput==2) ? "userWIN" : (userInput==3) ? "userLOSE" : "무승부" :
//                (computerOutput==2) ? (userInput==3) ? "userWin": (userInput==1) ? "userLOSE" : "무승부" :
//                        (computerOutput==3) ? (userInput==1) ? "userWin" : (userInput==2) ? "userLose" : "무승부"
//                : "컴퓨터오류";
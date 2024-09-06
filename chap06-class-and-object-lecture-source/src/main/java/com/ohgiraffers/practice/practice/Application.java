package com.ohgiraffers.practice.practice;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CarRacer racer = new CarRacer();

        while(true){
            System.out.println("1.시동걸기");
            System.out.println("2.가속하기");
            System.out.println("3.정지하기");
            System.out.println("4.시동끄기");
            System.out.println("5.프로그램종료");
            System.out.print("숫자를 입력해주세요 : ");
            int no = scan.nextInt();
            switch(no){
                case 1 :
                    racer.turnOn();
                    break;
                case 2 :
                    racer.stepAcc();
                    break;
                case 3 :
                    racer.stepBreak();
                    break;
                case 4 :
                    racer.turnOff();
                    break;
                case 5 :
                    System.out.println("프로그램을 종료합니다");
                    break;
                default :
                    System.out.println("이상한 값을 입력하셨습니다.");
                    break;
            }
            if(no==5){
                break;
            }
        }

    }
}

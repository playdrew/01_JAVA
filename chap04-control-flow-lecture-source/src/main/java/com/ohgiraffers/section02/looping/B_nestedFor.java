package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanTwoToNine(){
        //2에서 9단까지의 구구단 모두 출력
        //단 -> 2~9 까지 올라감
        //수 -> 1~9 까지 올라감
        // 위에 있는 for 문이 한번 작업하면 내부의 for 문이 다 반복하고 위에 있는 for 문이 하나 올리고 시작
        for(int dan = 2 ; dan<=9 ; dan++){

            //2라고 따져보자
            for(int su = 1; su<=9 ; su++){
                //단은 그대로고 su가 오르고 이 해당식이 9번 반복하고 종료하면 위의 식의 dan 이 오르고 반복문이 실행된다
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
            //한 줄 띄우기
            System.out.println();
        }
        return;
    }

    //1~3챕터의 복습 매개변수 전달인자
    public void upgradeGugudanTwoToNine(){

        for(int dan = 2 ; dan <= 9 ; dan++){
            //단은 최초로 2이고 2라는 인자를 넘겨주었습니다.
            printGugudanOf(dan);
            //한줄 띄기
            System.out.println();
        }
        return;
    }

    //int dan 이란 매개변수에 인자가 들어왔습니다.
    private void printGugudanOf(int dan) {
        // 어떤 값을 전달 받는 지 확인하는 출력문
        // 매개변수를 출력해요
        // 단이 2인 상태로 1~9 위에 가서 단이 3이 가서 1~9 단이 4가 가서 1~9 ... 단이 9까지 가서 1~9
        System.out.println("dan = " + dan);
        for(int su = 1 ; su<=9 ; su++){
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
        return;
    }

    public void printStarInputRowTime() {

        /*comment.
         *  키보드로 정수를 입력받아 해당 정수만큼
         *  한 행에 "*"을 5개씩 출력하는 구문 */

        //3
        // *****
        // *****
        // *****

        Scanner scan = new Scanner(System.in);
        System.out.print("출력 할 행 수를 입력해주세요 : ");
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
            //메소드문 복습을 위해 호출식으로 변경
            printstar(5);
            //한줄 띄우기
            System.out.println();
        }
        return;
    }

    private void printstar(int times) {
        for(int i = 1; i<=times; i++){
            System.out.print("*");
        }
        return;
    }

    public void printTriangleStars(){
        /*comment.
        *   키보드로 정수를 하나 입력 받아 해당 점수 만큼 한 행에 "*"을 행의 번호 개씩 출력
        *   ex) 정수를 입력해주세요
        *   *
        *   **
        *   ***
        *   ****
        *   *****
        * */
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int row = scan.nextInt();
        for(int i = 0; i< row; i++){
            for(int j = -1 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }

    public void printReverseTriangle(){
        /*comment.
        *  ex)정수를 입력해주세요 : 5
        *  *****
        *  ****
        *  ***
        *  **
        *  *
        * */

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int row = scan.nextInt();
        for(int i = 0; i< row; i++){
            System.out.println(" ");
            for(int j = row; i<j ; j--){
                System.out.print("*");
            }
        }

        return;

    }

    public void isoscelesTriangleStars(){

        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
    }
}


    // &&연산자 제한 범위내
    //if (x > 10) && (x < 20):
    //    # x가 10보다 크고 20보다 작은 경우 실행될 코드

    //||연산자 범위밖
    //if (x < 10) || (x > 20):
    //     # x가 10보다 작거나 20보다 큰 경우 실행될 코드


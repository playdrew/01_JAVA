package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testWhileStatement(){

        /*title. while 문 단독 사용에 대한 흐름을 이해 할 수 있다.*/

        /*comment.
         *   [while 표현식]
         *   초기식;
         *   while(조건식){
         *       조건을 만족하는 겨웅 반복 할 구문;
         *       증감식
         *   }
         * */

        /*Index. 1. 1부터 10까지 1씩 증가시키면서 i값을 출력하는 반복문*/

        // for( int i = 1; i<=10; i++ ){
        //      System.print.out(i)
        // }

        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        return;
    }

    public void whileExample1() {

        /*Index. 스캐너를 사용해서 문자열을 입력 받아 인덱스를 이용해 한 글자 씩 출력해보기*/
        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str = scan.nextLine();
        
        /*comment.
        *  charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 반환해주는 메소드
        *  length() : String 클래스에서 제공하는 메소드로 문자열을 길이를 int 형으로 반환해준다.
        * */

        System.out.println("=============== for 문 ===============");
        // ex) 안녕 -> 안 녕
        // 왜 0부터 인덱스 숫자체계는 0부터 시작하므로 0
        // String str = "안녕하세여"
        // str.length = 5 0부터 시작하므로 <=라고 했을때는 0~5까지가 됩니다 5까지는 없다 0 1 2 3 4 안 녕 하 세 요 이기 때문에요
        // StringIndexOutOfBoundsException <= 라고 했을때 생기는 문제 < > 로 하는게 좋다 0부터 시작하는 숫자체계때문에

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(i + "번째 : " + ch);
            // i 값은 0부터 5까지 들어감
        }

        System.out.println("============= while 문 ===============");

        int i = 0;
        while(i<str.length()){
            char ch = str.charAt(i);
            System.out.println(i + "번째 : " + ch);
            i++; // 이거 없으면 무한대됨 ; 이건 증감식임
        }
        return;
    }

    public void whileExample2(){
        /*comment. 중첩  while 문을 사용해서 구구단 출력 연습 */
        // dan 2~9
        // su 1~9

        //초기식
        int dan = 2;
        while (dan<10){

            //초기식 su
            int su = 1;
            while (su<10){
                System.out.println(dan + " * " + su + " = " + (dan*su));
                su++;
            }
            //한 줄 띄어 쓰기
            System.out.println();
            dan++;
        }
        return;
    }
    
}

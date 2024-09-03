package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {
    
    public void testDoWhileStatement(){
        
        /*title. do-while 문 단독 사용에 대해 이해할 수 있다.*/
        /*comment.
        *  [do-while 문 표현식]
        *  초기식;
        *  do {
        *      1회차에는 무조건 실행하고 , 이후는 조건식을 확인해서
        *      조건을 만족하는 경우에만 반복 할 구문
        *      증감식;
        *  } while (조건식) {
        * */

        // while 문은 해당하는 조건을 통과해야 반복 그러나 do-while 은 한번은 무조건 실행을 해주어요 . 코드는 위에서 아래로 한 번 실행하고 조건을 만족안하면 무조건 실행안해요
        
        do{
            System.out.println("최초 한 번 동작함");
        } while (false);

        //while(true) false 가 아니라 true 하면 unreachable statement 무한반복이 되어서 아래로 갈 수 없게 됩니다.
        System.out.println("반복문 종료 확인");

        return;
    }

    public void doWhileExample(){
        /*Index.
        *  스캐너로 문자열을 입력 받아
        *  반복적으로 출력
        *  단, exit 라고
        *  입력하게 되면 반복문을 종료 */
        // 공백인 이유는 입력도 반복으로 할 것이기 때문입니다.
        Scanner scan = new Scanner(System.in);
        String str = "";

        /*comment.
            str == "exit"을 하면 안됩니다 exit 말고 hello 쳐도 프로그램 종료됨 근데 exit 누르면 종료되게 하고 싶음 아니면 계속 입력
            문자열은 == 비교가 불가능하다. 그러면 어떻게 비교할까?
            equals() : 문자열이 같은 지를 비교해주는 메소드 */

        //문자열은 ==비교가 불가능하다 . 주소가 달라서 라고 합니다 원시자료형(int char boolean double float)과 참조자료형(String)이 있습니다.
        //String name1 = "조평훈" String name2 = "조평훈" 값은 똑같아도 주소가 달라서 동등비교가 불가합니다. 그렇다면 어떻게 비교할까요

        do{
            System.out.print("문자열을 입력해주세요 : ");
            str = scan.nextLine();
            System.out.println("str = " + str);
        } while(!str.equals("exit"));

        System.out.println("프로그램을 종료합니다");

        return;
    }

}

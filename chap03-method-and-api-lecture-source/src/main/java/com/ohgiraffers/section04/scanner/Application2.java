package com.ohgiraffers.section04.scanner;

import java.util.Random;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        
        /*title. Scanner 의 nextLine(), next() 의 차이*/
        /*comment.
        *  nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자 전 까지 읽어서
        *               문자열로 반환한다. (공백문자포함) 띄어쓰기 포함
        *  next() : 공백문자나 개행문자 전 까지를 읽어서 문자열로 반환 
        *           (공백문자 포함하지 않음)
        * */

        /*Index. 1. Scanner 객체 생성 = 사용할 준비 */
        Scanner sc = new Scanner(System.in);

        /*Index. 2. 문자열 입력 */
        // nextLine() 사용
        System.out.print("인사말을 입력해주세요 : "); // hi world 라고 적기
        String hi = sc.nextLine(); // 자료형 변수명 = 리터럴;
        System.out.println(hi); // hi world 그대로 출력된다

        // next()사용
        System.out.print("인사말을 입력해주세요 : "); // hi world 라고 적기
        String nextHi = sc.next();
        System.out.println(nextHi); // hi world 에서 hi만 출력된다. world 가 없어진 것이 아닙니다. 나중에 둥둥뜨다가 다음에 문제발생시킨다고 합니다.

    }
}

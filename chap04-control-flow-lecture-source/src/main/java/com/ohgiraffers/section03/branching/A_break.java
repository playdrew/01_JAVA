package com.ohgiraffers.section03.branching;

public class A_break {

    public void testBreakStatement(){

        /*title. break 에 대하여 이해 할수 있다.*/
        /*comment.
        *  break 문은 반복문 내에서 사용하게 된다.
        *  break 는 반복문을 빠져나올 때 사용하게 되며,
        *  반복문의 조건문 판단 결과와 상관 없이 반복문을 탈출하기 위해
        *  사용이 된다.
        *  일반적으로 if(조건식){ break;} 처럼 사용이 된다
        *  단 switch 문은 반복문이 아니지만 예외적으로 사용된다.*/
        
        /*Index. 1~100 합계를 구할 건데 , 조건절을 무한루프로 만들어보자*/
        //합계를 담을 변수선언
        int sum = 0;
        int i = 1;

        while(true){
            sum += i; // sum = sum + i ; 반복구절
            if(i==100){
                break;
            }
            i++; // 증감식
        }

        System.out.println("1부터 100까지의 합은 " + sum + " 입니다.");

        return;
    }
    
    public void breakGugudan(){
        /*Index.
        *  구구단 2~9 단 까지 출력
        *  단, 각 단의 수가 5보다 큰 경우에는 출력을 생략한다
        *  ex) 2*1 , 2*2 ~~~ 2*5 끝
        * */

        /*comment.
        *   break 문은 모든 반복문을 종료시키는 게 아닌,
        *   자신에게 가장 인접한 반복문을 종료시킨다.*/
        for(int dan = 2; dan<10 ; dan++){
            for(int su = 1 ; su < 10 ; su++ ){
                if(su>5){
                    break;
                    //continue; if(su==5)
                    //구구단을 출력하고 싶은데 5만 빼고 싶어요 break;는 완전 반복문나가는데 5만 빼고 6 7 8 9 는 계속 된다.
                }
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
            System.out.println();
        }
        return;
    }
}

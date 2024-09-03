package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testContinue(){
        /*title. continue 문 사용에 대한 흐름을 이해할 수 있다.*/
        /*comment.
        *  continue 문도 break 와 마찬가지로 반복문 내에서 사용한다.
        *  break -> 반복문을 탈출(종료) 하지만
        *  continue 는 중간에 멈추고 다시 증감식으로 넘어가게 된다.
        *  일반적으로 if(조건식){continue;}처럼 사용된다.
        *  보통 반복문 내에서 특정 조건에 대한 예외를 처리할 때
        *  사용이 된다.
        * */

        /*Index. 1부터 100사이의 3의 배수이면서 4의 배수인 값 출력 : 3와4의 공배수*/

        for(int i = 1; i<101 ; i++){

            //if(i%3 == 0 || i%4 == 0) 3의 배수도 출력 4의 배수도 출력
            //if(i%3 == 0 && i%4 == 0) 3과 4의 공배수 출력
            if(i%3 == 0 && i%4 == 0){
                System.out.println(i);
            }else{
                continue;
                // break; 바로 끝남 1은 3의 배수도 4의 배수도 아니라 else 구문을 만나 break 가 되어 해당 반복문을 바로 종료 아무것도 종료안함
                // 3과 4의 공배수일 경우에 12같은 것 12만 찍고 끝남
            }
        }
        return;
    }

    public void testContinueStatement2(){
        /*Index.
           2~9 단의 구구단을 출력 할 것이다.
           단, 수가 5인 경우는 경우는 출력하지 않을 것이다.
           */
        for(int dan = 2 ; dan<10 ; dan++){

            for(int su = 1; su < 10 ; su++){

                if(su==5){
                    //break; 2*1...5 3*1...5 4*1...5 이렇게 실행된다.
                    continue; // 5곱한 값만 없에고 내부 for 문의 su는 계속 진행된다 break 는 아니다. su 가 5가되면 내부 for 문은 완전중단된다.
                }
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
            //한 줄 띄어쓰기
            System.out.println();
        }
        return;
    }

    public void test1(){
        /*Index.
        *  구구단 2~9단을 출력 할 것이다.
        *  단, 각 단의 수(su)가 짝수인 겨웅에는 출력을 생략
        *  ex) 2*1 2*3 ... */

        for(int dan = 2; dan<10 ; dan++){
            for(int su = 1 ; su<10 ; su++){

                if(su%2==0){
                    continue;
                }
                System.out.println(dan + "*" + su + "=" + (dan*su));
            }
            System.out.println();
        }


    }

    public void test1_1(){
        int dan = 2;
        while(dan<10){
            int su = 1;
            while(su<10){
                su++;
                if(su%2==0){
                    continue;
                }
                System.out.println(dan + "*" + su + "=" + (dan*su));
            }
            System.out.println();
            dan++;
        }
    }
}

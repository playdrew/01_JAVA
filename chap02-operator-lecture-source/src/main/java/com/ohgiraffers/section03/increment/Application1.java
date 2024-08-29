package com.ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        /*title. 증감연산자에 대해 이해할 수 있다.*/
        /* comment
        *   증감연산자
        *   피연산자 앞 or 뒤에 사용이 가능하다
        *   '++' : 1증가
        *   '--' : 1감소
        *   */

        /*index. 1. 증감연산자를 단항으로만 사용*/
        /*comment. 단항으로 사용될 때는 1증가 , 1감소의 의미*/

        int num = 20;
        System.out.println("num = " + num);

        num++;

        System.out.println("num = " + num);

        ++num;

        System.out.println("num = " + num);

        --num;

        System.out.println("num = " + num);

        /*index. 2. 증감연산자를 다른 연산자와 함께 사용*/
        /*comment.
        *  주의사항.
        *  ++ , -- 증감연산자는 다른 연산자와 함께 사용할때 의미가 달라진다.
        *  뒤에 있는 ++ 는 다른 연산자와 만나면 다른 연산자부터 작용합니다.
        *  앞에 있는 ++ 는 다른 연산자와 만나면 상관없이 ++하고 연산합니다.*/
        
        /*comment.
        *  다른 연산자와 함께 사용할때 증감 연산자의 의미
        *  '++num' : 피연산자의 값을 먼저 1 증가시킨 후 다른 연산 진행
        *  'num++' : 다른 연산을 먼저 진행한 후에 마지막에 피연산자 값을 1 증가*/

        int firstNum = 20;
        int result1 = firstNum++ * 3;
        System.out.println("result1 = " + result1);
        System.out.println("firstNum = " + firstNum);

        //++가 뒤에 있으면 연산먼저하고 더함
        //++가 앞에 있으면 더하기+1먼저하고 더함


        int secondNum = 20;
        int result2 = ++secondNum * 3;
        System.out.println("result2 = " + result2);
        System.out.println("secondNum = " + secondNum);

        //++가 뒤에 있으면 연산먼저하고 더함
        //++가 앞에 있으면 더하기+1먼저하고 더함

        /*comment 대입연산자'='를 만나서 =대입연산자가 끝난후에 ++가 작용하므로 result3의 값은 변하지 않습니다.
        *  '='도 연산자로 칩니다. */
        int thirdNum = 20;
        int result3 = thirdNum++;
        System.out.println("result3 = " + result3);
        System.out.println("thirdNum = " + thirdNum);
        
        
        

    }
}

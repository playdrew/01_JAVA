package com.ohgiraffers.section02.assginment;

public class Application1 {

    public static void main(String[] args) {

        /*title. 대입연산자와 산술 복합 대입연산자를 이해할 수 있다.*/
        /*comment
        *  int x = 10 오른쪽은 값 왼쪽은 공간
        *  '=' 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
        *  '+=' 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자의 대입
        *  '-='
        *  '*='
        *  '/='
        *  '%='
        * */

        int num = 12;
        System.out.println("num = " + num);

        num = num + 3;
        System.out.println("num = " + num);

        num += 3; // num = num + 3;
        System.out.println("num = " + num);

        num -= 5; // num = num - 5;

        System.out.println("num = " + num);

        num *= 2;

        System.out.println("num = " + num);

        num /= 2;

        System.out.println("num = " + num);

        // '-=' '=-'
        // 주의사항 작성 순서가 바뀌게 되면 -5 숫자를 num 공간에 대입
        num =- 5;

        System.out.println("num = " + num);
    }
}

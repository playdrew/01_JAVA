package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        /* main 은 어떻게 동작할까 ? static 정적이 가능하게 해줌니다. 동적은 코드를 만나는 순간
        정적은 어플리케이션시작하자마자 static 키워드는 동작전에 다 수집해놓아요. 동적으로 코드가 내려가기 전에
        static 키워드들을 먼저 셋팅해놔요.매개변수 , 전달인자 , 리턴*/

        /*title. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해할 수 있다.*/
        /*comment.
        *  매개변수와 리턴값 복합응용
        *  매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여
        *  간단한 계산기를 만들어보기 */

        /*comment.
           더하기 메소드 , 빼기 메소드 , 곱하기 메소드 , 나누기 메소드
           해당하는 메소드들에게 2개의 정수를 넘겨 줄 것이다. */

        int first = 20;
        int second = 10;

        //공간을 만들어두어서 두가지의 정수값을 넣어두어야해요
        //리터럴로 해도 되지만 변수값을 넣었습니다.
        Application7 app7 = new Application7();
        app7.plusToNumber(first, second); // 30과 똑같은 의미 30이라는 정수형태의 리터럴이 된것
        System.out.println(app7.plusToNumber(first, second));

    }

    //공간을 만들어두어서 두가지의 정수값을 넣어두어야해요
    public int plusToNumber(int first , int second) {
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        return first + second;
    }

    public int minusToNumber(int first , int second){
        return first - second;
    }

    public int multiplyToNumber(int first , int second){
        return first * second;
    }

    public int divideToNumber(int first , int second){
        return first / second;
    }
}

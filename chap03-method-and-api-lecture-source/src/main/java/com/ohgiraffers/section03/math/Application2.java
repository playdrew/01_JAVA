package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {

        /*title. random() 사용해서 사용자 지정 범위의 난수 발생*/
        /*comment.
        *  난수의 활용
        *  Math.random()을 이용하게 되면 0부터 1전 까지의 실수
        *  값을 반환해준다.
        *  근데 우리는 필요에 따라서 정수를 출력하고 싶을 수 있고,
        *  예를 들어 8 ~ 20 사이의 난수 등등 이렇게 하고 싶다.
        * */

        /*comment.
        *  원하는 범위의 난수를 구하는 공식
        *  (Math.random())호출하면 0부터 1까지의 결과값이 나오게 됩니다.
        *  (int)(Math.random()*구하려는 난수의 개수) + 구하려는 난수의 최솟값
        * */

        /*Index. 1. 0~9까지의 난수 발생*/

        // math.random 은 값은 더블인데 공간은 int 라서 오류 그래서 cast 연산자로 (int)
        int random = (int)(Math.random()*10)+0;
        System.out.println("random = " + random);

        // 1 ~ 10 까지

        int random2 = (int)(Math.random()*10)+1;
        System.out.println("random2 = " + random2);

        // 10 ~ 15

        int random3 = (int)(Math.random()*6)+10;
        System.out.println("random3 = " + random3);

        // -128 ~ 127

        int random4 = (int)(Math.random()*256)-128;
        System.out.println("random4 = " + random4);

    }
}

// math.random 에서 random 은 static

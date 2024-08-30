package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        /*title. java.util.Random 클래스를 사용해서 난수 발생*/
        /*랜덤이라는 클래스 안에 매소드는 static 이 안붙었다.*/
        /*Math 클래스는 모든 걸 가지고 있다면 random 클래스는 특화시킨 느낌*/
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);
        
        /*comment. 
        *  random.nextInt(구하려는 난수의 개수) + 구하려는 난수의 최솟값
        *  */
        
        //nextInt() nextInt(int bound) bound 는 범위가 지정
        //bound 는 10이라고 값을 전달할 수 있습니다.
        //메소드이름이 nextInt 로 중복되는데 나중에함
        //특화된 이유 = 형변환을 구지 안해도됨


        //1~10
        int randomNumber1 = random.nextInt(10)+1;
        System.out.println("randomNumber1 = " + randomNumber1);

        //10~15

        int randomNumber2 = random.nextInt(5)+10;
        System.out.println("randomNumber2 = " + randomNumber2);

        //-127 ~ 128
        int randomNumber3 = random.nextInt(256)-127;
        System.out.println("randomNumber3 = " + randomNumber3);

    }
}

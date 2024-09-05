package com.ohgiraffers.section02.copy;

import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {

        /*title. 깊은 복사에 대해 이해할 수 있다.*/

        //얕은 복사를 했을때는 두가지의 변수(주소1)가 하나의 공간을 바라보는 구조
        //깊은 복사란 주소를 복사하는 것이 아니라 값만 복사하는 것을 의미합니다.
        //깊은 복사는 한 인덱스의 값(원본,카피본)을 수정했더라도 얕은 복사와 달리 값이 서로 연동되지 않습니다.
        //얕은 복사는 같은 주소의 2개가 한 공간바라보는 느낌?
        //깊은 복사는 다른 주소의 2개가 복사되서 각자 값만 같은 것의 공간들을 바라 보는 느낌


        /*comment.
        *  깊은 복사는 heap 에 생성된 배열이 가지고 있는 값을
        *  또 다른 배열에 복사를 해둔 것이다.
        *  서로 같은 값을 가지고 있지만 , 두 배열은 서로 다른 배열
        *  때문에 원본  또는 복제본을 수정하더라도
        *  서로 영향을 미치지 않는다.*/

        /*comment.
        *   깊은 복사를 하는 방법은 4가지가 있다.
        *   1.for 문을 이용한 동일한 인덱스의 값 복사
        *   2.Object 의 clone() 메소드를 이용한 값 복사
        *   3.System. 의 arraycopy() 메소드를 이용한 값 복사
        *   4.Arrays 의 copyOf 메소드를 이용한 값 복사
        *  이 중 가장 높은 성능을 보이는 것은 순수 배열의 복사를 위해
        *  만들어진 arraycopy() 메소드 이며 ,
        *  가장 많이 사용되는 방식은 copyOf()메소드이다.
        *  clone() 은 이전 배열과 같은 배열 밖에 만들지 못하는 특징이 있으며,
        *  그 외 3가지 방법은 복사하는 배열의 길이를 조절할 수 있다는 장점이 있다.
        * */

        int[] originArr = new int[]{1,2,3,4,5};

        print(originArr);
        
        /*Index.1. for 문을 이용한 인덱스 값 복사*/
        
        int[] copyArr1 = new int[10];
        ///1,2,3,4,5 라는 값을 copyArr 에다가 넣을 거에요
        
        for(int i = 0 ; i< originArr.length; i++){
            //왼쪽은 공간 오른쪽은 값
            copyArr1[i] = originArr[i];
        }

        print(copyArr1);

        /*Index. 2. Object 의 clone() 을 이용한 값 복사 */
        
        //Object 앞이 대문자죠 . 클래스입니다.
        //해당하는 클래스가 가진 매소드 Object는 생략이 되어있어요. 클래스.메소드명이잖아요
        int[] copyArr2 = originArr.clone();
        //첫번째것과 세번째것을 확인해요. hashcode()주민번호가 달라요
        //클론은 단점이 동일하게 원본배열의 size 밖에 못해요
        //originArr이 Object
        print(copyArr2);
        
        /*Index. 3. System 의 arraycopy() 를 이용한 복사 */
        
        int[] copyArr3 = new int[10];
        
        /* 첫번째 전달인자
        *  1. 원본배열
        *  2. 원본배열에서 복사를 시작 할 인덱스
        *  3. 복사본 배열(copyArr3)
        *  4. 대상배열에서 복사를 시작 할 인덱스 (부터 시작을 하겠다)
        *  5. 복사할 길이*/
        System.arraycopy(originArr,0,copyArr3,3,originArr.length);

        print(copyArr3);

        /*Index. 4. Arrays 의 copyOf()메소드를 이용한 복사*/
        /* 첫번째 전달인자
        *  1. 복사하고 싶은 배열(orginArr)
        *  2. 만들고 배열의 길이*/
        int[] copyArr4 = Arrays.copyOf(originArr,8);
        print(copyArr4);

    }

    public static void print(int[] 전달받은배열을저장할매개변수){

        System.out.println("전달받은 배열의 hashcode() : " + 전달받은배열을저장할매개변수.hashCode() );

        for(int i = 0 ; i<전달받은배열을저장할매개변수.length ; i++){
            System.out.print(전달받은배열을저장할매개변수[i] + " ");
        }

        System.out.println();

        return;
    }
}

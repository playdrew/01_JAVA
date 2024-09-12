package com.ohgiraffers.section01.string;

import java.util.StringTokenizer;

public class Application3 {

    public static void main(String[] args) {

        /*title. 문자열 분리에 대해 이해할 수 있다.*/

        /*comment.
        *   split() : 정규표현식을 이용해서 문자열을 분리한다.
        *             공백 문자열도 포함한다.
        *             정규표현식은 속도가 느리다는 단점을 가지고 있고
        *             자바에서는 다루지 않고 자바스크립트에서 간단히 볼 예정이다.
        *   StringTokenizer
        *   -> 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
        *      공백 문자열을 무시할 수 있다.
        *      정규표현식을 사용하지 않아 split() 보다 속도명으로 빠르다
        *      구분자를 생략하는 경우에는 공백을 기준으로 구분을 한다.
        * */

        //split 은 공백도 문자열로 따집니다.
        //문자열비교를 백엔드까지 끌고와서 할 필요없이 프론트엔드에서 해결
        
        // 사번/이름/주소/부서
        String employee1 = "100/홍길동/서울/영업부";
        String employee2 = "200/유관순//총무부";      // 주소 없음
        String employee3 = "300/이순신/경기도/";      // 부서 없음
        
        // 슬래쉬를 기준으로 구분을 하고 싶은 거에요
        // 슬래쉬를 기준으로 나눠줘
        // regex 정규표현식의 약자
        String[] emp1Arr = employee1.split("/");
        String[] emp2Arr = employee2.split("/");
        String[] emp3Arr = employee3.split("/");

        for(int i = 0 ; i<emp1Arr.length ; i++){
            System.out.println(emp1Arr[i]);
        }

        for(int i = 0 ; i<emp2Arr.length ; i++){
            System.out.println(emp2Arr[i]);
        }

        for(int i = 0 ; i<emp3Arr.length ; i++){
            System.out.println(emp3Arr[i]);
        }

        //전달인자 (분리하고 싶은 문자열, 구분 기호)
        StringTokenizer st1 = new StringTokenizer(employee1,"/"); // 세가지 두가지를 초기할 수 있는 생성자가 있어요 delim 기호뜻이며 어떤 걸 기준으로 나눌것인지
        StringTokenizer st2 = new StringTokenizer(employee2,"/");
        StringTokenizer st3 = new StringTokenizer(employee3,"/");
        
        //StringTokenizer 는 인덱스체계가 아니다. for 문 사용불가
        //delim 을 기준으로 토큰을 가지고 있어요 사번/이름/주소/부서
        // -> 100
        // 홍길동
        // 서울
        // 영업부 hasMoreToken는 해당하는 공간에 값이 있는지 확인해요
        // nextToken 은 마우스커서로 바도 돼요 -> 이 내려가요
        
        
        //hasMoreTokens : 더 많은 토큰을 가지고 있냐 있으면 while 로  true 없으면 false 
        while(st1.hasMoreTokens()){
            //nextToken 있으면 토큰을 반환하라
            System.out.println("st1 : " + st1.nextToken());
        }

        while(st2.hasMoreTokens()){
            System.out.println("st2 : " + st2.nextToken());
        }

        while(st3.hasMoreTokens()){
            System.out.println("st3 : " + st3.nextToken());
        }
        
        //StringTokenizer 는 공백을 무시
        //문자열을 분리하거나 검사할때 아이디 패스워드 검사할때 쓰는데 프론트엔드에서 사용
        //String 클래스는 불변인데 가변이있어요 공간의 값을 수정해주는 것 
    }
}

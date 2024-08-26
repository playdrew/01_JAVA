package com.ohgiraffers.section02.variable;

public class Application3 {
    
    public static void main(String[] args) {
    // tap 키 4칸의 띄어쓰기
    // 수업목표. 변수의 명명 규칙에 대해 이해할 수 있다.
        
        /*
        * 필기.
        *  변수의 명명 규칙
        *  1. 컴파일 에러를 발생시키는 규칙
        *  2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적 규칙
        * */
        
        /*목차. 1. 컴파일에러를 발생시키는 규칙*/
        /*목차. 1-1. 동일한 범위 내에서 동일한 변수명은 가질 수 없다*/

        int age = 20;
        //int age = 30; 동일한 변수명을 가지기 때문에 에러가 발생한다.
        //런타임에러 : 프로그램 동작중 생기는에러

        /*목차. 1-2. 예약어 사용이 불가능하다.*/
        //int true = 20; true는 예약어기 때문에 사용할 수 없다
        //int for
        //int if 쉽게 구분하는 방법은 글자의 색이 다르다.

        /*목차 1-3. 변수명은 대소문자를 구분한다. */
        int AGE = 20;
        int True = 30;
        //age AGE 임에도 불구하고 에러가 발생하지 않는다.
        //위에서 우리가 만든 age와는 다른 녀석이다.
        //true 와 True는 다른 녀석이다. 예약어만 아니면 변수명으로 사용가능하다.

        /*목차. 1-4. 변수명은 숫자로 시작할 수 없다.*/
        //int 1age = 50;
        int age1 = 50;
        //처음시작만 숫자가 아니면 된다.

        /*목차. 1-5. 특수기호는 '_'와 '$'만 사용이 가능하다.*/

        //int sh@op = 20;
        int _age2 = 20;
        int $hi = 100;

        /*목차. 2. 컴파일에러는 발생시키지 않지만 개발자들끼리의 규칙!!*/
        /*목차. 2-1. 변수명의 길이는 제한이 없다. 하지만 적당히 하자.*/
        /*목차. 2-2. 변수명이 합성어(2개 단어 합쳐진) 경우 첫단어는 소문자
        * , 두번째 단어는 대문자로 시작한다. */

        int maxAge = 20;
        int minAge = 10;

        /*카멜케이스라고 부른다.*/
        /*max_age 이건 스네이크케이스라고 부른다.*/

        String user_name = "조평훈"; //java 에서는 하지 않는다
        String userName = "조평훈"; // 이게 java 에서는 옳바른 표기법이다.

        /*목차. 2-3. 변수명을 한글로 지어도 에러는 없다. 하지만 권장하지 않는다*/

        int 나이 = 10;

        /*목차. 2-4. 변수안에 저장된 값이 어떤 의미를 가지는 지 명확히 표현하자!!*/
        String s = "조평훈"; //비추천
        String name = "조평훈"; //추천

        /*목차. 2-5. 전형적인 변수 이름이 있다면 가급적 사용하자.*/
        int sum = 0 ;
        int max = 100;
        int min = -10;
        int cnt = 1;

        /*목차. 2-6. 명사형으로 되도록 작성하면 좋다.*/
        String goHome;
        String home;

        /*목차. 2-7. boolean 형들은 의문문으로 가급적이면 긍정형태로 작성한다.*/
        boolean isDead = true; // 비추천
        boolean isAlive = true; // 이런 방식을 사용

        //shift f6 = 패키지 이름바꾸기 
    }
}

package com.ohgiraffers.section02.package_and_import;

public class Application1 {

    public static void main(String[] args) {

        /*title. 패키지에 대해 이해할 수 있다.*/
        /*comment.
        *   패키지란?
        *   서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음(그룹)으로
        *   단위를 구성하는 것을 의미한다.
        *   같은 패키지 내에서는 동일한 이름의 클래스르르 만들 수 없지만,
        *   패키지가 다르다면 동일한 이름을 가진 클래스를 만들 수 있다.
        *   우리가 지금까지 method 패키지에서 Calculator 를 클래스를 호출 할 때
        *   com.ohgiraffers ~~ 를 생략해도 된 이유는 같은 패키지에 있기 때문에
        *   가능했던 것이다.
        * */

        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(30,20);
        System.out.println("30과 20중에 더 작은 값 : " + min);

        /*
        * static 메소드 호출해보기*/

        // static 메소드 호출방법
        // 클래스명.메소드명()

        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(30,20);
        System.out.println("30과 20중에 더 큰 값 : " + max);


    }
}

// 이름이 똑같은데 다른 걸 어떻게 구분하냐..
// 조평훈.txt 조평훈.txt 같이 있을 순 없지만 새폴더만들어서 조평훈.txt 하면 된다.
// application 도 이름이 같은 경우가 있는데 왜 되냐면 패키지 이름까지 포함되었기 때문이라고 합니다.
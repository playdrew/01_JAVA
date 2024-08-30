package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /*title. Scanner 를 이용해서 값 입력 해보기*/
        
        /*Index. 1. Scanner  클래스 사용 할 준비*/
        Scanner sc = new Scanner(System.in);

        /*comment. ln의 의미는 개행 (줄바꿈 enter)의 의미입니다*/
        System.out.println("안녕");
        System.out.print("나는");
        System.out.println("조평훈이야");

        /*Index. 2-1. 문자열 입력받기*/
        System.out.println("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("제 이름은 " + name + " 입니다.");

        /* ln의 의미 개행 줄을 하나 건너뛰는 것을 의미합니다. ln 은 enter */

        /*Index. 2-2 정수형 값 입력받기*/
        /*comment. nextInt() : 입력받은 값을 int 형으로 반환해준다.
        **/

        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "세 입니다.");
        // 큰 값을 적을때 InputMismatchException 이 뜹니다. 오류찾을땐 가장 상단에가 오류의 원인입니다.

        /*Index. 2-3 실수형 값 입력받기*/

        System.out.print("키를 입력해주세요 : ");
        double height = sc.nextDouble();
        System.out.println("입력하신 키는 : " + height + "(cm) 입니다.");

        /*Index. 2-4. 논리형 값 입력 받기*/

        System.out.print("참과 거짓 둘 중 하나를 true or false 로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력한 논리 값은 : " + isTrue + "입니다.");

        /*Index. 2-5. 문자형 값 입력 받기*/
        /*comment.
        *  아쉽게도 문자를 직접 입력 받는 기능은 없다.
        *  따라서 문자열로 입력을 받은 후, 입력 받는 문자에서
        *  원하는 순번의 문자를 분리해서 사용을 해야한다.
        *  charAt(int index)이라는 메소드에 / 를 사용해서 문자열을 분리할 수있다.
        *              정수형으로 값을 넘기게 되면 문자열에서 해당 하는 번호를 가진
        *              문자를 반환해주는 기능을 한다.
        *  index 숫자체계를 컴퓨터에서 정말 많이 쓰인다.
        *   이 친구의 특징은 0부터 시작한다는 것입니다.
        **/

        //문자가 모인게 문자열 문자를 입력받은 후 하나하나하나띄어낼꺼에요

        sc.nextLine(); // 이거 없으면 아래 문장 에러남
        System.out.println("아무 문자나 입력해주세요 : ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다.");

    }
}




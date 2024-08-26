package com.ohgiraffers.section02.variable;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표 : 변수의 사용 목적에 대해 이해할 수 있다*/
        /*
        * 변수의 사용목적
        * 1. 값의 의미를 부여하기 위한 목적
        * -의미 전달이 쉬워야 코드를 읽기 쉬워지고 협업 및 유지보수에 편해진다.
        * 2. 한 번 저장해둔 값을 재사용하기 위한 목적
        * -변수를 이용하여 코드를 작성하면 , 값을 변경할때도
        * -보다 편하게 변경할 수 있다
        * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.
        * -중요. 변하는 값을 저장하기 위한 공간!!!!!!
        * */

        /*목차 1. 값에 의미를 부여하기 위한 목적 */

        System.out.println("=========값의 의미부여 테스트=========");
        System.out.println("보너스를 포함한 급여 : " + (1000000+200000) + "원");

                int salary = 1000000;
                int bonus = 200000;
                
                /*
                * 백만원과 이십만원에 의미가 부여됨*/
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        /*목차 2. 한번 저장해둔 값을 재사용하기 위한 목적 */

        System.out.println("=========변수의 저장한 값 재사용 테스트=========");
        //10명의 고객에게 100포인트 지급하는 출력문을 만들어보자.
        System.out.println("1번 고객에게 100포인트 지급하였습니다");
        System.out.println("2번 고객에게 100포인트 지급하였습니다");
        System.out.println("3번 고객에게 100포인트 지급하였습니다");
        System.out.println("4번 고객에게 100포인트 지급하였습니다");
        System.out.println("5번 고객에게 100포인트 지급하였습니다");
        System.out.println("6번 고객에게 100포인트 지급하였습니다");
        System.out.println("7번 고객에게 100포인트 지급하였습니다");
        System.out.println("8번 고객에게 100포인트 지급하였습니다");
        System.out.println("9번 고객에게 100포인트 지급하였습니다");
        System.out.println("10번 고객에게 100포인트 지급하였습니다");
        
        //100이 반복되니 100이라는 숫자를 변수로 지정
        //'='은 대입연산자. 왼쪽은 공간 오른쪽은 값
        int point = 100;

        System.out.println("1번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("6번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("7번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("8번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("9번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("10번 고객에게 " + point + "포인트를 지급하였습니다.");
        
        /*목차 3. 시간에 따라 변경되는 값을 저장하고 사용할 수 있다. */

        System.out.println("=========변수에 저장된 값 변경 테스트==========");
        
        int sum = 0;
        //int 라는 공간에 sum이라 이름을 지었고 0을 넣음
        //soutv 는 가장 가까운 변수를 출력해주는 기능
        System.out.println("sum = " + sum);

        //공간이 아니라 대입연산자 오른쪽은 값
        sum = sum + 10;
        System.out.println("sum 에 10을 더한 두번째 sum = " + sum);

        sum = sum + 10;
        System.out.println("sum 에 10을 더한 세번째 sum = " + sum);
        //시시때때로 바뀌는 수를 변수공간에 저장을 함

    }
}

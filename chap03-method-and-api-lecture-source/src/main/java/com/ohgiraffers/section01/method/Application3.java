package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

        /*title. 메소드의 전달인자와 매개변수에 대해 이해하고 활용할 수 있다.*/

        /*comment.
        *  전달인자(argument)와 매개변수(parameter) 둘이 세트입니다. 자료형을 맞춰주어야합니다.
        *  지금까지 우리가 배운, 즉 사용한 변수는 지역변수에 해당합니다. 같은 변수이나 지역변수는 main 내부에서 사용하는 것입니다.
        *  전달인자는 리터럴 값 그자체입니다. 매개변수는 공간의 느낌이 강합니다.
        *  */

        /*comment.
        *   변수의 종류
        *   1.지역변수
        *   2.매개변수
        *   3.전역변수
        *   4.클래스(static)변수
        *  똑같이 값을 넣는 공간이나 어떻게 쓰이냐에 따라 명칭만 달리하는 것입니다.
        * */

        /*comment.
        *  지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능해요.
        *  이것을 지역변수의 스코프(범위)라고 합니다.
        *  이제 만약 다른 메소드 끼리 값을 공유해야 하는 경우가 생기는 경우
        *  메소드 호출 시에 사용하는 괄호 ex) methodA()를 이용하여 값을
        *  전달할 수 있다.
        *  이 때 전달하는 값을 전달인자(argument) 라고 부르고
        *  메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를
        *  매개변수(parameter)라고 부른다*/

        /*Index. 2. 만든 메소드 호출해보기*/
        Application3 app3 = new Application3();
        app3.testMethod(40);
        //app3.testMethod("40"); 매개변수공간은 int 형이지만, 인자를 String 으로 보내서 오류발생
        //app3.testMethod(20,30,40); 준비된 공간이 1개 뿐이지만 , 인자를 3개 보냈기 때문에 오류발생
        //app3.testMethod(); int test=; 느낌 매개변수는 선언되어있지만 인자로 값을 전달하지 않으면 오류발생

        /*Index. 3. 변수에 저장한 값을 전달 테스트 */
        /*comment. 변수에 저장한 값을 전달할 수 있다.*/

        int age = 20;
        app3.testMethod(age);

        /*Index. 4. 자동형변환을 이용하여 값 전달 테스트 */
        /*작은 byte 값을 큰 int 에 써서 자동형변환이 된것*/
        byte bNum = 10;
        app3.testMethod(bNum);

        /*Index. 5. 강제형변환을 이용하여 값 전달 테스트*/
        /*큰 long 값을 작은 int 에 써서 강제형변환시켜야함*/
        long lNum = 30;
        app3.testMethod((int)lNum);

        /*Index. 6. 연산 결과를 이용하여 값 전달 테스트*/

        app3.testMethod(age*3);
    }

    /*Index. 1. 호출할 메소드 만들기*/

    public void testMethod(int test) {

        System.out.println("testMethod 호출됨..");

        System.out.println("제 나이는 " + test + "세 입니다.");

        System.out.println("testMethod 종료됨..");

    }
}

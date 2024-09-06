package com.ohgiraffers.section01.user_type;

public class Application {

    public static void main(String[] args) {

        /*title. 클래스가 무엇인지 이해할 수 있다.*/

        /*comment.
        *   지금까지 우리는 자바에서 제공하는 자료형을 다루어 보았다.
        *   ex)int char String double[] 등등
        *   회원 정보를 관리하기 위해 (아이디 비밀번호 이름 나이 성별 취미들)
        *   지금까지 배운 내용으로 값을 넣고 출력을 해보자.
        **/
        

        /*Index. 1. 변수를 이용한 회원 관련 데이터 처리*/
        //회원에 대한 정보를 각기 다른 자료형에 저장
        String id = "user01";
        String pwd = "pass01";
        String name = "조평훈";
        int age = 20;
        char gender = '남';
        String[] hobbies = new String[]{"야구","코딩","누워있기"};
        //new 라는 키워드를 만났다는 것은 주소를 가지고 있다는 것이고 실제 해당 하는 값은 따로 있어요.

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        //System.out.println("hobbies = " + hobbies);
        System.out.print("hobbies : ");
        for(int i = 0 ; i< hobbies.length;i++){
            System.out.print(hobbies[i]+" ");
        }
        System.out.println();

        /*comment.
        *   이렇게 각기 다른 변수로 데이터를 관리하게 되면 여러 가지 단점이 있다.
        *   1. 변수명을 다 알아야 한다
        *   2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 한다면
        *      너무 많은 값을 전달인자로 보내야 해서 한 눈에 안 들어온다.
        *   3. 리턴은 1개의 값만 가능하기 때문에 회원 정보를 묶어서
        *      리턴 값으로 사용할 수 없다 why? 서로 다른 자료형이기 때문에!!
        *   */

        //02. print(id,pwd,name,age,gender,hobbies) 이렇게 많은 전달인자를 보내야 하고 자료형이 헷갈립니다.
        //이들을(id,pwd,name,age,gender,hobbies) 하나로 묶어서 멤버라는 변수로 퉁치자는 것입니다.
        //03. 메소드 자료형을 return 이 있게 한다면 void 가 아니면 어떤 자료형으로 return 을 해줘야 할까요

        /*Index. 2. 사용자 정의의 자료형 사용하기*/
        /*Index. 2-1. 변수 선언 및 객체 생성*/
        /*comment.
        *   클래스 변수명 = new 클래스();
        *   -위의 구문은 객체(instance)를 만드는 구문이다.
        *   -ex) int[]arr = new int[5];
        *   클래스는 사용자 정의의 자료형이 되며, 클래스가 가지고 있는
        *   변수 or 메소드를 사용하기 위해서는 new 할당 연산자로
        *   heap 메모리 공간에 할당을 해야한다.
        *   */
        
        //객체를 만든것 
        Member member = new Member();
        
        /*Index. 2-2. 생성된 인스턴스(객체)의 초기값 확인하기*/
        /*comment.
        *   우리가 Member 클래스에 작성한 전역변수(필드)에 접근하기 위해서는
        *   레퍼런스변수명.변수명 <- 이 방법으로 접근 할 수 있다.
        *   '.' 은 참조연산자라고 하는데, 레퍼런스 변수가 참조하고 있는 (주소를 가르키는)
        *   곳으로 접근한다 라는 의미이다.
        *   */
        
        //주소를 가지고 있는 레퍼런스 변수명 (.)하면 실제 값이 있는 곳으로 날라가요

        System.out.println("member.id : " + member.id);
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.println("member.hobbies : " + member.hobbies);

        //힙이란 메모리 공간은 값이 없을 수가 없어요. 공간만 만들었는데 값이 나온다는 것은 jvm 이 설정한 값으로 메꿔지는 거에요

        /*Index. 2-3. 필드(전역변수)에 접근해서 변수처럼 사용해보기*/

        member.id="user02";
        member.pwd="pass02";
        member.name="조평순";
        member.age=20;
        member.gender='여';
        member.hobbies = new String[]{"야구","코딩","누워있기"};

        System.out.println("변경 후 id = " + id);
        System.out.println("변경 후 pwd = " + pwd);
        System.out.println("변경 후 name = " + name);
        System.out.println("변경 후 age = " + age);
        System.out.println("변경 후 gender = " + gender);
        System.out.print("변경 후 hobbies = ");
        for(int i = 0 ; i< member.hobbies.length ; i++){
            System.out.print(member.hobbies[i] + " ");
        }

        // 멤버라는 변수로 하나로 묶었다 서로 다른 자료형을 배열과 달리 다른 자료형들의 값을 하나로 묶을 수 있다.
        // 캡슐화란 감싸는 것을 의미해요. 멤버에 해당하는 변수들을 안전하게 감싸는 요상한 값을 넣을 수 없게끔


    }
}

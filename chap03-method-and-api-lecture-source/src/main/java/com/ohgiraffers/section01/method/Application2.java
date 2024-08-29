package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {

        /*title. 다른 흐름의 메소드 호출*/

        /*Index. 1. methodA() methodB() methodC() methodD() 차례로 작성*/
        /*Index. 2. 작성 후 메소드 호출 확인과 실행 종료 출력 구문을 작성*/
        /*Index. 3. 메인메소드 실행 종료를 확인하기 위한 출력 구문을 작성*/
        System.out.println("main()시작됨...");

        /*Index. 4. methodA() B() C() 차례로 호출을 해보자*/

        //클래스명 변수명 = new 클래스명();
        //변수명.메소드명();
        //메서드가 호출되면 메서드를 읽고 다읽었으면 읽은자리로 다시 올라온다.

        Application2 app = new Application2();
        app.methodA();
        app.methodB();
        app.methodC();
        app.methodD();
        System.out.println("main()종료됨...");

    }

    public void methodA(){
        System.out.println("methodA 호출됨");
        System.out.println("methodA 종료됨");
    }

    public void methodB(){
        System.out.println("methodB 호출됨");
        System.out.println("methodB 종료됨");
    }

    public void methodC(){
        System.out.println("methodC 호출됨");
        System.out.println("methodC 종료됨");
    }
    
    //public -> 접근제한자 외부에서 설정할수 있게끔 하느냐 마느냐
    private void methodD(){
        System.out.println("methodD 호출됨");
        System.out.println("methodD 종료됨");
    }
}

//++가 뒤에 있으면 연산먼저하고 더함
//++가 앞에 있으면 더하기+1먼저하고 더함
//매소드는 스택이라는 저장공간의 특징의 구조를 가지고 진행됨 ㄷ자형왼쪽돌리기 main 은 젤 아래깔림.
//메소드 실행시 어떠한 값을 미리주고(전달인자) 그 값을 활용(매개변수)해서 메소드를 수행가능
//methodA(전달인자) public void methodA(매개변수)
//atom material icon 으로 플러그인사용해서 폴더꾸며보기
//rainbow brackets 으로 플러그인 사용해서 브라켓 꾸며보기

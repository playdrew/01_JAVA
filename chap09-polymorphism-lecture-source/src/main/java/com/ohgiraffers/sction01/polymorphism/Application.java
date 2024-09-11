package com.ohgiraffers.sction01.polymorphism;

public class Application {

    public static void main(String[] args) {

        /*title. 다형성과 타입 형변환에 대해 이해할 수 있다.*/

        /*comment.
        *   다형성이란?
        *   하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미한다.
        *   그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있고,
        *   하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게
        *   만들 수 있다.
        * */

        System.out.println("===========동물생성==========");
        동물 animal = new 동물();
        animal.먹기();
        animal.뛰기();
        animal.울부짖기();

        System.out.println("=========너구리 생성==========");
        너구리 raccon = new 너구리();
        raccon.먹기();
        raccon.깨물기();
        raccon.뛰기();
        raccon.울부짖기();

        System.out.println("==========개구리 생성==========");
        개구리 frog = new 개구리();
        frog.먹기();
        frog.뛰기();
        frog.울부짖기();
        frog.낼름공격();

        /*comment.
        *   개구리와 너구리는 동물 클래스를 상속 받았다.
        *   따라서 개구리는 개구리 이면서 동물이다.
        *   너구리도 너구리 이면서 동물이다.
        * */

        /*Index. 1. 부모의 타입으로 자식 인스턴스 주소값 저장*/
        //이게 왜 될까요? 기본 생성자를 호출하면 super 라는게 묵시적으로 자동생성되는데 자식클래스를 생성자를 호출했을때 부모 생성자도 호출 인스턴스도 호출
        //상속관계에서 자식클래스의 생성자를 호출할때 부모클래스의 생성자도 호출됩니다. 자식클래스의 내에서 super()를 명시적으로 호출하지 않아도
        //자식클래스의 생성자가 실행되기전에 부모클래스의 기본생성자가 자동생성됩니다.
        //자식 클래스의 인스턴스가 생성될때 부모 클래스의 인스턴스도 생성
        //super()가 부모클래스의 생성자를호출해주는 역할 메서드라기 보단 키워드
        //부모의 값도 같이 초기화되기 때문에 이렇게 해도 전혀 상관이 없어요.
        동물 a1 = new 개구리();
        동물 a2 = new 너구리();

        //동물은 동물이지 개구리가 아니다. IS-A 관계가 성립 되어야 한다
        //개구리 f1 = new 동물();
        //a1과 a2가 어떠한 값이 잘 들어갔는지 확인
        /*Index. 2. 동적 바인딩 확인*/
        System.out.println("=========동적 바인딩 확인========");
        /*comment.
        *   컴파일 시점에는 해당 타입의 메소드와 연결(동물이) 되어 있다가
        *   런타임시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어
        *   동작하는 것을 의미한다.
        *   */
        //실제 타입은 동물이나 저장된 값은 개구리입니다.
        //실제 타입은 동물이나 저장된 값은 너구리입니다.
        //컴파일시 a1.울부짓기는 동물을 바라보는데 런타임시 new 를 만나면서 오버라이딩 된 메소드로 바인딩이 바뀌어 동작하는 것을 의미한다.
        //컴파일 시점에는 동물과 연결되어있다가 메모리가 올라가면 너구리 개구리로 올라간다라는 것.
        a1.울부짖기();
        a2.울부짖기();
        
        //개구리 클래스에 낼름공격을 만들었는데 안됩니다 컴파일 시점에는 개구리를 나타내는게 아니라 동물을 가르키기 때문에 동물에는 낼름공격이 없어여 그래서 안되는 것
        /*comment.
        *   하지만 현재 레퍼런스 변수의 타입은
        *   동물이기 때문에 너구리와 개구리가 가진
        *   고유의 기능은 작동시킬 수 없다.*/
        //a1.낼름공격();
        //그럼에도 불구하고 낼름공격을 너무 하고 싶어요 


        //예전에 실수 형태의 값을 double d= 2.2 int x = (int)d 로 했잖아요
        /*Index. 3. 타입형변환 확인*/
        System.out.println("========클래스 타입 형변환========");
        ((개구리)a1).낼름공격();
        ((너구리)a2).깨물기();
        //a1의 자료형은 동물이나 강제로 개구리 너구리로 형변환을 할 수 있습니다.
        //ClassCastException a1은 동물이나 개구리는 될 수 있으나 너구리는 될 수 없습니다
        //주의사항 : 타입 형변환을 잘못한다면 
        //컴파일시 문제가 없지만 런타임시 ClassCastException 오류 발생
        //((너구리)a1).깨물기();
        
        /*Index. 4. instanceOf 연산자로 확인*/
        //a1은 개구리이자 동물이고 Object 다 이게 바로 다형성입니다.
        System.out.println("===============================");
        System.out.println("a1 이 개구리 타입인 지 확인 : " + (a1 instanceof 개구리));
        System.out.println("a1 이 너구리 타입인 지 확인 : " + (a1 instanceof 너구리));
        System.out.println("a1 이 동물 타입인 지 확인 : " + (a1 instanceof 동물));
        System.out.println("a1 이 Object 타입인 지 확인 : " + (a1 instanceof Object));

        //명시적 형변환과 묵시적 형변환
        /*Index. 5. 클래스의 업캐스팅과 다운캐스팅*/
        //클래스간의 크기는 부모자식으로 따져요 제가 부모님에게 용돈을 주는 것은 손해가 막심 (강제형변환)
        //동물>개구리 쉽죠 개구리를 동물로는 강제가 필요
        /*comment.
        *   클래스 형변환은 up-casting 과 down-casting 으로 구분할 수 있다.
        *   up : 상위 타입 ex)개구리 -> 동물로
        *   down : 하위 타입 ex)동물 -> 개구리*/

        //데이터손실보다는 계층구조로서 이해
        동물 a3 = (동물)new 개구리(); //자동형변환 개구리는 이미 동물에 포함되어있기 때문이다. up-casting
        너구리 a4 = (너구리)new 동물(); // 너구리라는 광활한 자료형에 동물이라는 쬐깐한 곳에 들어가니 안되는 것이에요 down-casting




    }
}

//다형성이란 상속을 토대로 나온 개념이며 클래스 계층을 만들겠습니다.
//동물이란 클래스에서 동물을 상속받는 너구리와 개구리를 상속받게 만들었습니다.
//너구리는 너구리이면서 동물이다. 개구리는 개구리이면서 동물이다 이게 중요합니다.

package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    //private boolean runningStatus;
    //public void run(){}
    //...
    //이렇게 일일이 추가적으로 비슷한 기능 만들 필요 없이 public class FireCar extends Car 자동차라는 클래스를 상속받아 볼께요

    /*Index. 1. extends 키워드를 통해 Car 클래스 상속*/

    //기본생성자 //명시적으로 작성
    public FireCar() {

        /*comment.
         *   모든 생성자에는 가장 첫 줄에 super() 를 컴파일러가 자동추가 해준다.
         *   super() -> 부모의 기본 생성자를 호출하는 구문이다.
         *   명시적 묵시적 둘다 가능하다
         * */
        super();
        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");

        //상속을 받게 되면 하나로 연결이 되었다는 건데 구지 써도 되고 안써도 super()를 초기화해요
    }

    /*Index. 2. soundHorn() 메소드 오버라이딩*/

    //alt insert 
    //override method 나옴

    @Override
    public void soundHorn() {
        //super.soundHorn(); // ctrl click 으로 super.soundHorn 으로 가면 Car 클래스의 soundHorn 을 가요 super 는 부모를 지칭해요 
        if (isRunning()) {
            System.out.println("빠아아아아앙~~~~~~~~~~~~~~빠압방ㅂㅃ빠앙아아");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다....다 뿌시고 지나가기전에 비키세요!!!!");
        }
    }
    
    /*Index. 3. 물뿌리는 기능 추가*/
    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다!!! 물을 뿌립니다 =============>>>");
    }
}

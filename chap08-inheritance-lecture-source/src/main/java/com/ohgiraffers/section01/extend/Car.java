package com.ohgiraffers.section01.extend;

import org.w3c.dom.ls.LSOutput;

public class Car {

    /*멤버 -> 필드 , 메소드*/
    // protected 접근제한자로 같은 패키지 내에 있는 클래스에서는 사용할 수 있게
    // 접근 범위 확장
    protected boolean runningStatus; // 달리고 있는지 여부

    // 호출 흐름 파악을 위한 기본 생성자
    public Car(){
        System.out.println("Car 클래스의 기본 생성자 호출됨...");
    }
    
    /* run() : 달리는 기능, soundHorn() : 경적을 울리는 기능 
    *  isRunning() : 주행상태 반환하는 기능
    *  stop() : 멈추는 기능
    **/

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달려갑니다~~~~~~~~~~~~~");
    }


    public void soundHorn(){

        //자동차는 주행중인 상태일때 만 경적을 울릴 수 있다.
        //isRunning = true
        //만약 soundHorn 혼자만 불리면 기본값들로 채워지기 때문에 false 로 시작 else 구문 실행
        //이메서드는 public Boolean isRunning 과 상호작용 중입니다.
        if(isRunning()){
            System.out.println("빵~빵~!!!");
        } else {
            System.out.println("주행 중이 아니기 때문에 경적을 울릴 수 없습니다.");
        }

    }

    //왜 private 일 까요 ? 카레이서가 차의 주행상태를 조정하는게 아니라 자동차가 자신의 상태를 자신이 관리
    //우리가 시동을 끄는것같지만 프로그래밍적 시선에서 자동차가 끈것
    //그래서 private 에서 자동차가 스스로 관리할 수 있도록 했습니다.
    protected Boolean isRunning(){
        //주행 상태를 반환하는 기능
        return runningStatus;
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다....");
    }

}


// 소방차도 차인데 상태변경을 하고 싶어요 어떻게 하면 될까요 protected ? protected 를 사용합니다.
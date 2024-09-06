package com.ohgiraffers.section03.abstraction;

public class Car {

    // 관리 해야 할 상태 : 속력 , 시동상태 // 힙메모리영역에 올라가는 인스턴스변수들
    private boolean isOn;   // 시동상태
    private int speed;      //현재속력

    //어떤 메소드를 실행하느냐에 따라 덮이는게 다르다
    //if는 false 는 무시한다 
    public void startUp() {
        if(isOn){
            System.out.println("이미 시동이 걸려있습니다.");
        }else{
            this.isOn=true; // 두번째로 걸었을때는 if(isOn=true)
            System.out.println("시동을 걸었습니다. 출발 준비 완료");
        }
    return;
    }

    public void go() {
        if(isOn){
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다!!!!!!!");
        } else {
            System.out.println("차의 시동을 확인해주세요");
        }
    return;
    }

    public void stop() {
        //시동이 걸려있고, 달리는 상태인 경우에만 멈출 수 있다.
        if(isOn){
            if(speed>0){
                this.speed=0;
                System.out.println("끼~~~~~~~~~~읶!! 차가 멈췄습니다");
            }else{
                System.out.println("이미 차는 0km/h 인데요?");
            }
        }else{
            System.out.println("차의 시동이 걸려있지 않아 너가 얼마나 밟듣 힘만 들꺼야");
        }
    return;
    }

    //시동이 걸려있다면 시동을 끄고 , 이미 꺼져있다면 끌 수 없고 , 움직이고 있다면 break 먼저
    public void turnOff() {
        if(isOn){
            if(this.speed>0){
                System.out.println("달리는 상태에서 시동을 끄면 큰일납니다");
            }else{
                this.isOn=false;
                System.out.println("차의 시동을 끄겠습니다");
            }
        }else{
            System.out.println("이미 시동이 꺼져있습니다");
        }
    return;
    }
}

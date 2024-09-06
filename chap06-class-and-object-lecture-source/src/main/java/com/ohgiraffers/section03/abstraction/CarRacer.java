package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    
    private Car car= new Car(); //속성으로 자동차를 가져요

    public void startUp(){
        car.startUp();
        return;
    }
    public void stepAccelator(){
        car.go();
        return;
    }
    public void stepBreak(){
        car.stop();
        return;
    }
    public void turnOff(){
        car.turnOff();
        return;
    }
}

//사용자가 carRacer 에게 명령 carRacer 는 Car 에 명령

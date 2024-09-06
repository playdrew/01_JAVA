package com.ohgiraffers.practice.practice;

public class Car {

    private int speed;
    private boolean isOn;

    // if false 면 실행이 안된다.

    public void turnOn() {
        if (isOn) {
            System.out.println("이미 시동이 걸려있습니다");
        } else {
            isOn = true;
            System.out.println("시동을 걸었습니다");
        }
    }

    public void Acc() {
        if (isOn) {
            speed += 10;
            System.out.println(this.speed + "km/h 로 가속합니다");
        } else {
            System.out.println("가속중에 시동을 끌수 없습니다");
        }
    }

    public void Break() {
        if (isOn) {
            if (speed > 0) {
                this.speed = 0;
                System.out.println("완전히 차가 멈쳤습니다.");
            } else {
                System.out.println("이미 멈췄습니다");
            }
        } else {
            System.out.println("이미 시동이 꺼져있습니다.");
        }

    }

    public void turnOff() {
        if (isOn) {
            if (speed > 0) {
                System.out.println("움직이는 중에 시동을 끌 수 없습니다.");
            } else {
                this.isOn = false;
                System.out.println("시동을 껐습니다.");
            }
        } else {
            System.out.println("이미 시동이 꺼진 상태입니다.");
        }
    }
}

package com.ohgiraffers.section01.practice;

public class Application5 {

    public static void main(String[] args) {

        //1000kg 수용
        //
        //가능한 엘리베이터에 76kg인 사람 몇 명이 탈 수 있는가?
        //같은 엘리베이터에 13명이 탄다면 평균 몸무게는? (실수로 출력)

        int ev = 1000; // 엘리베이터 최대수용 무게
        int hu = 76;    // 인간몸무게

        int evFull = ev / hu; // 1000kg 수용가능한 엘리베이터에 몇명이 탈수있는가?
        System.out.println(evFull);

        double avgWeight = (double) ev / 13; // 엘리베이터에 13명이 탄다면 인간들의 평균몸무게는?
        System.out.println(avgWeight);
    }
}

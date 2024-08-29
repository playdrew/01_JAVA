package com.ohgiraffers.section01.practice;

public class Application6 {

    public static void main(String[] args) {

        int sausage = 6;  // 1명당 소세지 갯수
        int sausageStudent = 67; // 현재까지 소세지 받아간 학생수

        int sausageConsumption = sausage * sausageStudent; // 현재까지 소세지 소비량
        System.out.println(sausageConsumption);

        int nextStudent = ++sausageStudent; // 다음 학생~
        System.out.println(nextStudent);

    }
}

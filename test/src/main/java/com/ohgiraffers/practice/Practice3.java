package com.ohgiraffers.practice;

public class Practice3 {

    public static void main(String[] args) {

        float kor = 80.5f;
        float math = 50.6f;
        float eng = 70.8f;
        int total = (int)(kor + math + eng);
        int avg = total / 3;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);

    }
}

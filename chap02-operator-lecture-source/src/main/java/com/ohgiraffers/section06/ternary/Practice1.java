package com.ohgiraffers.section06.ternary;

class Test1 {

    public Boolean solution(int score){
        if(100<score && score>80){
            return true;
        }else
            return false;
    }
}

public class Practice1{
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        System.out.println(test1.solution(10));
    }
}
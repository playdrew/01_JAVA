package com.ohgiraffers.section06.ternary;

class Test{
    public String result(int score){
        return (score == 100) ? "만점" : (score<100 && score>80) ? "합격" : "불합격";
    }
}

public class Practice2{
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.result(70));
    }
}

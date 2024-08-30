package com.ohgiraffers.section04.practice;


import java.util.Random;

public class RandomMaker{

    Random random = new Random();

    public int randomNumber(int max , int min){
        return random.nextInt(max-min+1)+min;
    }

    public void randomUpperAlphabet(int num1){

    }

    public String rockPaperScissors(){
        int result = random.nextInt(3)+1;
        return (result==1) ?  "가위" : (result==2) ? "바위" : (result==3) ? "보" : "컴퓨터오류";


    }

    public String tossCoin(){
        int result = random.nextInt(2)+1;
        return (result ==1 ) ? "앞면" : "뒷면";
    }
}




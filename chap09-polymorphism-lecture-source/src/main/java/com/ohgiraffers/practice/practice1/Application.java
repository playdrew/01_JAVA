package com.ohgiraffers.practice.practice1;

import com.ohgiraffers.sction01.polymorphism.Application3;

public class Application {

    public static void main(String[] args) {

        동물 a1 = new 개구리();
        동물 a2 = new 너구리();

        ((개구리)a1).개굴();
        ((너구리)a2).너굴();

        동물 a3 = (동물)new 개구리();
        개구리 a31 = (개구리)a3;

        동물 a4 = (동물)new 너구리();
        너구리 a41 = (너구리)a4;

        개구리 a5 = new 개구리();
        동물 a51 = (동물)a5;
        너구리 a6 = new 너구리();
        동물 a61 = (동물)a6;


        Application app = new Application();
        동물 random = app.randomMethod();
        random.울기();

        동물[] b = new 동물[2];
        b[0] = new 너구리();
        b[1] = new 개구리();

        for(int i=0 ; i<b.length;i++){
            if(b[i] instanceof 개구리){
                ((개구리)b[i]).개굴();
            }else if(b[i] instanceof 너구리){
                ((너구리)b[i]).너굴();
            }
        }
    }

    public 동물 randomMethod(){
        int random = (int)(Math.random()*2);
        return random==0 ? (동물)new 너구리() : (동물)new 개구리();
    }
}


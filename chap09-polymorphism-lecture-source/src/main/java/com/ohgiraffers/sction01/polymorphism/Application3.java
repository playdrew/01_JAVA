package com.ohgiraffers.sction01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        /*title. 다형성을 적용하여 리턴타입을 활용할 수 있다.*/
        /*comment.
        *   랜덤한 동물 인스턴스를 반환 받아
        *   울부짖게 만들거에요
        * */
        Application3 app3 = new Application3();
        동물 random = app3.getRandomAnimal();
        random.울부짖기();
        //개구리는 동물일수도 있고 자기자신일수도 너구리는 동물일수도 자기자신일수도 중복되는 코드를 줄였다.

    }
    
    //인스턴스를 받는데 개구리를 받을지 너구리를 받을지 모르겠어요 그럼 너구리와 개구리는 동물이므로 리턴타입으로 하고 나중에 바꿔요
    public 동물 getRandomAnimal(){

        //int x = 10;
        //double d = x; //작은 곳에서 큰 곳으로 가는 것은 문제없어요

        int random = (int)(Math.random()*2); //초기값 +0 생략가능
        return random == 0 ? (동물)new 너구리() : (동물)new 개구리();

    }
}

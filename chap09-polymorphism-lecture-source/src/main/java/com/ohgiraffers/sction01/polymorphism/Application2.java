package com.ohgiraffers.sction01.polymorphism;

public class Application2 {

    public static void main(String[] args) {

        /*title. 다형성을 사용해서 객체 배열을 만들어 연속처리 */
        동물[] animal = new 동물[5];
        animal[0]= (동물)new 개구리(); //이게 되는이요 개구리는 동물이기 때문에 동물자료형에 들어갈수있다. 동물이 묵시적으로 형변환되어있습니다.
        animal[1]= (동물)new 너구리(); 
        animal[2]= (동물)new 개구리();
        animal[3]= (동물)new 너구리();
        animal[4]= (동물)new 개구리();

        for(int i = 0 ; i< animal.length ; i++){
            animal[i].울부짖기();
        }
        
        for(int i = 0 ; i<animal.length ; i++){
            //동물들아 너가 개구리면 낼름공격을 하고 
            //너가 너구리면 깨물기를 해라
            if(animal[i] instanceof 개구리){
                ((개구리)animal[i]).낼름공격();
            }else if(animal[i] instanceof  너구리){
                ((너구리)animal[i]).깨물기();
            }
        }

        //부모를 자식으로 바꾸면 명시적 형변환을 해야해요
        //자식을 부모로 바꾸는 것은 묵시적 형변환이 됩니다.


    }
}

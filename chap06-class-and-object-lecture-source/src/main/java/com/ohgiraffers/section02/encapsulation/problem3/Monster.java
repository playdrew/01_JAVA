package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    /*Index. 1. name hp*/
//    String name;
//    int hp;

    /*Index. 2. 또 마음이 바뀌었다.. 이름이 아니라 또 종류래요...*/

    String kinds;
    int hp;

    // 빨간불 2개 name 에서요
    // setName 에 시진핑이 들어오면 (String name)에서 받을 준비를 해요
    public void setName(String name){
        this.kinds=name;
        //this.name=name;
    }

    public void setHp(int hp){
        if(hp>0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }
    
    //이 메소드의 역할은 몬스터의 정보(이름,체력)을 알려주는 기능
    public String getInfo(){
        return "몬스터의 이름은 " + this.kinds + "이고, 몬스터의 체력은 " + this.hp + "입니다";
        //this.name
    }
}

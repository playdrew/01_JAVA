package com.ohgiraffers.section02.encapsulation.resolve;

public class Monster {


    /*comment.
    *   접근 제한자
    *   클래스 혹은 클래스의 멤버(변수,메소드)에 참조연산자(.)로
    *   접근할 수 있는 범위를 제한하기 위한 키워드이다.
     *   1.public : 모든 패키지에서 접근가능
     *   2.protected : 동일 패키지에서 접근가능(단 상속관계에 있는 경우 다른 패키지에서 접근 가능)
     *   3.private : 해당 클래스 내부에서만 가능하다
     *   4.default : 동일 패키지에서만 접근 허용(쓰지 않는 게 default)
     * */
    private String kinds;
    private int hp;

    // void setName(String name) 라고 메서드를 지으면 접근제한자 안 쓰는게 default 가 생략된 것입니다.
    public void setName(String name){
        this.kinds=name;
        //this.name=name;
        return;
    }

    public void setHp(int hp){
        if(hp>0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }
    
    public String getInfo(){
        return "몬스터의 이름은 " + this.kinds + "이고, 몬스터의 체력은 " + this.hp + "입니다";
        //this.name
    }
}

/* 객체란 (실체)?
*  객체는 상호작용?
*  */

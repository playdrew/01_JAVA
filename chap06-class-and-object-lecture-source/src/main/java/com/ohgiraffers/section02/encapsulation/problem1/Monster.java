package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    
    // 몬스터의 이름
    String name;
    // 몬스터의 체력
    int hp;
    
    //음수가 들어오면 0으로 바꾸는 기능즉 메소드
    //전달받은값을저장할공간와 hp는 다르기때문에요
    public void setHp(int hp){
        
        /*comment. 
        *  this 는 인스턴스가 생성될때 자신의 주소를 저장하는 레퍼런스 변수이다.
        *  지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선 접근하기 때문에
        *  전역변수에 접근하기 위해 this. 를 명시한다 */
        if(hp>0){
            System.out.println("정상적인 값이 들어와서 전달한 값으로 몬스터의 체력을 설정합니다.");
            this.hp = hp; // hp = hp 는 회색코드로 잘못된 코드입니다. 둘다 지역변수라서
            //hp = hps; 이건 가능
            //monster.hp == this.hp
        }else{
            System.out.println("0보다 작거나 같은 값이 들어와서 몬스터의 체력을 0으로 설정합니다");
            this.hp=0;
        }
        return;
    }

}

package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {

    public static void main(String[] args) {
        
        /*title. 필드에 직접 접근시 발생하는 문제(3)*/
        
        // 여기서는 problem1  을 적용 -> 메소드를 통해 값 입력
        // 여기선 여기선 빨간불이 없죠 어플리케이션은 사용자가 보는 화면이다 라고 생각해요
        // 그 외에 다른 클래스들은 우리들이 작업하는 거에요
        // 사용자 보는 화면에서는 오류가 없다는 것이에요
        // problem2에서는 빨간불이 엄청많았는데 여기선 메소드2줄만 수정해서 해결했어요
        Monster monster1 = new Monster();
        monster1.setName("하츄핑");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setName("시진핑");
        monster2.setHp(-200);

        Monster monster3 = new Monster();
        monster3.setName("티니핑");
        monster3.setHp(300);

        Monster monster4 = new Monster();
        monster4.setName("핑");
        monster4.setHp(400);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());

        /*title. 뭔가 해결된 것 같지만 아직 해결되지 않은 게 있다.*/
        Monster monster5 = new Monster();
        monster5.kinds = "";
        monster5.hp = -13123123313;
        //comment. 아직도 필드에 직접 값을 넣을 수 있다.
        
    }
}

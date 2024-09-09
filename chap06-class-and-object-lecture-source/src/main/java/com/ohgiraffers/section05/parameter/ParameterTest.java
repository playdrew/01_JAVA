package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimary(int num){
        System.out.println("매개변수로 전달 받은 값 : " + num);
    }

    public void testPrimaryArrayParameter(int[] iarr) {

        System.out.println("매개변수로 전달 받은 값 : " + iarr);

        System.out.print("배열의 값 확인 : ");
        for(int i = 0 ; i<iarr.length ; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        //얕은 복사 확인을 위한 값 변경 test
        iarr[0]=99;

        System.out.print("변경 후 배열의 값 확인 : ");
        for(int i = 0 ; i<iarr.length ; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    //alt + enter
    public void testClassParameter(Rectangle r1) {

        System.out.println("매개변수로 전달 받은 값 : " + r1);

        System.out.println("변경 전 사각형의 넓이와 둘레");
        r1.calcArea();
        r1.calcRound();

        System.out.println("=============================");
        System.out.println("변경 후 사각형의 넓이와 둘레");
        r1.setHeight(100);
        r1.setWidth(100);

        r1.calcArea();
        r1.calcRound();

    }

    //두번째 매개변수는 hobbies 인데 hobbies 는 여러개일수있다
    //배열로 받아도 되지만 여기선 String...hobbies 로 하겠다
    //가변인자는 배열크기정하는것과 다르게 (new int[5] [10]등등) 가변인자는 필요없어요
    //하나든 두게든 다 받아줄께라는 뜻이라고 합니다.
    //public void testVariableLengthParameter(String...hobbies ,String name ) 은 안돼요. 끝을 알수가 없기 때문입니다.
    //가변인자를 앞에다가 두면 어디가 끝인지 모릅니다.

    /**/
    public void testVariableLengthParameter(String name , String...hobbies) {

        System.out.println("이름 : " + name);
        System.out.println("취미의 개수 : " + hobbies.length);
        System.out.print("취미 : ");
        for(int i = 0 ; i<hobbies.length ; i++){
            System.out.print(hobbies[i] + " ");
        }
        System.out.println();
    }
}

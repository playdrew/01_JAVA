package com.ohgiraffers.practice.practice2;

public class Application {

    public static void main(String[] args) {

        int num = 20;
        ParameterTest pt = new ParameterTest();
        pt.testPrimary(num);


        int[] iarr = {1,2,3,4,5};
        System.out.println("인자로 전달하는 값 : " + iarr);
        pt.testPrimaryArrayParameter(iarr);
        System.out.print("메소드 전달 후 원본 배열의 값 확인 : ");
        for(int i = 0 ; i<iarr.length ; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        Rectangle r = new Rectangle(22.2,33.4);
        System.out.println("인자로 전달하는 클래스 자료형 값 : " + r);
        pt.testClassParameter(r);

        /*Index. 5. 가변인자*/
        pt.testVariableLengthParameter("조평훈"); // 가변인자는 전달하지 않아도 된다는게 특징입니다.
        pt.testVariableLengthParameter("조평훈","야구");
        pt.testVariableLengthParameter("조평훈","야구","볼링","축구");
        pt.testVariableLengthParameter("조평훈", new String[]{"테니스","볼링","야구","축구"}); // 배열도 됩니다.근데 그 뒤는 안되는듯
    }

}

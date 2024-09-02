package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    
    /*title. if, if else , if-else-if 문 단독 사용에 대한 흐름 이해*/

    /*comment.
    *  [if-else-if문 표현식]
    *  if(조건식1){
    *    조건식1이 true 일 때 실행할 구문;
    *  } else if (조건식2) {
    *    조건식2이 false 이고 조건식2가 true 일때 실행할 구문;
    *  } else {
    *    위의 조건 2개가 모두 거짓일 경우 실행할 구문;
    *  }
    * */

    /*comment.
    *  if-else if 문은 조건식 1의 결과 값이 참(true)이면 if {} 블럭 실행,
    *  조건식 1이 false 이면 조건식 2를 확인하여 참(true) 이면 else if {}
    *  블럭 실행한다.
    *  조건식 1, 2의 결과가 모두 거짓(false) 이면 else {} 블럭을 실행한다 */

    public void testIfElseIfStatement(){
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다...");
        System.out.println("그 때.. 연못에서 산신령이 나타나 금도끼 , 은도끼 , 쇠도끼를 들고 나타났다...");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 너의 도끼인 지 물어보게 되는데...");

        System.out.println("========================================================");
        System.out.print("산신령 : 어느 도끼가 너의 도끼이냐? (1.금도끼) (2.은도끼) (3.쇠도끼) ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer==1){
            System.out.println("산신령 : 이런 거짓말 쟁이 너에게는 아무 것도 줄 수 없다!!!! 썩 꺼지거라");
        } else if(answer==2){
            System.out.println("산신령 : 욕심이 과하지는 않지만 그래도 거짓말을 하고 있구나");
        } else if(answer==3){
            System.out.println("산신령 : 오호 아주 정식한 아이로구나!! 여기 있는 도끼를 너에게 다 주겠노라");
        } else {
            System.out.println("산신령 : 뭐라는거니?");
        }

        System.out.println("그렇게 산신령은 다시 연못 속으로 떠나갔다...");

        return;

    }
    
    public void testNestedIfElseIfStatement(){
        /*comment. 중첩된 if-else-if 구문*/
        /*Index. 1. 문제 
        *   ohgiraffers 대학교의 조** 교수는 학생들의 성적을 입력해서
        *  학점 등급을 매기는 채점 방식을 사용하고 있다
        *  학생의 이름과 점수를 입력 받아 
        *  90점 이상이면 'A' 80점 이상이면 'B' 70점 이상이면 'C' 
        *  60점 이상이면 'D' 60점 미만이면 'F' 학점을 줄 것이다.
        *  추가로 각 등급의 중간점수(ex 65 , 75 , 85 , 95 ) 이상이면 
        *  '+'를 붙여 줄 것이다.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();
        String grade = "";

        if(point >= 90){
            grade = "A";
            if(point >= 95){
                grade += "+"; // grade = grade + "+"
            }
        } else if(point >= 80){
            grade = "B";
            if(point >= 85){
                grade += "+";
            }
        } else if(point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            }
        } else if(point >= 60) {
            grade = "D";
            if (point >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }

        System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");

         return;
    }

    public void improveNestedIfElseIfStatement(){
        /*comment. 중첩된 if-else-if 구문*/
        /*Index. 1. 문제
         *   ohgiraffers 대학교의 조** 교수는 학생들의 성적을 입력해서
         *  학점 등급을 매기는 채점 방식을 사용하고 있다
         *  학생의 이름과 점수를 입력 받아
         *  90점 이상이면 'A' 80점 이상이면 'B' 70점 이상이면 'C'
         *  60점 이상이면 'D' 60점 미만이면 'F' 학점을 줄 것이다.
         *  추가로 각 등급의 중간점수(ex 65 , 75 , 85 , 95 ) 이상이면
         *  '+'를 붙여 줄 것이다.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();
        String grade = "";

        if(point >= 90){
            grade = "A";

        } else if(point >= 80){
            grade = "B";

        } else if(point >= 70) {
            grade = "C";

        } else if(point >= 60) {
            grade = "D";

        } else {
            grade = "F";
        }

        //각 등급의 중간 점수 이상이상이면서 60점 이상인 경우 +를 붙이기
        if(point % 10 >= 5 && point>60 || point == 100){
            grade += "+";
        }

        System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");

        return;
    }

    public void testnestedIfElseIfStatement1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("몸무게를 입력하세요 : ");
        int weight = sc.nextInt();
        System.out.println("치킨집을 열렸습니까 : ");
        boolean restaurant = sc.nextBoolean();

        if(weight>= 70){
            System.out.println("샐러드를 먹겠어");
        }else if(restaurant){
            System.out.println("치킨을 먹겠어");
        }else{
            System.out.println("라면을 먹겠어");
        }

        return;

    }

    public void testnestedIfElseIfStatement2(){

        Scanner sc = new Scanner(System.in);
        System.out.println("몸무게를 입력하세요 : ");
        int weight = sc.nextInt();
        
        if(weight > 70 || weight ==70 ){
            System.out.println("샐러드를 먹겠어");
        }else if(weight < 70){

            // sout과 sc.nextInt 순서 중요 거꾸로 되면 문제생김
            System.out.println("치킨집이 열렸나요? (1)열림 (2)닫힘");
            int openChicken = sc.nextInt();
            if(openChicken == 1){
                System.out.println("치킨을 먹겠어");
            } else if(openChicken == 2){
                System.out.println("라면을 먹겠어");
            }
            else{
                System.out.println("잘못된 접근입니다");
            }
        }
        return;
    }



    
}
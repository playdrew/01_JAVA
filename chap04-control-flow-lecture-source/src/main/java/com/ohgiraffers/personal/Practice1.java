package com.ohgiraffers.personal;

import java.util.Scanner;

public class Practice1 {

    public void ageCheck() {

        /* 다람쥐가 축제 아르바이트를 시작했습니다.
         * 맥주를 판매하려면 성인인지 확인을 해야 해요.
         *
         * '나이가 어떻게 되세요?'를 출력하고 나이(정수)를 입력받아,
         * 성인이면 '판매 가능합니다.'를 출력하고,
         * 미성년자이면 '판매 불가능합니다. 음료 코너에서 골라주세요.'를 출력하세요.
         *
         * -- 입력 예시 --
         * 성인이십니까? 21
         *
         * -- 출력 예시 --
         * 판매 가능합니다.
         * */

        Scanner scan = new Scanner(System.in);
        System.out.print("성인이십니까? : ");
        int age = scan.nextInt();


        if (age > 21 || age == 21) {
            System.out.println("판매 가능합니다");
        } else {
            System.out.println("판매 불가능합니다.");
        }
        return;
    }

    public void evenOddCheck() {
        /* 람쥐가 이벤트 부스에서 짝홀 게임 진행을 맡았습니다.
         *
         * "짝홀, 그 결과는?"을 출력하고, 도토리 갯수를 정수로 입력받아
         * 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요.
         *
         * 짝수인 경우 "짝수입니다~!" 출력, 홀수인 경우 "홀수입니다~!" 출력
         *
         * -- 입력 예시 --
         * 짝홀, 그 결과는? 7
         *
         * -- 출력 예시 --
         * 홀수입니다~!
         * */

        System.out.print("짝홀 그 결과는? ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num == 0) {
            System.out.println("0입니다.");
        } else if (num % 2 == 0) {
            System.out.println("짝수입니다~!");
        } else if (num % 2 != 0) {
            System.out.println("홀수입니다~!");
        } else {
            System.out.println("에러");
        }

        return;
    }

    public void eventEvenOddCheck() {

        /* 랍쥐가 숫자 뽑기를 통해 선물을 나눠주는 이벤트 부스에서 일합니다.
         *
         * "당첨 번호가 어떻게 되세요?"를 출력하여,
         * 1~10 사이의 정수 한개를 입력받고,
         * 홀수인지 짝수인지 확인하고,
         * 홀수이면 "홀수네요, 인형 선물입니다!", 홀수가 아니면 "짝수네요, 모자 선물입니다!"라고 출력하세요.
         *
         * 단, 1~10 사이의 정수가 아닌 경우 "당첨 번호는 1~10 사이에만 있어요."를 출력하세요.
         *
         * -- 입력 예시 --
         * 당첨 번호가 어떻게 되세요? 8
         *
         * -- 출력 예시 --
         * 짝수네요, 모자 선물입니다!
         * */


        Scanner scan = new Scanner(System.in);
        System.out.print("당첨 번호가 어떻게 되세요?");
        int num = scan.nextInt();

        if (num == 0) {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        } else if (num % 2 == 0) {
            System.out.println("짝수네요, 모자 선물입니다.");
        } else if (num % 2 != 0) {
            System.out.println("홀수네요, 인형 선물입니다.");
        } else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        }
    }

    public void BmiCheck() {
        /* 축제에서 무료로 건강 검진을 해주는 부스로 이동했어요.
         *
         * 키와 몸무게를 실수(double)로 입력받아 BMI(신체질량지수)를 계산하고,
         * 계산된 값에 따라
         * 저체중(20 미만)인 경우 "저체중입니다. 축제 음식을 왕창 드세요!",
         * 정상체중(20이상 25미만)인 경우 "정상 체중입니다. 축제 재미있게 즐기세요~",
         * 과제충(25이상 30미만)인 경우 "축제에서 10,000보를 걷고 오시면 상품을 드려요!",
         * 비만(30이상)인 경우 "댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!"를  출력하세요.
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 입니다.
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         *
         * -- 입력 예시 --
         * 키를 입력해 주세요(m) : 1.7
         * 체중을 입력해 주세요(kg) : 67
         *
         * -- 출력 예시 --
         * 정상 체중입니다. 축제 재미있게 즐기세요~
         * */

        Scanner scan = new Scanner(System.in);
        System.out.print("키를 입력해 주세요(m) : ");
        double height = scan.nextDouble();
        System.out.print("체중을 입력해 주세요(kg) : ");
        double weight = scan.nextDouble();

        double BMI = weight / (height * height);

        if (BMI >= 30) {
            System.out.println("댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        } else if (BMI >= 25) {
            System.out.println("축제에서 10,000보를 걷고 오시면 상품을 드려요!");
        } else if (BMI >= 20) {
            System.out.println("정상 체중입니다. 축제 재미있게 즐기세요~");
        } else if (20 > BMI) {
            System.out.println("저체중입니다. 축제 음식을 왕창 드세요!");
        }
        return;
    }

    public void calculator() {
        /* 간단한 계산기를 만들어 봅시다.
         *
         * 두 개의 정수를 입력 받아 변수에 저장하고,
         * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
         * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램을 종료합니다.
         *
         * -- 입력 예시 --
         * 첫 번째 정수 : 4
         * 두 번쨰 정수 : 3
         * 연산 기호를 입력하세요 : +
         *
         * -- 출력 예시 --
         * 4 + 3 = 7
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int num1 = scan.nextInt();
        System.out.print("두번째 정수 : ");
        int num2 = scan.nextInt();
        System.out.println("연산 기호를 입력하세요");
        char operator = scan.nextLine().charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }
        return;
    }

    public void snackList() {

        /* 람쥐는 축제 간식 부스에서 일하게 됐어요.
         *
         * 간식 이름("캬라멜팝콘", "츄로스", "통감자", "도토리탕후루") 중 한 가지를 문자열로 입려하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         *
         * 단, 목록에 없는 과일을 입력 시 "해당 상품이 판매하지 않습니다." 출력 후 프로그램을 종료합니다.
         *
         * -- 상품 가격 --
         * 캬라멜팝콘 : 15500원
         * 츄로스 : 3000원
         * : 2000원
         * 도토리탕후루 : 5000원
         *
         * -- 입력 예시 --
         * 어떤 간식을 주문하시겠어요? 도토리탕후루
         *
         * -- 출력 예시 --
         * 도토리탕후루의 가격은 5000원 입니다.
         * */

        System.out.println("=========축제간식부스=========");
        System.out.println("1.(카랴멜팝콘) 2.(츄러스) 3.(통감자) 4.(도토리탕후루)  ");
        System.out.println("=========축제간식부스=========");
        System.out.println("어떤 간식을 주문하시겠어요?");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        int price = 0;

        switch (choice) {
            case 1:
                price = 15500;
                System.out.println("카라멜팝콘의 가격은 " + price + "원 입니다");
                break;
            case 2:
                price = 3000;
                System.out.println("츄로스의 가격은 " + price + "원 입니다");
                break;
            case 3:
                price = 2000;
                System.out.println("통감자의 가격은 " + price + "원 입니다");
                break;
            case 4:
                price = 5000;
                System.out.println("도토리탕후루의 가격은 " + price + "원 입니다");
                break;
        }
        return;
    }

    public void testEvent() {

        /* 람쥐는 축제 부스에서 일한 뒤, 인사평가 점수를 받았습니다.
         *
         * 성실, 서비스, 미소 점수를 입력받아
         * 평균 점수가 60점 이상이면서 각 항목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
         *
         * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해 주어야 합니다.
         * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다."라고 출력하고,
         * 항목당 과락 점수가 있는 경우 "xx 항목의 점수 미달로 불합격 입니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 성실 점수 : 60
         * 서비스 점수 : 30
         * 미소 점수 : 20
         *
         * -- 출력 예시 --
         * 평균 점수 미달로 불합격입니다.
         * 서비스 점수 미달로 불합격입니다.
         * 미소 점수 미달로 불합격입니다.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("성실 점수 : ");
        int diligentScore = scan.nextInt();
        System.out.print("서비스 점수 : ");
        int serviceScore = scan.nextInt();
        System.out.print("미소 점수 : ");
        int smileScore = scan.nextInt();


        System.out.println("성실 점수 : " + diligentScore);
        System.out.println("서비스 점수 : " + serviceScore);
        System.out.println("미소 점수 : " + smileScore);

        double scoreAvg = (diligentScore + smileScore + serviceScore) / 3.0;

        boolean isPass = false;

        if(scoreAvg<60){
            System.out.println("평균점수미달로 불합격입니다!.");
            isPass = false;
        }
        if(diligentScore<40){
            System.out.println("근면점수미달로 불합격입니다");
            isPass = false;
        }
        if(smileScore<40){
            System.out.println("미소점수미달로 불합격입니다.");
            isPass = false;
        }
        if(serviceScore<40){
            System.out.println("서비스점수미달로 불합격입니다");
            isPass = false;
        }

        if(isPass){
            System.out.println("합격입니다.");
        }

        return;
    }

    public void salaryTest(){

        /* 열심히 일한 람쥐가 급여를 계산해 보려고 합니다.
         * 월 급여액과 월 매출액을 입력받아 급여를 산정합니다.
         * 축제 운영 사원은 매출액 대비 보너스율에 명시된 보너스를, 급여 외에 추가로 지급받습니다.
         *
         * 단, 보너스율은 입력 받은 월 매출액에 비례하며,
         * 계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산합니다.
         *
         * 보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어 보세요.
         *
         * -- 총 급여 계산식 --
         * 총 급여 = 월 급여  + (매출액 * 보너스율)
         *
         * -- 매출액 대비 보너스율 --
         *   매출액       보너스율
         * 5천만원 이상      5%
         * 3천만원 이상      3%
         * 1천만원 이상      1%
         * 1천만원 미만      0%
         *
         * -- 입력 예시 --
         * 월 급여 입력 : 3000000
         * 매출액 입력 : 20000000
         *
         * -- 출력 예시 --
         * ======================
         * 매출액 : 20000000
         * 보너스율 : 1%
         * 월 급여 : 3000000
         * 보너스 금액 : 200000
         * ======================
         * 총 급여 : 3200000
         * */

        Scanner scan = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int monthlySalay = scan.nextInt();
        System.out.print("매출액 입력 : ");
        int revenue = scan.nextInt();
        double bonusPer = 0;

        if(revenue>=50000000){
            bonusPer = 0.05;
        }
        if(revenue>=30000000){
            bonusPer = 0.03;
        }
        if(revenue>=10000000){
            bonusPer = 0.01;
        }
        if(revenue<10000000){
            bonusPer = 0;
        }

        double bonus = revenue*bonusPer;
        double totalSalay = monthlySalay + (revenue * bonusPer);

        System.out.println("==================");
        System.out.println("매출액 : " + revenue);
        System.out.println("보너스율 : " + bonusPer*100 + "%");
        System.out.println("보너스금액" + (int)bonus);
        System.out.println("==================");
        System.out.println("총급여" + totalSalay);

        return;

    }

    public void ageHeightTest(){

        //9세 이상이면서 110cm 이상인 사람만 놀이기구를 탑승 가능 한 프로그램 만들기
        //조건 : 나이 조건에 만족하지 않으면 출력문으로 9살 넘으면 오시오.
        //        키 조건에 만족하지 않으면 키 더 크고 오시오.
        
        Scanner scan = new Scanner(System.in);
        System.out.print("나이를 입력 : ");
        int age = scan.nextInt();
        System.out.print("키를 입력 : ");
        int height = scan.nextInt();
        
        if(age>9 && height>110){
            System.out.println("놀이기구를 탑승할 수 있습니다");
        }else if(age<9 && height>110){
            System.out.println("나이가 너무 어려요");
        }else if(age>9 && height<110){
            System.out.println("키 더 크고 오세요");
        }
        return;
    }

    public void scoreTest(){

        //Q2. 두 과목의 평균이 60점 이상이면 합격
        //한 과목이라도 40점미만이면 불합격

        Scanner scan = new Scanner(System.in);

        System.out.print("score1 점수 : ");
        int score1 = scan.nextInt();
        System.out.print("score2 점수 : ");
        int score2 = scan.nextInt();

        double avg = (score1+score2)/2.0;

        if(avg>60 && score1>40 && score2>40) {
            System.out.println("합격");
        }else if(score1<40 && score2>40){
            System.out.println("score1만 40미만이라 탈락");
        }else if(score1>40 && score2<40){
            System.out.println("score2만 40미만이라 탈락");
        }



    }
}

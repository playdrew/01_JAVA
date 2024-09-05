package com.ohgiraffers.personal;

import java.util.Scanner;

public class Practice2 {

    public void sumPractice(){
        /* 1부터 10까지 합계를 구하고 결과를 출력하세요.
         *
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55
         * */

        int sum = 0;
        for(int i = 0 ; i<11 ; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
        return;
    }

    public void sumPractice2(){

        int sum = 0;
        int i = 1;
        while(i<11){
            sum+=i;
            i++;
        }
        System.out.println("sum = " + sum);
        return;
    }

    public void inputSumPractice1(){
        /* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 1부터 5까지의 합 : 15
         *
         * */
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        int sum = 0;
        for(int i = 1; i<=num ;i++){
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합 : " + sum );

        return;
    }

    public void inputSumPractice2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println("1부터 " + num + "까지의 합 : " + sum );

    }

    public void evenSumPractice1(){

        /* 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=num){
            if(i%2==0){
                sum+=i;
                //i++여기에 하면 안된다.
            }
            i++;
        }
        System.out.println("1부터 " + num + "까지의 짝수의 합 : " + sum);
        return;
    }

    public void evenSumPractice2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        int sum = 0; // sum은 for문내에 있으면 안된다. 이 경우에는요 이 출력문에서는요

        for(int i = 1; i<=num ; i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("1부터 " + num + "까지의 짝수의 합 : " + sum);
        return;
    }

    public void textTest1(){
        /* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.
         * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : apple
         *
         * -- 출력 예시 --
         * 0 : a
         * 1 : p
         * 2 : p
         * 3 : l
         * 4 : e
         * */
        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = scan.nextLine();

        for(int i = 0 ; i<str.length();i++){
            System.out.println(i + " : " +str.charAt(i));
        }
    }
    public void textTest2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = scan.nextLine();
        int i = 0;

        while(i<str.length()){
            System.out.println(i + " : " +str.charAt(i));
            i++;
        }
    }

    public void textTest3(){
        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요.
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */
        for(int i = 97; i<123; i++){
            char text = (char)i;
            System.out.print(text);
        }
    }

    public void textTest4(){
        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요.
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */
        int i = 97;
        while(i<123){
            char text = (char)i;
            i++;
            System.out.print(text);
        }
    }

    public void textTest5(){
        /* 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 수박수박수
         * */
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        int i = 1;
        while(i<num+1){
            if(i%2 != 0){
                System.out.print("토");
            }
            if(i%2 == 0){
                System.out.print("마");
            }
            i++;
        }
    }

    public void textTest6(){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        for(int i=1; i<num+1;i++){
            if(i%2!=0){
                System.out.print("토");
            }
            if(i%2==0){
                System.out.print("마");
            }
        }
    }

    public void inputPrimeTest1() {
        /* 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별해서 출력하세요.
         * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다."를 출력하면 됩니다.
         *
         * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 라고 출력 후
         * 정수를 다시 입력 받도록 하세요.
         *
         * 참고) 소수란?
         * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
         * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다.
         *
         * -- 입력 예시 --
         * 2보다 큰 정수를 하나 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 소수다.
         * */
        Scanner scan = new Scanner(System.in);
        boolean check = true;

        while(true){
            System.out.print("정수를 입력하세요 : ");
            int num = scan.nextInt();
            if(num<=1){
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }else{
                for(int i = 2 ; i<num ; i++){
                    if(num%i == 0){
                        check=false;
                        break;
                    }
                }
                System.out.println(check?"소수다":"소수가 아니다");
                break;
            }
        }
    }


    public void inputPrimeTest2(){

    }

    public void inputTest1(){
        /* 1부터 100 사이의 난수를 발생시키고
         * 정수를 입력 받아서 입력받은 정수가 발생한 난수보다 큰 경우 "입력하신 정수보다 큽니다."를,
         * 입력받은 정수보다 난수가 작은 경우 "입력하신 정수보다 작습니다."를 출력하며
         * 입력한 정수와 난수와 같은 경우가 될 때까지 난수 맞추기를 반복하는 프로그램을 만드세요.
         *
         * 단, 입력한 정수와 난수가 같은 경우 "정답입니다. n회 만에 정답을 맞추셨습니다."라고
         * 정답을 입력한 횟수도 함께 출력되도록 해야 합니다.
         * 첫 회부터 바로 난수를 맞추는 경우는 1회만에 정답을 맞춘 것입니다.
         *
         * 정답을 맞추는 경우 위 내용을 출력하고 프로그램이 종료되도록 작성하세요.
         *
         * -- 프로그램 예시 --
         * 정수를 입력하세요 : 5
         * 입력하신 정수보다 작습니다.
         * 정수를 입력하세요 : 3
         * 입력하신 정수보다 큽니다.
         * 정수를 입력하세요 : 4
         * 정답입니다. 3회만에 정답을 맞추셨습니다.
         * */
        int randomNumber = (int)(Math.random()*100)+1;
        System.out.println("randomNumber = " + randomNumber);
        int userInput;
        Scanner scan = new Scanner(System.in);
        int count = 0;

        do{
            System.out.print("정수를 입력하세요 : ");
            userInput = scan.nextInt();
            count++;
            if(randomNumber==userInput){
                System.out.println("정답입니다. " + count + "번만에 정답을 맞추셨습니다.");
            }else if(randomNumber>userInput){
                System.out.println("입력하신 정수보다 큽니다");
            }else if(randomNumber<userInput){
                System.out.println("입력하신 정수보다 작습니다.");
            }
        } while(userInput != randomNumber);

        }
}

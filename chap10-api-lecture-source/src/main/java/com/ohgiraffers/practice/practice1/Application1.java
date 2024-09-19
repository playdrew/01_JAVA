package com.ohgiraffers.practice.practice1;

import java.util.StringTokenizer;

public class Application1 {

    public static void main(String[] args) {

        String emp1 = "10/홍길동/총무부";
        String emp2 = "/김남호/영업부";
        String emp3 = "20//회계팀";

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        for(String i : empArr1){
            System.out.println(i);
        }

        for(String i : empArr2){
            System.out.println(i);
        }

        for(String i : empArr3){
            System.out.println(i);
        }


        StringTokenizer st1= new StringTokenizer(emp1,"/");
        StringTokenizer st2= new StringTokenizer(emp2,"/");
        StringTokenizer st3= new StringTokenizer(emp3,"/");

        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

        while(st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }
    }
}

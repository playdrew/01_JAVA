package com.ohgiraffers.practice.practice;

import java.sql.SQLOutput;
import java.util.Arrays;

public class DeepCopy {

    public static void main(String[] args) {

        int[] originArr = new int[]{1,2,3,4,5};

        print(originArr);

        int[] copyArr1 = new int[10];
        for(int i = 0 ; i< originArr.length; i++){
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);


        int[] copyArr2 = originArr.clone();
        print(copyArr2);


        int[] copyArr3 = new int[10];
        System.arraycopy(originArr,0,copyArr3,3,originArr.length);
        print(copyArr3);

        int[] copyArr4 = Arrays.copyOf(originArr,8);
        print(copyArr4);

    }

    public static void print(int[] 전달받은배열을저장할매개변수){

        System.out.println("전달받은 배열의 hashcode() : " + 전달받은배열을저장할매개변수.hashCode() );

        for(int i = 0 ; i<전달받은배열을저장할매개변수.length ; i++){
            System.out.print(전달받은배열을저장할매개변수[i] + " ");
        }

        System.out.println();

        return;
    }
}
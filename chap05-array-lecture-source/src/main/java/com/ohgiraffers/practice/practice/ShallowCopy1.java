package com.ohgiraffers.practice.practice;

public class ShallowCopy1 {

    public static void main(String[] args) {

        int[] originArr = new int[]{1,2,3,4};
        int[] copyArr = originArr;

        System.out.println("originArr = " + originArr.hashCode());
        System.out.println("copyArr.hashCode() = " + copyArr.hashCode());

        for(int i = 0 ; i<originArr.length ; i++){
            System.out.print(originArr[i] + " ");
        }

        System.out.println();

        for(int i = 0 ; i<copyArr.length ; i++){
            System.out.print(copyArr[i] + " ");
        }

    }
}

package com.ohgiraffers.practice.practice;

public class ShallowCopy2 {

    public static void main(String[] args) {
        
        int[]originArr1 = new int[]{1,2,3,4};
        System.out.println("originArr1.hashCode() = " + originArr1.hashCode());

        for(int i = 0; i< originArr1.length ; i++){
            System.out.print(originArr1[i]+" ");
        }

        print1(originArr1);
        
        int[]originArr2 = getCopyArr2();
        System.out.println("originArr2.hashCode() = " + originArr2.hashCode());
        for(int i = 0; i< originArr2.length ; i++){
            System.out.print(originArr2[i]+" ");
        }

        
    }
    
    public static void print1(int[] copyArr1){
        System.out.println();
        System.out.println("copyArr1.hashCode() = " + copyArr1.hashCode());
        for(int i = 0; i< copyArr1.length ; i++){
            System.out.print(copyArr1[i]+" ");
        }
        return;
    }

    public static int[] getCopyArr2(){
        int[]copyArr2={1,2};
        System.out.println("copyArr2.hashCode() = " + copyArr2.hashCode());
        for(int i = 0; i< copyArr2.length ; i++){
            System.out.print(copyArr2[i]+" ");
        }
        return copyArr2;
    }
}

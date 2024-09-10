package com.ohgiraffers.practice.practice3;

public class StaticFieldTest {

    private static int StaticFieldcount;
    private int nonStaticFieldCount;

    public int getStaticFieldcount(){
        return StaticFieldcount;
    }

    public int getNonStaticFieldCount(){
        return nonStaticFieldCount;
    }

    public void increaseStatic(){
        StaticFieldcount++;
    }
    public void increaseNonStatic(){
        nonStaticFieldCount++;
    }

}

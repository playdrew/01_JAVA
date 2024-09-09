package com.ohgiraffers.practice.practice2;

public class FinalFieldTest {
    
    private final int NON_STATIC_NUM = 1;

    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName){
        this.NON_STATIC_NAME = nonStaticName;
    }

    private static final Double PI = 3.14;


    private static final double STATIC_DOUBLE;
    static {
        STATIC_DOUBLE = 0.5;
    }




}

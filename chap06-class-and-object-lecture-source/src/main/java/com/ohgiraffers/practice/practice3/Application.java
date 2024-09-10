package com.ohgiraffers.practice.practice3;

public class Application {

    public static void main(String[] args) {

        StaticFieldTest sft1 = new StaticFieldTest();
        System.out.println("static : " + sft1.getNonStaticFieldCount());
        System.out.println("nonstatic : " + sft1.getStaticFieldcount());

        sft1.increaseNonStatic();
        sft1.increaseStatic();

        System.out.println("static : " + sft1.getStaticFieldcount());
        System.out.println("nonstatic :  " + sft1.getNonStaticFieldCount());

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println("static : " + sft2.getStaticFieldcount());
        System.out.println("nonstatic : " + sft2.getNonStaticFieldCount());

        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();
        StaticMethodTest.staticMethod();

    }
}

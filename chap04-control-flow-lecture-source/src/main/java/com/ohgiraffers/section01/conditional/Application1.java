package com.ohgiraffers.section01.conditional;

public class Application1 {

    public static void main(String[] args) {

        A_if a = new A_if();

        //a.testSimpleIfStatement1();
        //a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();

        //b.testSimpleIfElseStatement();
        //b.testNestedIfElseStatement();

        C_ifElseIf c = new C_ifElseIf();
        //c.testIfElseIfStatement();
        //c.testNestedIfElseIfStatement();
        //c.improveNestedIfElseIfStatement();
        //c.testnestedIfElseIfStatement1();
        //c.testnestedIfElseIfStatement2();
        c.testnestedIfElseIfStatement2();

        D_switch d = new D_switch();
        //d.testSwitchStatement();
        //d.testSwitchVendingMachine();

    }
}

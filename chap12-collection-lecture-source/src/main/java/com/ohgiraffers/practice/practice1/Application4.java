package com.ohgiraffers.practice.practice1;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        for(Integer i : integerStack){
            System.out.print(i + ", " );
        }

        System.out.println();
        System.out.println("integerStack.search(3) : " + integerStack.search(3));

        System.out.println("integerStack.peek() : " + integerStack.peek());

        System.out.println("integerStack.pop() : " + integerStack.pop());
        System.out.println("integerStack.pop() : " + integerStack.pop());
        System.out.println("integerStack.pop() : " + integerStack.pop());
        System.out.println("integerStack : " + integerStack );

    }
}

package com.ohgiraffers.practice.practice1;

import java.util.LinkedList;
import java.util.List;

public class Application3 {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("orange");
        linkedList.add("grape");
        linkedList.add("apple");

        for(String s : linkedList){
            System.out.print(s + ", ");
        }

        linkedList.add(0,"mango");

        System.out.println();

        for(String s : linkedList){
            System.out.print(s + ", ");
        }

        linkedList.set(1,"pineApple");
        System.out.println();

        for(String s : linkedList){
            System.out.print(s + ", ");
        }

        System.out.println();
        linkedList.clear();

        System.out.println(linkedList.isEmpty());






    }
}

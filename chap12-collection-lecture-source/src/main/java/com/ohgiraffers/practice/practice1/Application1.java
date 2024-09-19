package com.ohgiraffers.practice.practice1;

import java.util.*;

public class Application1 {

        public static void main(String[] args) {

            List list = new ArrayList();
            list.add(1);
            list.add("안녕");
            list.add(new Date()); // add test1

            for(Object o : list){
                System.out.print(o + " ");
            }

            System.out.println();

            list.add(0,2); // add test2

            for(Object o : list){
                System.out.print(o + " ");
            }

            list.remove(0); // remove test

            System.out.println();

            for(Object o : list){
                System.out.print(o + " ");
            }

            System.out.println();

            List<String> stringList = new ArrayList<>();

            stringList.add("banana");
            stringList.add("peach");
            stringList.add("grape");

            System.out.println();

            for(Object o : stringList){
                System.out.print(o + " ");
            }

            System.out.println();

            stringList.set(0,"mango"); // set test

            for(Object o : stringList){
                System.out.print(o + " ");
            }
            ;

            System.out.println();

            Collections.sort(stringList);

            for(Object o : stringList){
                System.out.print(o + " ");
            }

            System.out.println(); // Collections.sort 테스트






        }
    }

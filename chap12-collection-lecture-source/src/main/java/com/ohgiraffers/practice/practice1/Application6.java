package com.ohgiraffers.practice.practice1;

import java.util.HashSet;
import java.util.Iterator;

public class Application6 {

    public static void main(String[] args) {

        HashSet<String> hset = new HashSet();
        hset.add("java");
        hset.add("mysql");
        hset.add("html");

        System.out.println("hset = " + hset);

        hset.add(new String("java"));
        System.out.println("hset = " + hset);

        System.out.println("저장된 hset 객체의 수 " + hset.size());
        System.out.println("포함되어있는지 여부의 hset " + hset.contains("java"));

        Object[] setArr = hset.toArray();

        for(Object s : setArr){
            System.out.print(s + ", ");
        }
        System.out.println();

        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()){
            System.out.println("hset.iterator()출력 : "+ iter.next());
        }


    }
}

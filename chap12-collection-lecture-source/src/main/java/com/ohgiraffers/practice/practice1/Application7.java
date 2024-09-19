package com.ohgiraffers.practice.practice1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application7 {
    public static void main(String[] args) {

        TreeSet<String> tset = new TreeSet<>();
        tset.add("java");
        tset.add("mysql");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        System.out.println("tset = " + tset);

        Set<Integer> lotto = new TreeSet<>();
        while(lotto.size()<6){
            lotto.add((int)(Math.random()*45)+1);
        }
        System.out.println("이번 주 로또 당첨 번호는!!!");
        System.out.println(lotto);

        Set<Integer> lotto2 = new HashSet<>();
        while(lotto2.size()<6){
            lotto2.add((int)(Math.random()*45)+1);
        }
        System.out.println("이번 주 로또 당첨 번호는!!!");
        System.out.println(lotto2);





    }
}

package com.ohgiraffers.practice.practice1;

import java.util.*;

public class Application8 {

    public static void main(String[] args) {

        HashMap hmap = new HashMap();
        hmap.put("one",new Date());
        hmap.put(12,"red apple");
        hmap.put(33,123);

        System.out.println("hmap = " + hmap);
        System.out.println("=========================================");

        hmap.put(12,"yellow banana");

        System.out.println("hmap = " + hmap);
        System.out.println("=========================================");

        hmap.put(10,"yellow banana");
        hmap.put(11,"yellow banana");

        System.out.println("hmap = " + hmap);
        System.out.println("=========================================");

        System.out.println("hmap.get(12) = " + hmap.get(12));
        System.out.println("=========================================");

        System.out.println("hmap.size() = " + hmap.size());
        System.out.println("=========================================");

        hmap.remove(12);

        System.out.println("hmap = " + hmap);
        System.out.println("=========================================");

        Map<String,String> hmap2 = new HashMap<>();
        hmap2.put("one","java");
        hmap2.put("two","mysql");
        hmap2.put("three","jdbc");
        hmap2.put("four","mybatis");
        hmap2.put("five","jpa");

        System.out.println("hmap2 = " + hmap2);
        System.out.println("=========================================");

        Set<String> keySet = hmap2.keySet();
        Iterator<String> keyIter = hmap2.keySet().iterator();
        
        while(keyIter.hasNext()){
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println("key = " + key);
            System.out.println("value = " + value);
            System.out.println("(key = value) = " + (key = value));
        }
    }
}

package com.ohgiraffers.practice.practice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        List<Integer> integersList = new ArrayList<>();
        integersList = new LinkedList<>(integersList);
        integersList.add(3);
        integersList.add(2);
        integersList.add(5);
        integersList.add(6);

        System.out.println("integersList = " + integersList);

        Iterator<Integer> iter = ((LinkedList<Integer>)integersList).descendingIterator();
        List<Integer> integerList2 = new ArrayList<>();

        while(iter.hasNext()){
            integerList2.add(iter.next());
        }

        System.out.println("integerList2 = " + integerList2);
    }
}

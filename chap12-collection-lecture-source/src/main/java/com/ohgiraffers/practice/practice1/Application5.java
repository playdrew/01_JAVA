package com.ohgiraffers.practice.practice1;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();
        que.offer("안녕");
        que.offer("니하오");
        que.offer("봉주르");


        for(String s : que){
            System.out.print(s + ", ");
        }
        System.out.println("");
        System.out.println("===========================");

        System.out.println("que.peek() : " + que.peek());
        System.out.println("que.peek() : " + que.peek());
        System.out.println("que.peek() : " + que.peek());
        System.out.println(que);

        System.out.println("que.poll() : "  + que.poll());
        System.out.println("que.poll() : "  + que.poll());
        System.out.println("que.poll() : "  + que.poll());
        System.out.println(que);
    }
}

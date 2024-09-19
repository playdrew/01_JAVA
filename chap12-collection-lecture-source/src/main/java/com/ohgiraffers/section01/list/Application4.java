package com.ohgiraffers.section01.list;

import java.util.LinkedList;
import java.util.Queue;

public class Application4 {

    public static void main(String[] args) {

        // ㄷ는 한쪽 벽이 막힌 구조라고 하면 큐는 = 들어오는데로 나가요
        /*title. Queue 에 대해 이해하고 사용할 수 있다.*/

        /*comment.
        *   Queue
        *   선형 메모리 공간에 데이터를 저장하는
        *   선입선출(FIFO - First In First Out) 방식의 자료구조
        *   Queue 인터페이스를 상속받는 하위 인터페이스는 다양하지만
        *   대부분 LinkedList 를 이용해 인스턴스를 생성한다.*/

        //Queue 도 인터페이스이기 때문에 인스턴스 생성 불가.
        Queue<String> que = new LinkedList<>();

        //Queue 데이터 넣기 offer() 메소드를 이용한다.
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /*comment.
        *   Queue 에서 데이터를 꺼내는 방법은 2가지이다.
        *   peek() : 해당 큐에 가장 앞에 있는 요소(먼저들어온)를 반환한다
        *   poll() : 해당 큐에 가장 앞에 있는 요소 반환 후 제거
        * */

        System.out.println("peek() : " + que.peek()); // first
        System.out.println("peek() : " + que.peek()); // first
        // 삭제되지 않은 거 확인
        System.out.println("que = " + que);

        System.out.println("poll() : " + que.poll()); // first
        System.out.println("poll() : " + que.poll()); // second
        System.out.println("que = " + que);

        // 사이트 접속대기는 Stack 이 아니라 Queue 입니다. 어떠한 단점이 있기 때문에 이것을 썼다

        



    }
}

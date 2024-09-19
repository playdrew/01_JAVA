package com.ohgiraffers.section02.set;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {

    public static void main(String[] args) {

        /* title. Set 자료구조의 특성을 이해하고 HashMap 을 이용할 수 있다. */
        // set 을 이용해서 Map 을 쓸 수 있다 set 은 map 을 이해하기 위한 발판이다. 반복문을 사용할 수가 없어요 모든 클래스의 부모는 Object 다. HashCode()사용가능했던이유도 부모가 Object 였기 때문에

        /*comment.
        *   Set 인터페이스를 구현한 Set 컬렉션의 특징
        *   1. 요소의 저장 순서를 유지하지 않는다
        *   2. 같은 요소의 중복 저장을 허용하지 않는다. (null 값도 하나의 null 만 허용)
        *
        *  comment.
        *   HashSet 클래스
        *   Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        *   해시 알고리즘을 사용해서 검색 속도가 빠르다는 장점을 가지고 있다.
        * */


        HashSet<String> hset = new HashSet<>();
        hset.add(new String("java"));
        hset.add(new String("mysql"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));
        
        // 1. 저장 순서 유지 안 함.
        System.out.println("hset = " + hset); // hset = [css, java, mysql, jdbc, html] 저장하는 순서를 고려하지 않는다.
        
        // 2. 중복된 값 허용 여부 확인
        hset.add(new String("java")); // java 를 넣었음에도 불구하고 이미 있으므로 퉁침
        System.out.println("hset = " + hset); // hset = [css, java, mysql, jdbc, html]

        System.out.println("저장 된 객체의 수 : " + hset.size()); // 저장 된 객체의 수 : 5
        System.out.println("mysql 포함되어 있는지 확인 : " + hset.contains("mysql")); // mysql 포함되어 있는지 확인 : true

        /* comment.
        *   Set 은 저장 순서를 유지하지 않기 때문에
        *   저장된 객체를 하나씩 꺼낼 방법이 없다.
        **/
        
        /*Index. 1. toArray() 메소드를 이용해 배열로 변경후 반복문 사용*/
        // toArray -> Object 클래스
        Object[] arr = hset.toArray();

        for(int i = 0 ; i< arr.length ; i++){
            System.out.println(i + " : " + arr[i]);
        } // 0 : css 1 : java 2 : mysql  3 : jdbc 4 : html
        
        /*Index. 2. iterator() 반복자를 통해 목록화 연속 처리*/
        Iterator<String> iter = hset.iterator();

        while(iter.hasNext()){ // hasNext 요소가 있는지 없는지 true false
            System.out.println(iter.next()); // 조건문이 true 면 요소를 출력
        } //css java mysql jdbc html

    }
}

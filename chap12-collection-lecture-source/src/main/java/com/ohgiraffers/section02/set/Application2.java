package com.ohgiraffers.section02.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application2 {

    public static void main(String[] args) {

        /* title. TreeSet 에 대해 이해하고 사용할 수 있다. */

        // 이진트리 배열이라고 생각을 해봤을때 6이라는 값이 뒤의 인덱스에 있으면 인덱스를 일일이 체크하고 가요. 이진트리구조는 5라는 값을 찾는 다면 5는 6보다 작네 왼쪽
        //            >  o:3
        //    >  o:4  >  o:5
        // o:5
        //    >  o:8  > o:7
        //            > o:9
        // 하나의 노드는 자기보다 작거나 큰 요소를 연결하고 있어요 그럼 5라는 숫자를 찾아야해요 . 나보다 작으면 왼쪽 나보다 크면 오른쪽인듯 인덱스는 100이면 100개다 보는데 이진트리는 더 단순해서 속도 빠름
        // 하나의 노드가 왼쪽과 오른쪽이 있어요 주소를 가지고 있고 주소를 바꿔치기 하면 추가 제거 수정이 된다는 것입니다.

        /*comment.
        *   TreeSet 클래스는 데이터가 정렬된 상태로 저장하는
        *   이진 검색 트리 형태로 요소를 저장하게 된다.
        *   이진 검색 트리 구조는 데이터를 추가하거나 제거하는 등의
        *   기본 동작 시간이 매우 빠르다
        * */

        TreeSet<String> tset = new TreeSet<>();
        tset.add("java");
        tset.add("mysql");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");
        // 자동 오름차순 정렬 해준다. Set 을 상속받았으므로 중복도 안됩니다.
        System.out.println("tset = " + tset); // tset = [css, html, java, jdbc, mysql] 순서는 유지하지 않아요 데이터가 정렬된 상태로 저장을 해주어요 자동오름차순정렬이 됩니다.

        /*comment. 로또 번호 발생기 실습
            요구사항
        *   1. 로또 번호는 중복이 될 수 없다.
        *   2. 로또 번호는 오름차순 정렬로 나오게 한다. // 2번째 조건을 없애려면 Set 으로 만들면 되고 있으려면 TreeSet 으로 해요
        * */

        // 다형성을 적용해서 인스턴스 생성
        Set<Integer> lotto = new TreeSet<>(); // TreeSet 중복저장이 안되고 오름차순입니다.

        while(lotto.size()<6){
            lotto.add((int)(Math.random()*45)+1);
        }

        System.out.println("이번 주 로또 당첨 번호는!!!");
        System.out.println(lotto);


    }
}

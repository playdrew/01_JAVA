package com.ohgiraffers.section03.map;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {
        
        /* title. Map 의 자료구조에 대해 이해하고 HashMap 을 사용할 수 있다. */
        
        /* comment.
        *   Map 인터페이스의 특징
        *   일반적인 Collection 인터페이스와는 다른 저장 방식을 가지고 있다
        *   Map 의 가장 큰 특징은
        *   키(Key)와 값(value)를 하나의 세트로 저장하는 방식이다.
        * */

        /* comment.
        *   키(key) 란?
        *   값을 찾기 위한 이름 역할을 하는 객체를 의미한다. -> 변수의 역할
        *   1. 키는 중복저장을 허용하지 않지만, 키가 다르다면 값은 중복이 가능하다.
        *   2. 요소의 저장 순서를 유지하지 않는다.
        * */

        /* comment.
        *   Map 인터페이스를 구현한 클래스는 대표적으로
        *   HashMap, HashTable, TreeMap 등이 있다.
        *   이 3가지 크래스 중 HashMap 이 가장 많이 사용되며
        *   해시 알고리즘이 적용되어 검색 속도가 매우 빠른 특징을 가지고 있다.
        * */

        HashMap hmap = new HashMap();

        /* Index. 1. HashMap 인스턴스에 값 저장하기 */
        // put() : Map 에 값을 집어넣는 메소드
        // 모든 컬렉션에는 기본자료형이 들어갈 수 없다 그렇다면 왜 될까? 오토박싱 기본자료형을 인스턴스화를 시킨 것이에요
        hmap.put("one",new Date());
        hmap.put(12,"red apple");
        hmap.put(33,123);

        // 맵은 저장한 순서를 유지하지 않는다. 항상 키와 벨류를 셋트로 저장한다.
        // 값을 맡기면 해당하는 프레임워크가 값을 관리해주는 것
        System.out.println("hmap = " + hmap); // hmap = {33=123, one=Fri Sep 20 09:57:30 KST 2024, 12=red apple}

        /* Index. 2. 키는 중복 저장이 안된다(set 방식) */
        hmap.put(12,"yellow banana");
        // 키는 중복저장이 되지 않기 때문에 가장 최신의 키로 덮어쓰여진다.
        System.out.println("hmap = " + hmap); // hmap = {33=123, one=Fri Sep 20 10:01:24 KST 2024, 12=yellow banana}

        /* Index. 3. 값을 중복저장이 되는 지 확인 */
        // key 값이 중복되지 않는다면 value 는 중복 저장이 가능하다.
        hmap.put(11,"yellow banana");
        hmap.put(10,"yellow banana");
        System.out.println("hmap = " + hmap);

        /* Index. 4. Map 에 저장된 값 꺼내기 */
        System.out.println("12번 키에 해당하는 값 : " + hmap.get(12)); // 12번 키에 해당하는 값 : yellow banana

        hmap.remove(12);
        System.out.println("hmap = " + hmap); // hmap = {33=123, one=Fri Sep 20 10:08:26 KST 2024, 10=yellow banana, 11=yellow banana}

        // 저장 된 객체 수 확인 size()메소드
        System.out.println("hmap 에 저장된 객체 수 : " + hmap.size()); // hmap 에 저장된 객체 수 : 4

        // 지금까지 map 의 키나 값이 중구난방이었는데 제네릭을 사용해서 타입지정을 시켜줄 수 있습니다.
        // 다형성 적용해서 HashMap 만들기 맵을 상속받은 자식들 HashMap, HashTable, TreeMap 등등으로 인스턴스화한다
        Map<String,String> hmap2 = new HashMap<>();
        // hmap2.put(12,123); 이제는 타입을 지정했기 때문에 타입이 일치하지 않는다는 에러가 발생됩니다.
        // 키값은 String 을 권장하는 편 값은 Object 중 DTO 클래스가 많이 들어올 거에요
        hmap2.put("one","java");
        hmap2.put("two","mysql");
        hmap2.put("three","jdbc");
        hmap2.put("four","mybatis");
        hmap2.put("five","jpa");
        
        /* Index. 1. ketSet 을 이용해서 키만 따로 Set 으로 만들고 , iterator 로 목록만들기 */
        // keySet 은 해당하는 키값 원래 Map 이 었는데 Set 방식으로 만들어 준다는 것입니다.
        Set<String> keySet = hmap2.keySet(); // set 방식으로 바뀜
        // iterator 메소드를 호출하게 되면 맵에서 Set 이 되었다가 iterator 가 된거에요
        Iterator<String> keyIter = keySet.iterator(); // iterator 방식으로 바뀜

        /* Index. 2. Iterator 에서 제공하는 hasNext(), next() 메소드 사용해서 반복문  */
        while(keyIter.hasNext()){
            String key = keyIter.next();// 요소를 담아준다
            String value = hmap2.get(key);
            System.out.println(key);
            System.out.println(value);
            System.out.println(key + " = " + value);
        }
    }
}

// 리스트는 배열과 같은 느낌 셋은 랜덤한 박스에 넣는 것 셋은 순서를 저장하지 않아요 중복허용하지 않는다 맵계열은 랜덤한 박스에다가 값을 집어넣을 건데 하나만 넣는것이 아니라 두개의 공간으로 키와 벨류 두가지가 들어가게 되요. 우리가 벨류에 접근하기 위해선 키값을 알아야해요. 값에 접근하기 위한 열쇠(키) , 모든 컬렉션은 인터페이스

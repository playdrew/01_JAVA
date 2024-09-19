package com.ohgiraffers.section01.list;

import java.util.LinkedList;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        // list 는 List 란 인터페이스를 상속을 받는다는 뜻 LinkedList 의 특징이 뭐냐면 ArrayList 는 하나가 붙어있고 인덱스구문으로 정리가 된 반면 , LinkedList 는 값 주소를 가져서 바라보는 형태 자기 전이나 다음 요소를 1번째 요소이후로 가지고 있어요 번호가 매겨져있다 생각해요 실제론 번호가 매겨져있지 않지만 번호가 있다고 하면 0번 저 다음 승찬님을 알고 있고요 승찬님은 용운님과 평훈님을 알고 있고요 그외 등등.. 그렇게 알고 있는 주소 이전사람 다음사람 정보를 알게 되요. LinkedList 는 이중연결이라고도 합니다. 장점이 0번째 녀석말고 2번째 녀석을 0번다음에 오게 하면 link 를 끊고 위치를 바꾸는게 생각보다 쉬운듯. 바라보는 주소를 바꾸는 방식

        /* title. LinkedList 에 대해 이해할 수 있다. */

        /* comment.
        *   LinkedList
        *   ArrayList 가 배열을 이용해서 발생할 수 있는 성능적인 담점을
        *   보완하고자 나온 클래스이다.
        *   내부는 이중연결리스트로 구현되어있다.
        *   -> 인덱스 체계가 아닌 다음 요소에 대한 주소를 저장하는 방식
        * */

        // 단일이라는 것은 다음요소만 -> 로 참조하고 있다는 것 다음요소의 위치만 알기 때문에 이전요소를 아는 것은 불가능해요 그래서 나온게 이중 요소 연결인데 다음요소 전요소에 대한 정보도 가지고 있게 됩니다.
        /* comment.
        *   단일 연결 리스트
        *   저장한 요소가 순서를 유지하지 않고 저장되지만 , 이러한
        *   요소들 사이를 링크로 연결하여 구성하며
        *   마치 연결 된 리스트 형태인 것 처럼 만든 자료구조이다.
        *   요소의 저장과 삭제시 다음 요소를 가르키는 참조 링크만
        *   변경하면 되기때문에 ArrayList 보다 성능이 우수하다
        *   하지만 단일 연결 리스트는 다음 요소만 링크(참조)하기 때문에
        *   이전 요소로의 접근은 어렵다.
        *
        *  comment.
        *   이중 연결 리스트
        *   단일 연결 리스트는 다음 요소만 링크(참조)하는 반면, 이중 연결 리스트는
        *   이전 요소도 링크하여 이전 요소에 대한 접근도 쉽게 고안된 자료구조이다.
        *   LinkedList 가 이중 연결 리스트를 구현한 것이며, List 인터페이스를
        *   상속받아서 구현되어 ArrayList 와 사용방법이 거의 유사하다.
        *   하지만 내부적으로 요소를 저장하는 방식이 다르다는 것은 인지해야 한다!!
        * */

        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size()); // 요소의 개수 파악

        // 리스트라는 부모를 어레이리스트와 링크드리스트 둘다 상속을 받았기 때문에 상속받은 메소드는 거의 일치한다 보면 됩니다. 순서를 유지한다는 것을 확인하고요.
        for(int i = 0 ; i<linkedList.size();i++){
            System.out.println(i + "번 째 값 : " + linkedList.get(i));
        }

        for(String s : linkedList){
            System.out.println(s);
        }

        linkedList.set(0,"pineapple");
        System.out.println("linkedList = " + linkedList);

        // 리스트 내 모든 요소를 제거하는 메소드.
        linkedList.clear();

        // isEmpty() -> 비어있는 지 확인하는 메소드
        System.out.println(linkedList.isEmpty()); // true





    }
}

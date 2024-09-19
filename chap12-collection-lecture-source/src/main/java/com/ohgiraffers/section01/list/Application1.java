package com.ohgiraffers.section01.list;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /* title. 컬렉션 프레임워크에 대해 이해 할 수 있다. */


        /* comment.
        *   java 에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을
        *   쉽고 효과적으로 처리할 수 있도록 표준화된 방법을 제공하는
        *   클래스들의 집합을 의미한다
        *   즉, 누군가가 만들어둔 데이터를 효율적으로 저장하는 자료구조와
        *   알고리즘을 우리가 사용하는 것을 의미한다.
        * */
        
        /*comment.
        *   Collection 3가지의 인터페이스 중 한 가지를 상속받아 구현
        *   1. List 인터페이스
        *   2. Set 인터페이스
        *   3. Map 인터페이스
        * */
        
        /*comment.
        *   1. List 인터페이스
        *   - 순서가 있는 데이터의 집합으로 데이터 중복 저장 허용
        *   - Vector , ArrayList, LinkedList , Stack , Queue 등이 있다
        *   2. Set 인터페이스
        *   - 순서가 없는 데이터 집합으로 데이터 중복 저장을 허용하지 않음
        *   - HashSet , TreeSet 등이 있다.
        *   3. Map 인터페이스
        *   - 키와 값 한 쌍으로 이루어지는 데이터 집합
        *   - key 는 위에서 나온 Set 방식으로 관리하기 때문에
        *   - 데이터의 순서를 관리하지 않고 , Key 값은 중복을 허용하지 않는다.
        *   - key 는 중복이 될 수 없지만, key 값이 다르다면 value 는 중복이
        *   - 가능하다.
        *   - MashMap, TreeMap, HashTable, Properties 등이 있다.
        * */

        /*comment.
        *   이번 클래스는 List 계열을 다루게 될 것이다.
        *   - ArrayList (매우 중요 , 매우 많이 사용이 됨. )
        *   - 가장 많이 사용이 되는 컬렉션 클래스
        *   - 내부적으로 배열을 이용해서 요소를 관리하며, 인덱스를 이용해
        *   - 배열의 요소에 빠르게 접근을 할 수 있다.
        * */

        /*comment.
        *   ArrayList 는 배열의 단점을 보완하기 위해 만들어졌다.
        *   배열은 크기를 변경할 수 없고, 요소의 추가 , 삭제 , 정렬 등이 복잡하다.
        *   ArrayList 는 이러한 단점을 해결하기 위해
        *   크기 변경 , 요소의 추가 , 삭제 , 정렬 기능을 미리 메소드로 만들어서
        *   우리에게 제공을 해주고 있다.
        * */

        // ArrayList 인스턴스를 생성하면 10칸 짜리의 배열을 만들어준다.
        ArrayList alist = new ArrayList();
        // 인터페이스는 생성자를 가질 수 없기 때문에 직접적으로 인스턴스 생성이 불가능하다.
        // 그러면 어떻게 해야할까?
        // List 인터페이스를 상속받은 클래스로 인스턴스를 생성하면 된다.
        // List list = new List();
        // List 를 상속받은 ArrayList 클래스를 이용해서 인스턴스 생성
        // 이 과정이 다형성이다.
        // ArrayList alist = new ArrayList(); 로 하면 ArrayList 기능밖에 못써요 List list = new ArrayList()는 (List)부모의 기능도 쓸수있다
        /*comment.
        *   다형성을 적용해서 상위 레퍼런스로 ArrayList 객체를 만들 수 있다.
        *   List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
        *   레퍼런스 타입은 List 로 하는 것이 더 유연한 코드를 작성하는 방법이다.*/
        List list = new ArrayList();

        // list 에 값을 추가하는 방법
        alist.add("apple");
        alist.add(123);     // auto-boxing 처리가 됨
        alist.add(45.67);   // int , double 이러한 기본(원시)값을 객체 -> Integer , Double
        alist.add(new Date());

        // toString 메소드가 Overriding 되어 있기 때문에
        // 주소값이 출력이 안되고, 값이 나오고 있다.
        // 출력해보면 우리가 작성한 순서대로 값이 들어있는 것을 확인 할 수 있다.
        System.out.println("alist = " + alist); // 원래라면 객체라는 타입들은 주소값이 나와야하는데 넣었던 값이 잘 들어있어요 Object 클래스에 toString이 오버라이딩되어있는 것 , 대괄호의 의미 배열이라는 것 저장순서의 보장 , add 한 순서대로 출력 [apple, 123, 45.67, Thu Sep 19 10:49:30 KST 2024]

        System.out.println("alist 의 크기 " + alist.size());
        
        // 인덱스로 관리를 한다 ? -> for 문 즉 반복문을 사용해서 규칙적으로 접근 가능
        for(int i = 0 ; i < alist.size(); i++){
            // 인덱스에 해당하는 값을 가져올 때는 get() 메소드를 사용한다.
            System.out.println(i + "번째 인덱스의 값 : " + alist.get(i));
        }

        // 데이터의 중복저장 허용 확인
        alist.add("apple");
        System.out.println("alist = " + alist); // alist = [apple, 123, 45.67, Thu Sep 19 10:58:43 KST 2024, apple] 저장순서는 유지해주지만 중복된 값을 저장할 수 있다. 컬렉션의 장점 정렬 추가 삭제 같은 것도 할 수 있어요 
        
        // 원하는 인덱스 위치에 값을 추가해보기  // add(Object e) add(int inde , Object element ) 메서드 오버로딩 기능
        // 새로운 값이 들어갈 인덱스를 지정하면
        // 한 칸씩 밀려서 값이 들어가게 된다.
        alist.add(1,"바나나");
        System.out.println("alist = " + alist);

        alist.remove(1);
        System.out.println("alist = " + alist);

        // 지정된 위치의 값을 수정
        alist.set(1, Boolean.valueOf(true)); // set 의 역할은 덮어쓰기
        System.out.println("alist = " + alist);

        // 타입을 <>안의 값으로 지정해 준다 다형성을 이용해서 ArrayList<>()로 만들어준다
        /*comment.
        *   모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 지정되어 있다.
        *   따라서 우리가 <>내부에 타입을 지정하면 해당하는 공간은
        *   지정한 타입 외에는 사용할 수 없게 된다.*/
        List<String> stringList = new ArrayList<>();
        stringList.add("apple"); // 타입지정전에는 Object e 였는데 지정이후엔 String e 이 떠요
        // 제네릭 문법으로 타입을 지정하게 되면 , 지정한 타입 외에 값은 저장할 수 없다
        //stringList.add(123); Required Type String 인데 Provided 는 int 여서 안돼요
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");
        // 제네릭을 타입으로 가둬버리면 잘못입력하는 것을 방지 지정한 타입외의 값은 컴파일에러가 발생 ; 런타임에러가 훨씬 위협적 그렇기에 제네릭으로 타입지정해주면 타입의 안정성보장이 됩니다.

        System.out.println("stringList = " + stringList); // stringList = [apple, orange, banana, mango, grape]

        /*comment.
        *   정렬 기능도 사용할 수 있다
        *   저장 순서를 유지하고 있는 stringList 를 오름차순 정렬
        * */

        Collections.sort(stringList);
        System.out.println("stringList = " + stringList); // stringList = [apple, banana, grape, mango, orange]

        /*comment.
        *   조금 복잡하지만, 내림차순 정렬도 가능하다.
        *   하지만 ArrayList 에서는 내림차순 정렬을 제공하지 않고
        *   List 의 또 다른 구현체인 LinkedList 에서 제공을 한다.
        * */

        // List<String> stringList = new LinkedList<>(StringList); 아래와 같은 구조
        stringList = new LinkedList<>(stringList); // () 안에 값을 집어넣어서요 ArrayList 를 LinkedList 로 바꿔준셈

        /*comment.
        *   Iterator(반복자)란?
        *   Collection 인터페이스의 iterator 메소드를 이용해서
        *   인스턴스를 생성할 수 있다.
        *   컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용
        *   반복자라고 불리우며, 반복문을 통해서 값을 하나씩 꺼내기 위한 용도이다.
        *   인덱스로 관리되는 컬렉션이 아닌 경우는 반복문을 사용해서 요소에 접근할 수
        *   없기 때문에 인덱스를 사용하지 않고도 반복문을 쓰기 위한 목록을 만들어주는
        *   역할이라고 보면 된다.
        *   hasNext() : 다음 요소를 가지고 있으면 true , 아니면 false
        *   next() : 다음 요소 반환
        * */

        //인덱스로 관리되는 녀석이 아니라면 반복문을 사용할 수 없다는 단점이 있어요 그래서 Iterator 가 나왔어요 일렬로 된 자료구조가 아니라 흩어져 있는 경우 인덱스체계가 아니라 반복문을 사용할수없어요 그래서 나온게 Iterator 인데 흩뿌려진 녀석을 하나의 목록으로 만들어줍니다. 목록형태로 만들어줘서 hasNext() 라고 하면 커서 형식으로 가게 되요 . 마지막 녀석이 오게 되면 false 가 나와요
        //클래스가 아닌 인터페이스 -> 직접적으로 인스턴스를 만들 수 없음
        //Iterator<String> dIter = stringList 타입은 list 타입 요구하는 것은 Iterator 타입이기에 강제로 클래스 형변환
        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator(); // descendingIterator() 내림차순

        /*comment.
        *   dIter 라는 레퍼런스 변수에 내림차순한 결과를 담았기 때문에
        *   다시 한번 ArrayList 로 옮길 것이다.*/

        List<String> descList = new ArrayList<>();

        while(dIter.hasNext()){
            descList.add(dIter.next());
        }

        System.out.println("descList = " + descList); // descList = [orange, mango, grape, banana, apple]
    }
}

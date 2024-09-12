package com.ohgiraffers.section01.string;

public class Application2 {

    public static void main(String[] args) {
        
        /*title. 문자열 객체를 만드는 방법과 인스턴스가 생성되는 방식*/
        
        /*comment.
        *   문자열 객체를 만드는 방법
        *   "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. 같은 문자열에 대해서 공간을 heap 에 만들지 않는 것
        *   new String("문자열")
        * */

        /*comment.
        *   리터럴 형태로 만든 문자열 인스턴스는 동일한 값을 가지게 되면
        *   하나의 인스턴스로 관리하게 된다. (싱글톤과 유사한) 따라서 주소값을 비교하는
        *   == 연산으로 비교 시 서로 동일한 주소를 비교하여 true 를 반환한다.*/

        String str1 = "java";
        String str2 = "java"; //String 클래스지만 은 너무나도 많이 써서 new 가 생략되어있다. str1 번과 str2 번은 같은 공간을 바라보고 있어요
        String str3 = new String("java"); // new 라는 건 같은 리터럴일지어도 새로운 공간을 넣어준다는 것입니다.
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2)); // true 객체를 만들었다라고 표현했는데 같아요 왜 일까요. 하나의 객체를 공유하는 싱글톤의 형태입니다.
        System.out.println("str3 == str4 : " + (str3 == str4)); // false 뉴(new)라는 키워드를 만나면 항상 새로운 공간을 만들어준다.

        str1 += "mysql";
        /*comment.
        *   문자열의 가장 큰 특징은 불변이다.
        *   기존 문자열에 + 연산을 수행하는 경우 문자열을 수정하는 것이 아닌,
        *   새로운 문자열을 할당하게 된다.
        * */
        
        /*하나의 공간에 java 를 += o를 넣었을때 java 라는 공간에 o가 들어가는 것이 아닌 새로운 공간에 javao 가 들어가는 것이다*/
        System.out.println("str1 == str2 : " + (str1 == str2)); // false

        /*comment.
        *   equals() : 인스턴스를 비교하는 것이 아닌(주소값) 문자열값을
        *   비교하여 동일한 값을 가지는 경우 true , 다른 값을 가지는 경우
        *   false 를 반환하도록 되어 있다.
        *   따라서 인스턴스 생성 방식과 상관 없이 같은 지를 확인하기
        *   위해서는 == 연산 대신, equals() 메소드를 사용해야 한다.
        * */

        System.out.println("str2.equals(str3) : " + str2.equals(str3)); // true
        System.out.println("str2.equals(str4) : " + str2.equals(str4)); // true

    }
}

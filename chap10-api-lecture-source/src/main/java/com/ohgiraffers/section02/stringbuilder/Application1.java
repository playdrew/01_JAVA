package com.ohgiraffers.section02.stringbuilder;

public class Application1 {

    public static void main(String[] args) {

        /*title. String 과 StringBuilder 의 차이점을 알 수 있다.*/

        /*comment.
        *   String StringBuilder 의 차이
        *   String
        *   : 불변이라는 특성을 가지고 있다
        *   문자열에 + 연산으로 합치기를 하는 겨웅에는
        *   기존의 인스턴스를 수정하는 것이 아닌 새로운 인스턴스를 반환한다
        *   따라서 문자열이 변경이 많이 일어나는 경우에는 성능상에 좋지 않다.
        *   하지만 반대로 변하지 않는 문자열 같은 경우에는 오히려 좋다
        *   StringBuilder
        *   : 가변이라는 특성을 가지고 있다
        *   append()라는 메소드를 이용해서 문자열 합치기를 할 수 있는데
        *   기존의 인스턴스를 수정할 뿐, 새로운 인스턴스를 만들지 않는다.
        *   따라서 잦은 변경이 일어나는 문자열의 경우 String 보다 성능이 좋다.
        * */

        /*서블릿이 있는데 화면을 반환 문자열을 반환할때 씁니다.
        * 구식이긴 합니다. */

        String str = "java";
        System.out.println(str); // 원래 toString 붙여야하지만 이미 오버라이드 되어있으므로 없어도 toString()값이 나옵니다.

        //toString() 메소드가 오버라이딩 되어 있어 주소가 아닌 값이 나온다.
        StringBuilder sb = new StringBuilder("java");
        System.out.println("sb = " + sb); // 원래 주소값이 나와야 하지만 실행을 하게 되면 toString 이 오버라이드 되었기 때문에 toString 없이도 toString 값이 나옵니다.
        System.out.println("sb의 hashcode() : " + sb.hashCode());

        //append("합칠문자열");
        sb.append("mysql");
        System.out.println("sb = " + sb);
        
        /*comment.
        *   hashcode() 를 확인했을 때, 인승턴스가 동일한 것을 확인했다
        *   즉, 문자열을 변경했다고 해서 새로운 인스턴스가 생성된 것이 아니다*/

        System.out.println("문자열 합치기 후 sb의 hashcode() : " + sb.hashCode());
        //java
        //sb = java
        //sb의 hashcode() : 603742814
        //sb = javamysql
        //문자열 합치기 후 sb의 hashcode() : 603742814
        // String은 문자열을 합치면 공간의 수정이 일어나는데 스트링빌더는 가변이라 아니다.



    }
}

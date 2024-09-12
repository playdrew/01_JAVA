package com.ohgiraffers.section01.string;

public class Application1 {

    public static void main(String[] args) {

        /*title. String 클래스의 자주 사용하는 메소드에 대해 숙지할 수 있다.*/

        /*comment.
        *   charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자 반환
        * */

        //()가 붙은 이유는 method 입니다. 배열에는 없어요.
        String str1 = "apple";
        for(int i = 0 ; i<str1.length() ; i++){
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

        /*comment.
        *   concat() : 문자열에 인자로 전달 된 문자열을 합치기
        *   새로운 문자열을 반환한다.
        *   단, 원본 문자열에는 영향을 주지 않는다.
        * */

        String str2 = "java";
        String str3 = "mysql";

        //자바랑 mysql 두게가 있는데 합치게 해서 javamysql 로 만들고 싶은 것이에요

        System.out.println("concat() 메소드 활용 : " + (str2.concat(str3)));
        //단 원본 문자열에는 영향을 미치지 않는다.
        //concat() 동작후 str2의 값 java
        //concat() 동작후 str3의 값 mysql
        System.out.println("concat() 동작후 str2의 값 : " + str2);
        System.out.println("concat() 동작후 str3의 값 : "  + str3);

        /*comment.
        *   trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
        * */

        String trimStr = "   java   ";
        System.out.println("trimStr : @" + trimStr + "@"); // 공백확인용 @
        //trimStr : @   java   @
        //trim() : @java@
        //trimStr : trimStr =    java
        System.out.println("trim() : @" + trimStr.trim() + "@");
        System.out.println("trimStr = " + trimStr); // 역시 원본은 영향받지 않는다.
        
        /*comment.
        *   toLowerCase() : 모든 문자를 소문자로 바꿔줌
        *   toUpperCase() : 모든 문자를 대문자로 바꿔줌
        *   마찬가지로 원본에는 영향을 미치지 않는다.
        * */

        String caseStr = "JavaMySQL";
        // toLowerCase() : javamysql
        // toUpperCase() : JAVAMYSQL
        // caseStr = JavaMySQL
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());
        System.out.println("caseStr = " + caseStr);
        
        /*comment.
        *   subString() : 문자열의 일부를 잘라내어 새로운 문자열 반환
        * */

        String str4 = "javaMySQL";
        //전달인자로 3과 6 ( 인덱스 3~6까지만 출력하고 나머진 짜른다 )
        //substring(3,6)
        //substring(3) 메소드 오버로드 입니다 같은 이름을 사용하데 메소드 시그니쳐가 다르면 사용할 수 있다고 했잖아요 . 전달인자에 따라서 같은 메소드 이름을 쓸 수 있다.
        System.out.println("substring(3,6) : " + str4.substring(3,6)); //aMy
        System.out.println("substring(3) : " + str4.substring(3)); //aMySQL
        System.out.println("str4 = " + str4); // str4 = javaMySQL 원본에 영향을 미치지 않는다.

        /*comment.
        *   replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 사용한다.
        * */-
        
        //주민번호 뒤에 *표시나오게 하는거 substring 과 함께 사용
        System.out.println("replace() : " + str4.replace("java","python"));
        System.out.println("str4 = " + str4); // str4 = javaMySQL 원본에 영향을 미치지 않는다.

    }
}

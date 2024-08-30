package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*title. Scanner. 사용시 주의사항 */

        /*comment.
        *  스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰 단위로 분리해서
        *  읽어오게 됩니다.
        *  그래서 크게 2가지 사항을 주의해야 한다.
        *  1. next() 로 문자열을 입력 받은 후 정수,실수,논리값 입력받을때
        *  2. 정수,실수,논리값 입력 후 next()로 문자열 입력 받을때
        * */

        /*Index. 1. 스캐너 객체 생성*/
        Scanner sc = new Scanner(System.in);

        /*Index. 1-1. next()로 문자열 입력 받은 후 정수 , 실수 , 논리값 입력 */
        System.out.print("문자열을 입력해주세요 : "); // hi world next는 띄어쓰기가 날라가는데.. world 가 정수칸에 들어가 그래서 InputMismatchException 뜸문자열을 쓸때 nextLine()을 쓰는 것 추천
        String str1 = sc.next();
        System.out.println("str1 = " + str1);

        /*comment.
        *  컴파일 에러가 일어나고 있지는 않다. => 번역에는 문제가 없다.
        *  hi 만 입력을 하고 정수를 입력하면 정상적으로 동작을 한다
        *  하지만, hi world 를 입력하게 되면 숫자를 입력하지 않았음에서
        *  InputMismatch 오류가 발생하게 된다.
        *  ->공백이 있는 문자열을 입력해야 된다 = nextLine()을 쓰면 됩니다.
        *  ->sc.nextLine();을 호출 중간에 넣어만 줘도 해결이 된다. // 리터럴 상태로 한 줄 담아주기 . hi world 치면 world 가 여기에 갇히게 되는 셈입니다.
        * */

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1);

        /*Index. 2. 정수 실수 논리값 입력 후 nextLine()으로 문자열을 입력 받을 때 */

        System.out.print("다시 한번 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);


        /*comment.
        *  입력을 받을 시 nextLine()을 호출한 것이 아직 행을 바꾸지 않고
        *  한 라인을 읽어드린다고 판단을 해서 아무것도 잃지 못하고 다음 출력 구문을 실행한 것이다
        *  이걸 해결하기 위해서는 sc.nextLine()호출 전에 미리 sc.nextLine()을 한 번 호출하면
        *  그 행을 읽어드리는 걸 다음 행으로 넘기게 되고 그 이후
        *  새로 입력 받은 한 라인을 읽어와서 str2에 저장하게 된다.
        * */

        System.out.print("공백이 있는 문자열 하나 입력해주세요 : ");
        sc.nextLine(); // 공백이 있는 문자열 하나 입력해주세요 : str2 =  이라고 뜹니다 . 숫자 입력 다음 숫자입력하면 앞의 글이 뜹니다. 그래서 이것을 적어서 막습니다.
        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);

    }
}

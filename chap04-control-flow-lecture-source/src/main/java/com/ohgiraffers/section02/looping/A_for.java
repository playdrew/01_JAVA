package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /*title. for 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /*comment.
         *  [for 문 표현식]
         *  for ( 초기식 ; 조건식 ; 증감식 ) {
         *       조건을 만족하는 경우 수행할 구문(반복구문);
         *  }
         * */

        // 반복작업을 쉽게 하기 위해 만든 반복문

        // index. 1. 1~10까지 1씩 증가시키면서 i 값을 출력하는 반복문
        // 초기식 : int i = 1;
        // 조건식 : i <= 10
        // 증감식 : i++ ( ++i 해버리면 2부터 시작하기 때문에요 근데 또 정상적으로 되는데.. i=i+1도 됩니다.)

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        } // 1 2 3 4 5 6 7 8 9 10

        //다음 코드는 조건식을 항상 만족하므로 무한으로 -됩니다
        //for(int i = 1 ; i<=10 ; i--){
        //    System.out.println(i);
        // }
        //System.out.println("안녕");
        //안녕이라는 값은 실행되지 않습니다 왜냐하면 위의 식이 끝나지 않기 때문입니다.

        //다음코드는 조건식을 만족하지 않기 때문에 없는 코드입니다.
        //for(int i = 1 ; i>=10 ; i--){
        //    System.out.println(i);
        // }

        //다음 코드는 제대로 작동하는데 역순으로 작동합니다.
        //for(int i = 10 ; i>=1 ; i--){
        //    System.out.println(i);
        //} // 10 9 8 7 6 5 4 3 2 1

        return;
    }

    public void testForExample1() {

        /*title. 무엇을 반복하는지를 확인해서 반복문으로 개선할수있다.*/
        /*comment.
         *  10명의 학생이름을 입력 받아 이름을 출력해보자.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1번째 학생의 이름은 " + student1 + "입니다");

        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
        String student2 = sc.nextLine();
        System.out.println("2번째 학생의 이름은 " + student2 + "입니다");

        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
        String student3 = sc.nextLine();
        System.out.println("3번째 학생의 이름은 " + student3 + "입니다");

        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
        String student4 = sc.nextLine();
        System.out.println("4번째 학생의 이름은 " + student4 + "입니다");

        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
        String student5 = sc.nextLine();
        System.out.println("5번째 학생의 이름은 " + student5 + "입니다");

        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
        String student6 = sc.nextLine();
        System.out.println("6번째 학생의 이름은 " + student6 + "입니다");


        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
        String student7 = sc.nextLine();
        System.out.println("7번째 학생의 이름은 " + student7 + "입니다");

        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
        String student8 = sc.nextLine();
        System.out.println("8번째 학생의 이름은 " + student8 + "입니다");

        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
        String student9 = sc.nextLine();
        System.out.println("9번째 학생의 이름은 " + student9 + "입니다");

        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
        String student10 = sc.nextLine();
        System.out.println("10번째 학생의 이름은 " + student10 + "입니다");

        /*comment.
         *  반복해야하는 내용
         *  -1. 안내 문구
         *  -2. 학생의 이름을 입력 받아 변수에 저장
         *  -3. 저장된 이름을 출력
         * */

        System.out.println("================================================");

        // i<11 보단 i<=10이 일반적임
        // 위의 코드와 거의 동일하게 작동합니다. for 문이 좀 더 좋은 코드입니다.

        /*comment.
         *   둘 중 어떤 코드가 좋은 코드일까?
         *   둘 다 좋은 코드다 WHY? -> 요구사항을 만족했기 때문에 좋은 코드다.
         *   하지만 반복문을 사용하는 것이 더 좋은 코드다.
         *   1. 보다 간결하게 작성이 되었다. (즉 가독성이 올라갔습니다 )
         *   2. 학생의 이름 뿐 아니라, 성적이나 이름을 입력하는
         *       기능도 추가를 해야한다면? (유지 보수성 상승)
         *   */

        // 암기가 아닌 흐름을 이해

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은" + student + "입니다.");
        }

        return;
    }

    public void testForExample2() {
        /*Index. 2. 1부터 10까지 합계를 구하시오*/
        // 초기식 int i = 1;
        // 조건식 i<=10
        // 증감식 i++

        // 반복문 미사용
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;
        // 합계를 저장하는 변수
        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;
        System.out.println("sum = " + sum);

        System.out.println("======================================");

        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 += i;
        }
        System.out.println("sum2 = " + sum2);

        return;
    }

    public void testForExample3() {

        /*Index. 1. 문제
         *   5~10까지의 난수를 발생시켜서
         *   1부터 발생한 난수까지의 합계를 구해보자*/

        //초기식 int i = 1 <- 1부터 더하니까
        //조건식 i<= random <- 우리가 만든 random 이라는 것보다만 적으면 됩니다.
        //증감식 i++

        //결과를 담을 변수
        int sum = 0;
        int random = (int) (Math.random() * 6) + 5;

        for (int i = 1; i < random; i++) {
            sum += i;
        }

        System.out.println("1부터 " + random + "까지의 합은 : " + sum);

        return;
    }

    public void testForExample4(){
        int sum =0;
        Random random = new Random();
        int rand = random.nextInt(6)+5;

        for (int i = 1; i < rand; i++) {
            sum += i;
        }

        System.out.println("1부터 " + rand + "까지의 합은 : " + sum);
    }
}

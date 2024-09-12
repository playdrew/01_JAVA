package com.ohgiraffers.section03.wrapper;

public class Application1 {

    public static void main(String[] args) {

        /* title. Wrapper 클래스에 대해서 알 수 있다. */

        //원시자료형을 인스턴스화 시킨것
        /*comment.
        *   상황에 따라서 원시타입(ex int, boolean , char , ...) 의 데이터를을
        *   인스턴스화 해야 하는 경우가 생기게 된다.
        *   이 때 기본 타입의 데이터를 먼저 인스턴스로 변환 후
        *   사용해야 하는데 8가지의 기본 타입 데이터를
        *   인스턴스화 할 수 있도록 하는 클래스를 Wrapper 클래스 라고 한다.
        *   (주방에서 사용하는 랩(Wrap) 과 같은 의미로 감싼다라는 의미 */

        /*collection 은 배열의 상위호환 배열은 공간지정 그 범위만큼만 넣는데 컬렉션과 제너릭에서 그 한계를 뛰어넘을 수 있어요
        * 컬렉션은 값을 수집합니다. 값을 보관하는 것입니다. 배열도 같은 자료형으로 보관했듯이 값을 보관하는데 컬렉션을 특징중에 하나가
        * 원시타입은 보관못하고 객체를 보관하는데 특화되어있어요 정수자료형을 여러개 보관하고 싶다라면 Integer 로 바꿔서 보관해야합니다.*/

        /*comment.
        *   기본타입                래퍼클래스
        *     byte                     Byte
        *    short                    Short
        *      int                  Integer
        *     long                     Long
        *    float                    Float
        *   double                   Double
        *     char                Character
        *  boolean                  Boolean
        * */

        /*comment.
        *   박싱(Boxing) 과 언박싱(Unboxing)
        *   기본(원시)타입을 래퍼클래스로 인스턴스화 하는 것을 Boxing 이라고 하며,
        *   래퍼클래스로 인스턴스화 된 것을 기본타입으로 변경하는 것을 Unboxing 이라고 한다. */

        int intValue = 20; // 기본타입 20이라는 값을 인스턴스화 시키고 싶어요
        Integer boxingNumber = new Integer(intValue); // 인스턴스화 - 박싱, 생성자 이용
        Integer boxingNumber2 = Integer.valueOf(intValue); // 클래스명.메소드명으로 static 입니다. valueOf라는 메소드에 인스턴스화 시키고 싶은 값 intValue를 해요
        System.out.println("boxingNumber = " + boxingNumber);
        System.out.println("boxingNumber2 = " + boxingNumber2);
        
        // Unboxing -> 인스턴스화 된 값을 기본타입으로 변경
        int unBoxingNumber = boxingNumber; // auto-unboxing 이 된 것 옛날에는 안되었습니다. boxingNumber.intValue(); 값을 호출했어야 했습니다.

        /*comment.
        *   오토 박싱(Auto Boxing) 오토 언박싱(Auto UnBoxing)
        *   jdk 1.5 부터는 박싱과 언박싱이 필요한 상황에는 컴파일러가 자동으로
        *   (묵시적)처리해준다.*/
        
        // 자동형변환 같은 것

        // 오토박싱 : 원시타입의 intValue 를 자동으로 Integer 타입에 대입
        Integer boxingNumber3 = intValue;
        
        // 오토 언박싱 : Integer 타입의 boxingNumber3 를 원시타입에 대입
        int unBoxingNumber2 = boxingNumber3;

        
        


    }

}

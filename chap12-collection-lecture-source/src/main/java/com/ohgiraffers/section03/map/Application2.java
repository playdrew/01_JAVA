package com.ohgiraffers.section03.map;

import java.io.*;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {

        /* title. Properties 에 대해 이해 할 수 있다. */

        /* comment.
        *   Properties 란?
        *   HashMap 을 구현하여 사용 방법이 거의 유사하지만
        *   차별점은 key 와 value 모두 문자열만 사용할 수 있다는 것이다
        *   사용하는 예시는 대부분 설정 관련 파일의 값을 읽어
        *   어플리케이션에 적용하기 위해 사용한다.
        * */

        // Properties 는 값의 의미를 가졌다. 설정관련 파일의 값
        // 제네릭이 없는데 String 으로 고정되기 때문에 쓸 필요가 없다고 합니다 .
        Properties prop = new Properties();

        // 값 설정
        prop.setProperty("drive","com.mysql.cj.jdbc.Driver"); // setter 메소드
        prop.setProperty("url","jdbc:mysql//localhost/menu");
        prop.setProperty("username","ohgiraffers");
        prop.setProperty("password","ohgiraffers");

        // 순서저장하지 않음 , map 의 형태와 비슷하나 키와 벨류 모두다 String 형태라는 것입니다.
        System.out.println("prop = " + prop); // prop = {password=ohgiraffers, drive=com.mysql.cj.jdbc.Driver, url=jdbc:mysql//localhost/menu, username=ohgiraffers}

        // Writer writer 객체 ,
        // 예외처리 -> 파일의 입력과 출력에 대한 것은 예외처리를 강제화 해두었다.
        // 아웃풋은 출력 인풋은 입력
        // stream 은 driver.dat driver.txt driver.xml 에 대한 통로를 만들어준셈입니다.
        try {
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
            prop.store(new FileWriter("driver.txt"),"jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        /* Index. 1. Output 으로 파일을 내보냈다. 그러면 인제 내보낸 파일을 읽어보자 */
        Properties prop2 = new Properties();
        // Reader reader , InputStream 가져올꺼다 ,
        // try 구문에서 에러(예외)발생시 catch 에서 예외를 낚아첸다.
        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));

            // list() -> Properties 의 모든 키와 값 목록을 내보내기 한다.
            prop2.list(System.out); // 외부에 있는 파일을 읽어온셈
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

// Stream : 연결통로 , 해당하는 application2 번과 해당하는 파일(driver.dat , driver.txt , driver.xml)과의 통로를 만들어 준것이에요 파일을 외부에서 읽으려는데 외부에 파일이 없어요 내부에 읽으려는데 이미 내부에 있내요 그래서 반드시 예외처리구문을 만들어주도록 해요
// 예외처리 https://github.com/fasfalsfslakfjlsakjflkasjf 라고 치면 깃허브에서 예외처리를 했어요 not Found Exception 이름을 찾지 못했다라고 예외처리를 한 것이에요 예외처리를 하지 않으면 하얀페이지에 이상한게 나와요 근데 얘는 페이지로 오류처리를 해서 없는 사용자를 보여주는 페이지를 만든것이에요 . 오류나는 페이지가 아니라 이런 페이지가 나오게끔 했다 예외처리를 통해서요
// 런타임익셉션 어플리케이션을 프로그램이 코드를 쭉 읽는데 그 읽는 와중에 발생하는 에러를 런타임에러 코드를 쓰는 도중 생기는 에러는 컴파일에러 
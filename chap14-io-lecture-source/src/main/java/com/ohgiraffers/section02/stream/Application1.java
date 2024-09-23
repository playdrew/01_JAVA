package com.ohgiraffers.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        /* title. 입출력 스트림에 대해 이해하고 파일을 대상으로 하는 inputStream 에 대해 알 수 있다. */

        /* comment.
        *   입출력 스트림 개요
        *   프로젝트를 만들거나, 프로그래밍을 할 때, 많은 종류의 데이터를 다뤄야 한다.
        *   하지만 데이터는 프로그램 내부에 있을 수도 있지만, 프로그램 외부에서
        *   데이터를 가져와 사용해야 할 경우도 존재한다.
        *   또한 프로그램에서 만든 데이터를 외부 파일로 출력할 경우도 존재한다
        * */

        /* comment.
        *   외부데이터란, 프로그램 외부에 존재하는 모든 데이터를 의미한다.
        *   하드디스크 상의 파일이 될 수도 있고, 네트워크 상에 존재하는 자원이
        *   될 수도 있다.
        *   따라서 해당하는 데이터를 가져오거나 내보낼 때 가정 먼저 해야 할 일은
        *   *자바 프로그램과 외부 데이터를 연결 하는 것이다.*
        *   연결하는 길을 스트림(Stream) 이라고 한다.
        *   스트림은 단방향이다.
        *   즉 데이터를 읽어오기 위한 통로는 입력스트림
        *   데이터를 내보내기 위한 통로는 출력스트림
        *   --
        *   그 중 InputStream 과 Reader 는 데이터를 읽어오기 위한 스트림
        *   OutputStream 과 Writer 는 데이터를 출력하기 위한 스트림
        * */

        // 파일을 읽어오는 객체
        FileInputStream fin = null; // FileInputStream 은 1byte 로 읽어오기 때문에 한글은 3byte 이기에 깨집니다.

        try {
            
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt"); // 파일을 읽어오려는데 파일이 없으면 어떻할건지 에 대해서 예외처리를 반드시 해주어야해요 텍스트파일에 입력한 안녕을 읽어오고싶어요 파일입풋스트림의 통로를 열어주었으면 우리가 닫아주어야해요
            
            //read() : 파일에 기록 된 값을 순차적으로 읽어오고
            //         더 이상 읽을 데이터가 없으면 -1 값을 반환

            int value;

            // 한글 한글자는 3byte 이기 때문에 1byte 씩 읽어오면
            // 글자가 깨지게 된다.
            while((value=fin.read()) != -1){
                System.out.println(value);
                System.out.println((char)value);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            /* comment.
            *   finally -> try/catch 블럭에서
            *   오류를 잡더라도 실행시키는 영역
            *   finally 블록에서 사용한 자원을
            *   닫아준다.
            * */
            // fin 이 null 이 아니면 통로가 만들어졌다면
            if(fin != null){
                /* comment.
                *   사용한 연결통로를 닫아주는 메소드
                *   close();
                *   1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우
                *   리소스에서 메모리 누수(leak) 가 발생하게 된다.
                *   2. close 는 반드시 마지막 에 작성해야 한다.
                * */
                try {
                    fin.close(); // close() 메소드도 throw 를 하고 있기 때문에 try/catch 로 감싸준다.
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}

package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        /* title. File 클래스의 사용 용법을 이해할 수 있다. */

        /* comment.
        *   파일 처리를 수행하는 대표적인 클래스이다.
        *   대상 파일에 대한 정보로 인스턴스를 생성하고
        *   파일의 생성, 삭제 등등을 처리하는 기능을 제공하고 있다.
        * */

        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt"); // 기본 생성자에 전달할 필요가 있음. 경로를 써달라는 것 같아요 path 경로

        try {

            // 파일 생성이 완료되면 boolean 타입으로 true/false 반환
            boolean createSuccess = file.createNewFile();// throw 를 던지고 있기 때문에 반드시 예외처리를 해주어야합니다. 반환타입은 불리언이니 변수 불리언으로 만들어서 확인해요 챕터에 우클릭 리로드 프롬 디스크하면 경로에 지정한 파일이 생성되는 것을 확인할 수 있다. 경로를 입력할 일 이미지파일을 화면상 대입을 하게 되는게 이런 주소같은게 명료하게 적혀있어야 해요 경로 찾을 수 없다라는 문구는 경로를 잘못적었다는 것입니다
            System.out.println("createSuccess = " + createSuccess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 영문자 한글자는 1byte , 한글 1글자는 3byte
        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath()); // getter 메소드
        System.out.println("파일의 상위경로 : " + file.getParent());
        System.out.println("파일의 절대경로 : " + file.getAbsolutePath());
        
        // 파일의 삭제
        boolean isDelete = file.delete(); // delete 메소드가 있고 boolean 타입으로 리턴을 해주는 것 같아요
        System.out.println("isDelete = " + isDelete);

        // 만들어진 파일과 데이터를 입력하고 가져오는 것을 확인을 해볼꺼에요


    }
}

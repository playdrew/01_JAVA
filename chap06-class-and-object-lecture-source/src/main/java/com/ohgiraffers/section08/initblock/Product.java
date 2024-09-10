package com.ohgiraffers.section08.initblock;

public class Product {

    /*Index. 1. 필드를 초기화 하지 않으면 JVM 이 정한 기본값으로 객체 만들어짐*/

//    private String name;                // 제품 이름
//    private int price;                  // 제품 가격
//    private static String brand;        // 제품 브랜드
    
    /*Index. 2. 명시적 초기화*/
    //선언과 동시에 값을 입력해서 넣는 것

    private String name = "갤럭시";
    private int price = 2000000;
    private static String brand = "삼성";

    /*Index. 3. 인스턴스 초기화 블럭*/
    {
        name = "애플";
        price = 1000000;
        brand = "사과";
        //어느시점에 동작하는지 출력문 작성
        System.out.println("인스턴스 초기화 블럭 동작함...");
    }
    
    //new 라는 키워드가 있어야 name price 가 있어요 
    //static 은 new 를 만나지 않은 상황이어서 빨간불
    static {
        /*comment.
        *   static 초기화 블럭은 non-static 필드를 초기화 할 수 없다
        *   static 초기화 블럭은 클래스 로드 시에 동작하기 때문에
        *   동작 시점에는 인스턴스가 존재할 수 없어
        *   인스턴스 변수는 초기화 할 수 없다
        * */
        //name = "화웨이";
        //price = 2000;
        brand = "헬지";
        System.out.println("정적 초기화 블럭 동작함...");
    }

    //정확한 시점 알기 위해서 생성자도 선언
    public Product(){
        System.out.println("기본 생성자 동작함...");
    }

    public Product(String name, int price, String brand) {
        this.name=name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수가 있는 생성자 호출됨");
    }

    public String getInfo() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price + ", brand=" + Product.brand +
                '}';
    }
}

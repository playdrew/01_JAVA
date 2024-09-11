package com.ohgiraffers.section02.superkeyword;

import java.time.LocalDateTime;

public class Product {

    private String code;                        // 상품 코드
    private String brand;                       // 제조사
    private String name;                        // 상품명
    private int price;                          // 가격
    private LocalDateTime manufacturingDate;    // 제조일자

    public Product(){
        System.out.println("Product 의 기본 생성자 호출됨...");
    }

    public Product(String code, String brand, String name, int price, LocalDateTime manufacturingDate) {

        /*comment.
        *   Product 클래스는 아무런 클래스도 상속받고 있지 않지만
        *   super()가 호출이 되고 있다
        *   => 결론. 모든 클래스는 우리가 명시적으로 작성하고 있지는 않지만
        *   => Object 라고 하는 클래스를 상속받고 있다는 뜻이다.*/

        super(); // Product 클래스는 아무것도 상속받지 않았는데 super 가 되네요 ctrl 누르고 들어가바요 그랬더니 Object (객체) 클래스가 나와요
        // 클래스는 객체이지만 객체는 클래스일까요? 아니에요 . 모든 클래스는 Object 라는 녀석을 상속받고 있어요 보이지는 않지만 알게 모르게 사용해서
        // hashcode clone toString equals 이런 걸 자연스럽게 쓰는거에요 모든 클래스는 객체를 상속받고 있기 때문에요
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product 의 모든 필드를 초기화 하는 생성자 호출됨...");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDateTime manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }


    //Object 가 가진 toString 이라는 메소드를 우리가 입맛에 맞게끔 수정을 한 것 재작성 한것
    // public String toString() 을 getInfo()로 수정
    public String getInfo() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}

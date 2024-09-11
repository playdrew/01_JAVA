package com.ohgiraffers.section02.superkeyword;

import java.time.LocalDateTime;

public class Computer extends Product{

    //코드상 컴퓨터는 제품이나 제품은 컴퓨터가 아닙니다.
    //부모가 가진 필드 뿐만 아니라 CPU MEMORY RAM 확장시킴
    private String cpu;             // cpu
    private int hdd;                // hdd
    private int ram;                // ram
    private String os;              // 운영체제

    public Computer(){
        System.out.println("Computer 클래스의 기본 생성자 호출됨");
    }

    //alt insert 하면 뭔가 2개가 나오는데 아래 걸로 작성 product()와 product(...)로 product(...)클릭
    public Computer(String code, String brand, String name, int price, LocalDateTime manufacturingDate, String cpu, int hdd, int ram, String os) {
        //컴퓨터라는 클래스는 자기자신의 것뿐만 아니라 부모의 것도 초기화 할수있어요. 부모의 필드도 초기화할수 있다는 것이에요 눈에는 보이지 않지만.
        //super 라는게 추가가 되었어요 
        /*comment. 부모의 모든 필드를 초기화하는 생성자로 값 전달*/
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;




        System.out.println("Computer 클래스의 부모 필드도 같이 초기화 하는 생성자 호출함...");
    }

    //alt insert 하면 뭔가 2개가 나오는데 아래 걸로 작성 product()와 product(...)로 product()클릭
    public Computer(String cpu, int hdd, int ram, String os) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;

        System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출됨...");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    //ctrl o 단축키
    @Override
    public String getInfo() {
        //출력을 해줄때 부모의 필드만 출력된다 super.getInfo() 이것만 하면요 그래서 + 로 작성
        return super.getInfo() + "Computer [" + "cpu=" + this.cpu
                + ", hdd" + this.hdd
                + ", ram" + this.ram
                + ", os" + this.os;
    }
}



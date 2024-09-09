package com.ohgiraffers.section03.dto;

/*comment. 
*   DTO , Dto , VO <- 데이터를 묶어두기 위한 클래스
* */

public class MemberDTO {

    private int memberNo;           // 회원번호
    private String name;            // 회원이름
    private int age;                // 나이
    private char gender;            // 성별
    private double height;          // 키
    private double weight;          // 몸무게
    private boolean isActivated;    // 회원탈퇴여부

    /*comment.
    *   설정자(setter) 와 접근자 (getter) 는 실무에서 암묵적으로 통용되는
    *   규칙이 존재한다.
    * */
    
    /*comment. 
    *   설정자의 작성 규칙
    *   - 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로
    *   선언을 하고 , 호출 당시 전달되는 매개변수의 값을 이용하여 필드값을 변경
    *   [표현식]
    *   public void setName(String name){
    *       this.name = name;
    *   }
    *   -> set필드명(매개변수){
    *       this.필드명 = 매개변수;
    *   }
    * */

    /*comment.
    *   접근자 작성 규칙
    *   - 필드의 값을 반환 받을 목적의 메소드 집합을 의미한다
    *   필드에 접근을 해서 setter 를 통해 적용된 값을 return 을 통해
    *   반환을 하게 되며, 이 때 반환 타입은 반환하려는 값의 자료형과 일치
    *   [표현식]
    *   public 자료형 get필드명(){
    *       return 반환값;
    *   }
    *   */

    /*Index. 1. setter(설정자) 작성*/
    // 해당하는 필드에 우리가 전달한 memberNo를 대입하겠다
    // alt + insert 단축키
    public void setMemberNo(int memberNo){
        this.memberNo=memberNo; // this.memberNo에 매개변수로 받고 있는 memberNo를 대입
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    /*Index. 2. getter(접근자) 작성*/
    public int getMemberNo(){
        return memberNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }
}

// VO는 Value OF의 약자 DTO 는 DATE TRANSFER OBJECT 의 약자
// memberDTO member = new memberDTO();
// member.setMemberNo(); 소괄호에 (1)을 넣으면 setMemberNo(int memberNo) 에서 (매개변수)소괄호에 담는다며음에
// this.memberNo에 넣는 다는 것입니다. 매개변수와 필드명이 동일하면 this 를 생략하면 안됩니다
// setting 으로 1이라는 값을 전달했다면 return 을 하면 1이될것입니다. getter 에서요
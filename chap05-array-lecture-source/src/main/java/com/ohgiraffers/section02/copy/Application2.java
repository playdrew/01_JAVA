package com.ohgiraffers.section02.copy;

public class Application2 {

    public static void main(String[] args) {

        /*title. 얕은 복사를 활용해서 매개변수와 리턴값으로 활용할 수 있다.*/
        /*comment.
        *  얕은 복사의 활용
        *  얕은 복사를 활용하는 것은 주로 메소드 호출시 인자로 사용하는 경우와
        *  리턴 값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
        * */

        String[]names = {"푸바오", "러바오","아이바오"};
        //String[]names1 = {"푸바오1", "러바오1","아이바오1"}; 메소드가 없으면 반복문을 여러개 사용하니까요. 코드가 길어짐

        // 얕은 복사 확인을 위한 hashcode()구문
        System.out.println("names 배열의 hashcode() : " + names.hashCode());

        //우리가 만든 배열을 출력하는 기능을 가진 메소드를 전달
        //우리가 값을 보내면 -> 받는 곳도 값을 담을 준비를 해야한다.
        /*Index. 1. 인자와 매개변수로 활용하는 얕은 복사*/
        print(names);
        //조평훈(names); sout(조평훈[0])

        //print 영역에서는 names 영역이 없어요
        //names 배열의 hashcode() : 918221580
        //baoFamily 의 hashcode() : 918221580

        /*Index. 2. 리턴값으로 활용*/
        String []animals = getAnimals() ;
        print(animals);

        System.out.println("리턴 받은 animals 의 hashcode(): " + animals.hashCode());
        //컴퓨터가 쭉내려다가 메소드로 감
        //getAnimals 가 animals 로 바뀌는 거에요

    }

    //comment. print()메소드의 역할은 우리가 전달한 배열을 출력하는 역할이다.
    //이 메소드는 해당하는 배열을 전달받아야 합니다. print()을 괄호안에 print(names)라고 적어서요 이것만 적으면 빨간불인데
    //클래스는 아닙니다. static 이기 때문에요. 메소드의 매개변수가 없기 때문입니다 .. void print() 에 print(String[]names)라고 적으면 됩니다
    //String[]baoFamily = names; 지금이게 얕은 복사에요 names 주소값을 baoFamily 에 담았으므로 주소값을 대입해서 같은 값을 바라보는 것이기 때문입니다.
    // ..void print(String[]names) 이면 안좋은 이유 String[] names = names ,, 두 names 는 달라요.
    public static void print(String[] baoFamily){

        System.out.println("baoFamily 의 hashcode() : " + baoFamily.hashCode() );

        //baoFamily.length 를 3으로 바꾸면 오류가 나요 
        //메소드를 names animals 도 쓰는데 animals 는 배열을 2칸만 만들었기 때문이에요
        //리터럴값보다는 제공해준 기능을 주는 것이 좋다
        for(int i = 0 ; i< baoFamily.length; i++){
            System.out.print(baoFamily[i] + " ");
        }

        System.out.println();

        return;

        // 구지 얕은 복사를 하는 이유 0 인덱스 값이 항상 '조평훈' 되어야 한다의 경우
        // 배열이 100개가 되면 일일이 다써야할까요 아니죠.
        // public static void 조평훈(String[]hi){
        // hi[0] = "조평훈"
        // }

        //메서드의 역할 반복되는 구문을 한군데로 두어서 간략하고 편하게 작성한다.
    }

    public static String[] getAnimals(){

        String[]animals = {"후이바오","루이바오"};

        System.out.println("새로만든 animals 의 hashcode() : " + animals.hashCode());
        return animals;
    }

}

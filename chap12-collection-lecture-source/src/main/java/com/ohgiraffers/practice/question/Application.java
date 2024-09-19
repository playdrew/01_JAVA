package com.ohgiraffers.practice.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        List<BookDTO> bookDTOS = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        bookDTOS.add(new BookDTO(1,"책1권","김용욱",15000));
        bookDTOS.add(new BookDTO(2,"책2권","홍길동",10000));
        bookDTOS.add(new BookDTO(3,"책3권","김남욱",12000));
        bookDTOS.add(new BookDTO(4,"책4권","차은우",13000));

        for(int i = 0 ; i<bookDTOS.size(); i++){
            System.out.println(bookDTOS.get(i));
        }

        System.out.print("책 넘버를 입력해주세요 : ");
        int bookNum = sc.nextInt();
        sc.nextLine();
        System.out.print("책 이름을 입력해주세요 : ");
        String bookName = sc.nextLine();
        System.out.print("책 저자를 입력해주세요 : ");
        String bookAuthor = sc.nextLine();
        System.out.print("책 가격을 입력해주세요 : ");
        int price = sc.nextInt();

        new BookDTO(bookNum,bookName,bookAuthor,price);

        System.out.print("몇 번째 자리에 책을 꽂아두고 싶습니까 : ");
        int num00 = sc.nextInt();
        bookDTOS.add(num00,new BookDTO(bookNum,bookName,bookAuthor,price));

        for(BookDTO i : bookDTOS){
            System.out.println(i);
        }





    }

}

package com.ohgiraffers.practice.question;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        ArrayList<BookDTO> bookDTOArrayList = new ArrayList<>();
        bookDTOArrayList.add(new BookDTO(1,"책1권","첫번째저자",50000));
        bookDTOArrayList.add(new BookDTO(2,"책2권","두번째저자",10000));
        bookDTOArrayList.add(new BookDTO(3,"책3권","세번째저자",40000));
        bookDTOArrayList.add(new BookDTO(4,"책4권","네번째저자",30000));


        for(int i = 0 ; i<bookDTOArrayList.size() ; i++){
            System.out.println(bookDTOArrayList.get(i));
        }

        System.out.print("책 넘버를 적어주세요 : ");
        int bookNum = scan.nextInt();
        scan.nextLine();
        System.out.print("책 이름을 적어주세요 : ");
        String bookName = scan.nextLine();
        System.out.print("책 저자를 적어주세요 : ");
        String bookAuthor = scan.nextLine();
        System.out.print("책 가격를 적어주세요 : ");
        int price = scan.nextInt();

        BookDTO book = new BookDTO(bookNum,bookName,bookAuthor,price);

        System.out.print("책 넣고싶은 자리를 선정해주세요 : ");
        int num = scan.nextInt();
        bookDTOArrayList.add(num,book);

        for(BookDTO b : bookDTOArrayList){
            System.out.println(b);
        }



    }
}

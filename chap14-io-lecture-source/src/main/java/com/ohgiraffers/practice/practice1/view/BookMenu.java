package com.ohgiraffers.practice.practice1.view;

import com.ohgiraffers.practice.practice1.BookDTO;
import com.ohgiraffers.practice.practice1.controller.BookManager;

import java.util.Scanner;

public class BookMenu {

    private BookManager bm = new BookManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        while(true){

            System.out.println("*** 도서 관리 프로그램***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체출력");
            System.out.println("6. 끝내기");
            System.out.println("*** 도서 관리 프로그램***");
            int choice = sc.nextInt();

            switch (choice){
                case 1 :
                    bm.addBook(inputBook());
                    break;
                case 2 :
                    bm.displayAll();
                    break;
                case 3 :
                    System.out.print("삭제할 도서 넘버 : ");
                    int index = inputBookNo();
                    bm.deleteBook(index);
                    break;
                case 4 :
                    System.out.print("검색할 도서 제목 : ");
                    String title = inputBookTitle();
                    bm.searchBook(title);
                    break;
                case 5 :
                    bm.displayAll();
                    break;
                case 6 :
                    return;
            }
        }

    }

    public BookDTO inputBook() {
        System.out.print("책 넘버를 입력해주세요 : ");
        int bNo = sc.nextInt();
        System.out.print("책 카타고리를 정해주세요 : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("책 제목을 정해주세요 : ");
        String title = sc.nextLine();
        System.out.print("책 저자를 적어주세요 : ");
        String author = sc.nextLine();
        return new BookDTO(bNo,category,title,author);
    }

    public int inputBookNo() {
        return sc.nextInt();
    }

    public String inputBookTitle() {
        return sc.nextLine();
    }
}

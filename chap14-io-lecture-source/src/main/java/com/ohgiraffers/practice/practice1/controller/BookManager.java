package com.ohgiraffers.practice.practice1.controller;

import java.util.ArrayList;

public class BookManager {

    ArrayList<BookDTO> books = new ArrayList<>();


    public BookManager(){}

    public void addBook(BookDTO book){
        books.add(book);

    }

    public void deleteBook(int index){
        System.out.print("삭제 할 책 번호 : ");
        books.remove(index);
    }

    public void searchBook(String title){

        if(books.isEmpty()){
            System.out.println("책이 목록에 없습니다.");
        } else {
            for(BookDTO book : books){
                if(book.getTitle().equals(title));
                System.out.println(book);
            }
        }


    }

    public void displayAll(){
        for(BookDTO book : books){
            System.out.println(book);
        }
    }

}

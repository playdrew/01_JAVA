package com.ohgiraffers.practice.practice1.controller;

import com.ohgiraffers.practice.practice1.BookDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class BookManager {

    ArrayList<BookDTO>books = new ArrayList<>();


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

    public void sortedBookList(int num){

        printBookList(num);
        displayAll();

    }

    public void printBookList(int num){
        if(num==1){
            Collections.sort(books, new Comparator<BookDTO>() {
                @Override
                public int compare(BookDTO o1 , BookDTO o2){
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            });
            for(BookDTO bookDTO : books){
                System.out.println(bookDTO);
            }
        }else if(num==2){
            Collections.sort(books, new Comparator<BookDTO>() {
                @Override
                public int compare(BookDTO o1, BookDTO o2) {
                   return o2.getTitle().compareTo(o1.getTitle());
                }
            });
        }

    }
}

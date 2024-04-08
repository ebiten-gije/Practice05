package com.javaex.ex10;

public class Book {
    
    public int bookNo;
    public String title;
    public String author;
    public int stateCode;
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	stateCode = 1;
    }
    
    public int getBookNo() {
    	return bookNo;
    }
    public String getTitle() {
    	return title;
    }
    public String getAuthor() {
    	return author;
    }
    public void setBookNo(int bookNo) {
    	this.bookNo = bookNo;
    }
    public void setTitle(String title) {
    	this.title = title;
    }
    public void setAuthor(String author) {
    	this.author = author;
    }
    
    public void rent() {
    	stateCode = 0;
    	System.out.println(title + "이(가) 대여되었습니다.");
    }

    public void print() {
    	if (stateCode == 1) {
    		System.out.println("재고 있음");
    	} else {
    		System.out.println("대여중");
    	}
    }
}

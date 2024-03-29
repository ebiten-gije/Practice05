package com.javaex.ex10;

public class Book {
    
    public int bookNo;
    public String title;
    public String author;
    public int stateCode = 1;
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
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
    

}

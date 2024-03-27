package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Goods() {
		
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.printf("상품명: %s, 가격: %d원%n", name, price);
	}
}





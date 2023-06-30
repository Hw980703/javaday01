package com.kh.day05.oop;

public class Book {
		// 제목과 저자를 나타내는 필드를 가진 Book 클래스를 작성하고
		// 생성자를 작성하여 필드를 초기화 하여라!
	
	 public String Title;
	 public String writer;
	
	
	public Book(){
		Title ="";
		writer = "";
	}
	
	public Book(String title) {
		Title = title;
	}
	
	public Book(String Title,String writer) {
		this.Title = Title;
		this.writer = writer;
	}
	
	
}

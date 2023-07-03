package com.kh.day06.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {
		public static void main(String[] args) {
			Book[] books = new Book[2];
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("제목을 입력하세요:");
			String title = sc.nextLine();
			System.out.println("저자를 입력하세요:");
			String author = sc.nextLine();
			books[0] = new Book(title,author);
			System.out.println(books[0].title);
			System.out.println(books[0].author);
			
			System.out.println("(" + books[0].title +"," +books[0].author +")");
		
			
			System.out.println("제목을 입력하세요:");
			 title = sc.nextLine();
			System.out.println("저자를 입력하세요:");
			 author = sc.nextLine();
			books[1] = new Book(title,author);
			System.out.println(books[1].title);
			System.out.println(books[1].author);
			
			System.out.println("(" + books[1].title +"," +books[1].author +")");
			
		}
}

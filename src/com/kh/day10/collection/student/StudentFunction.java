package com.kh.day10.collection.student;

import java.util.Scanner;
import java.util.*;

public class StudentFunction {
	
//	Student[] students;
//	int index;
	
	List<Student> stdList;
	
	public StudentFunction() {
		
		stdList = new ArrayList<Student>();
	}
	
	
	public  int printMenu() { 
	Scanner sc = new Scanner(System.in);
	System.out.println("학생 성적 관리 프로그램");
	System.out.println("1. 학생 정보 입력");
	System.out.println("2. 학생 정보 출력");
	System.out.println("3. 재평가 대상자 여부");
	System.out.println("4. 프로그램 종료");
	System.out.print("  선택 : ");
	
	
	int select = sc.nextInt();
	return select;
	}
	public  void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("1차 점수 : ");
		int num1 = sc.nextInt();
		System.out.println("2차 점수 : ");
		int num2 = sc.nextInt();
		
		Student std = new Student(name , num1,num2);
		stdList.add(std);
			
		
		
	}
	public  void checkPass() {
		
	}
	public  void printInfo() {
		
		for (Student student : stdList) {
			System.out.println(student.toString());
			
		}
		
//		for ( int i=0; i<stdList.size(); i++) {
//			System.out.println(stdList.get(i).toString());
//			
//		}
	}
	
	public void searchInfoByName() {
		System.out.println("학생 정보 이름 검색");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		
		for (Student std : stdList) {
			if (std.getName().equals(searchName)) {
				System.out.println(std.toString());
			}
		}
	}
	
}

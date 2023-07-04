package com.kh.day07.oop.polymorphism.instnceof;

public class Exam_InstanceOf {
	
	//person = new studnet();
	//person = new Reasearcher();
	//person = new studentworker();
	
	static void print(person person) {
		if (person instanceof student) {
		System.out.println("student 입니다.");}
		else if (person instanceof Researcher){
			System.out.println("Researcher 입니다.");
		}	else if (person instanceof studentworker){
			System.out.println("studentworker 입니다.");
		}
		}
	
	
	static void print(student studnet233) {
		System.out.println("sutdent 입니다.");
	}
	
	static void print(Researcher Researcher) {
		System.out.println("Researcher 입니다.");
		
	}
	
	static void print(studentworker studentworker) {
		System.out.println("studentworker 입니다.");
		
	}
	
	static void print(Professor professor) {
		System.out.println("Professor 입니다.");
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("실행테스트");
			
		student student = new student();
		print(student);
		
		Researcher researcher = new Researcher();
		print(researcher); 
		
//		Professor professor = new Professor();
		
//		print(professor);
		
		print(new studentworker());
		

	}
}

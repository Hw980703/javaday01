package com.kh.day10.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.kh.day10.collection.student.Student;

public class Exam_MapCollection {
	public static void main(String[] args) {
		
		Map<String, Student> stds =  new HashMap<String,Student>();
		stds.put("one", new Student("타이타닉",44,46));
		stds.put("two", new Student("자바",88,44));
		
		System.out.println("첫번째 학생 : " + stds.get("one"));
	}
	
	
	
	
	
	
	public void mapExample2() {
		// 맵은 Map<키,밸류> 로 만들어짐
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "손풍기");
		objMap.put("price", 1500);
		objMap.put("isgood", true);
		System.out.println("상품 이름은 : " + objMap.get("name"));
		System.out.println("가격은 " + objMap.get("price") + "원");
		String result = (boolean)objMap.get("isgood") ? "추천" : "비추천";
		System.out.println("추천여부는 "+result);
		
		
		
	}

	public void mapExamPle1() {
		Map<String, String> map = new HashMap<String, String>();
		String number = "02";
		if (number.equals("02")) {
			System.out.println("서울 입니다.");
			map.put("02", "서울");
			map.put("031", "경기도");
			map.put("061", "전라도");
			map.put("053", "대구");
			System.out.println("저장 된 데이터의 수 : " + map.size());
			System.out.println("02를 누르면 서울이 나옵니다 : " + map.get("02"));
			System.out.println("031을 누르면 경기도가 나옵니다 : " + map.get("031"));
			for (;;) {
				Scanner sc = new Scanner(System.in);
				System.out.println("지역번호 입력 : ");
				String regionCode = sc.next();
				System.out.println("입력하신 지역번호에 대한 지역은 : " + map.get(regionCode));

			}
		}

	}
}

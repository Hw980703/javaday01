package com.kh.day10.collection.list;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListRun {
	
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		List<Student> sList = new ArrayList<Student>();
		
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		
		for (int i=0; i< sList.size(); i++) {
			System.out.println(sList.get(i).toString());
		}
		
		strList.add("딸기");
		strList.add("복숭아");
		strList.add("바나나");
		strList.add("포도");
		
		
		System.out.println("첫번째 : "+strList.get(0));
		System.out.println("두번째 : "+strList.get(1));
		System.out.println("세번째 : "+strList.get(2));
		System.out.println("네번째 : "+strList.get(3));
	}
		
			public void genericExample() {
		RList<Integer> list = new RList<Integer>();
		list.add(10);
		list.add(26);
		list.add(923);
		
		int num = list.get(0);
		System.out.println(num);
			}
//		ObjectList objList = new ObjectList();
//		
//		objList.add(10);
//		objList.add("월");
//		objList.add('A');
//		
//		Object obj  = objList.get(0);
//		System.out.println(obj);
//		
//		int num = (int)obj;
//		
//		Object obj2 = objList.get(1);
//		String str = (String)obj2;
//		//Type mismatch: cannot
//		//오브젝인데 왜 스트링을 하려고해
//		//다운캐스팅으로 스트링 넣어줌
//		
//		char cOne = (char)objList.get(2);
//		
////	int [] nums = new int[3];
//		intList nums = new intList();
//		nums.add(1);
//		nums.add(2);
//		nums.add(3);
//		
//		// int result=nums[0];
//		int result = nums.get(0);
//		System.out.println(result);
//		
//		int size = nums.size();
//		System.out.println(size);
//		
//		nums.clear();
//		System.out.println(nums.get(2));
	
	
	public void ojectExample() {
	ObjectList objList = new ObjectList();
		
		objList.add(10);
		objList.add("월");
		objList.add('A');
		
		Object obj  = objList.get(0);
		System.out.println(obj);
		
		int num = (int)obj;
		
		Object obj2 = objList.get(1);
		String str = (String)obj2;
		//Type mismatch: cannot
		//오브젝인데 왜 스트링을 하려고해
		//다운캐스팅으로 스트링 넣어줌
		
		char cOne = (char)objList.get(2);
		
//	int [] nums = new int[3];
		intList nums = new intList();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		// int result=nums[0];
		int result = nums.get(0);
		System.out.println(result);
		
		int size = nums.size();
		System.out.println(size);
		
		nums.clear();
		System.out.println(nums.get(2));
		
	}
	
}

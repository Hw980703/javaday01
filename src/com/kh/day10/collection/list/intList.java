package com.kh.day10.collection.list;

public class intList {
	//필드
	int [] nums;
	int size;
	
	//생성자
	public intList() {
			nums = new int[3];	
			size = 0;
	}
	
	public void add(int num) {
		nums[size] = num;
		System.out.println(nums[size]);
		size++;
		
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		return nums[index];
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public void clear() {
		// TODO Auto-generated method stub
		nums = new int[3];
		size = 0;
	}
	
	
}

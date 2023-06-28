package com.kh.day02.loop.exercise;
import java.util.*;
public class Exercise_while {
	public static void main(String[] args)
	{
		System.out.println("테스트");
//		while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
//		입력한 수의 합을 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int sum =0;

		while(num>-1) {
			if(num !=-1) {
				num = sc.nextInt();
				sum= sum+num;
			}else if(num ==-1) {
				break;
			}	
		}System.out.print(sum+1);
	}

}

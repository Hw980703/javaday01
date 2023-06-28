package com.kh.day02.loop.exercise;
import java.util.*;
public class Exercise_while2 {
	public static void main(String[] args)
	{
		//while 문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하세요.
		
		int i=1;
		int sum =0;
		while (i<=100) {
			if (i%2 != 0) {
				sum = sum+i;
				
			} i++;
		}System.out.println(sum);
			
	}

}

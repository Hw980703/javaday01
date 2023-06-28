
package com.kh.day02.operator.exercise;
import java.util.*;

public class Exercise_Logical2 {
	public static void main(String[] args) {
		System.out.println("ㅎㅇ");
		//입력받은 문자가 대문자인지 소문자인지 확인하세요!!
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		char word  = sc.next().charAt(0);
		
		boolean result = (word =='A')
				||(word =='B')
				||(word =='C')
				||(word =='D')
				||(word =='E')
				||(word =='F')
				||(word =='G')
				||(word =='H')
				||(word =='I')
				||(word =='J')
				||(word =='K')
				||(word =='L')
				||(word =='M')
				||(word =='N')
				||(word =='O')
				||(word =='P')
				||(word =='Q')
				||(word =='R')
				||(word =='S')
				||(word =='T')
				||(word =='U')
				||(word =='V')
				||(word =='W')
				||(word =='X')
				||(word =='Y')
				||(word =='Z');
		System.out.println(result);
		// (word >='A') && (word <= 'Z');
		
		
	}

}

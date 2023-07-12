package com.kh.day13.swing.basic;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_FlowLayout extends JFrame{
	
	public Exam_FlowLayout() {
		setTitle("FlowLayOut Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		Container c = getContentPane();
		
		//수평간격(hGap)이 30, 수직간격(vGap)이 40 픽셀로 하고 LEFT로 정렬배치!!
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("multi"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		new Exam_FlowLayout();
		
		int [] arrs = {2,3,5,1,6,};
		for(int i =1; i<arrs.length-1; i++) {
			for (int j=0; j<arrs.length-1-i; j++) {
				if (arrs[j] > arrs[j+1]) {
					int temp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] =temp;
				}
			}

		}for (int i=0; i< arrs.length; i++) {
			System.out.println(arrs[i]);
		}
		System.out.println("삽입정렬 연습!!");
		
		for (int i=1; i<arrs.length; i++) {
			for (int j=i; j>0; j--) {
				if (arrs[j] < arrs[j-1]) {
					int temp = arrs[j-1];
					arrs[j-1] = arrs[j];
					arrs[j] =temp;
				}
			}
		}for (int i=0; i< arrs.length; i++) {
			System.out.println(arrs[i]);
	}

}
}

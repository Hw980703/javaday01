package com.kh.day13.swing.basic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_BorderLayout extends JFrame {
	
	public Exam_BorderLayout() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		
		//수평간격(hGap) 30, 수직간격 (vGap) 20 픽셀로 하는 Border Layout
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("Calculate"),BorderLayout.CENTER);
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("multi"),BorderLayout.EAST);
		c.add(new JButton("div"),BorderLayout.WEST);
		setTitle("Border Layout Sample");
		setSize(300,400);
		c.setBackground(Color.blue);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_BorderLayout();
		
		
	}

}

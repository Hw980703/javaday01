package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame{
	
		public Exam_ContentPane() {
			// TODO Auto-generated constructor stub
		setTitle("ContentPane과 JFrame");
		// 창에서 x를 누르면 실제로 종료하게 만드는거임!!!!!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.green);
		contentPane.setLayout(new FlowLayout());
		
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		setSize(500 , 500);
		setVisible(true);
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_ContentPane();
	}

}

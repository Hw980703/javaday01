package com.kh.day14.swing.Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Exam_JRadioButton extends JFrame{
	
	public Exam_JRadioButton() {
		
		super("JCheckBox 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("image/nomarlcherry.jpg");
		ImageIcon selectCherry = new ImageIcon("image/selectcherry.jpg");
		
		JRadioButton apple = new JRadioButton("사과", true);
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectCherry);
		
		//라디오 버튼은 1가지만 선택 되도록 해주는 버튼 그룹, input 태그의
		// name을 맞춰주는것과 같음
		ButtonGroup g = new ButtonGroup();
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(300, 250);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Exam_JRadioButton();
		

	}

}

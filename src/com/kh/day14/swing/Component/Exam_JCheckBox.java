package com.kh.day14.swing.Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Exam_JCheckBox extends JFrame {

	public Exam_JCheckBox() {
		super("JCheckBox 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon cherryIcon = new ImageIcon("image/nomarlcherry.jpg");
		ImageIcon selectCherry = new ImageIcon("image/selectcherry.jpg");
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배");
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectCherry);
		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(400, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JCheckBox();
	}

}
